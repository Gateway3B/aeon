package com.ultimatesoftware.aeon.core.common.exceptions;

import com.ultimatesoftware.aeon.core.common.web.selectors.By;
import com.ultimatesoftware.aeon.core.framework.abstraction.controls.web.WebControl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ElementDoesNotHaveAttributeExceptionTests {

    @Mock
    WebControl webControl;

    @Test
    void testConstructor() {
        // Arrange
        when(webControl.getSelector()).thenReturn(By.cssSelector("#id.class"));

        // Act
        ElementDoesNotHaveAttributeException elementDoesNotHaveAttributeException = new ElementDoesNotHaveAttributeException(webControl, "attribute-name");

        // Assert
        assertEquals("The element with selector #id.class does not have an attribute with name \"attribute-name\".", elementDoesNotHaveAttributeException.getMessage());
    }
}