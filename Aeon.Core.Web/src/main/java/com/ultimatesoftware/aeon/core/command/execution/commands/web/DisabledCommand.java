package com.ultimatesoftware.aeon.core.command.execution.commands.web;

import com.ultimatesoftware.aeon.core.command.execution.commands.initialization.ICommandInitializer;
import com.ultimatesoftware.aeon.core.common.Resources;
import com.ultimatesoftware.aeon.core.common.web.interfaces.IByWeb;
import com.ultimatesoftware.aeon.core.framework.abstraction.controls.web.WebControl;
import com.ultimatesoftware.aeon.core.framework.abstraction.drivers.IWebDriver;

import java.util.Locale;

/**
 * Asserts that an element is disabled.
 */
public class DisabledCommand extends WebControlCommand {

    /**
     * Initializes a new instance of the {@link DisabledCommand} class.
     *
     * @param selector           The selector.
     * @param commandInitializer The command initializer.
     */
    public DisabledCommand(IByWeb selector, ICommandInitializer commandInitializer) {
        super(String.format(Locale.getDefault(), Resources.getString("DisabledCommand_Info"), selector), selector, commandInitializer);
    }

    @Override
    protected void commandDelegate(IWebDriver driver, WebControl control) {
        driver.isElementDisabled(control);
    }
}
