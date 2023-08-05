package com.none.carina.demo.gui.practice.automationexercise.com.component;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = "//a[text()=' Logout']")
    private ExtendedWebElement logoutButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean checkLogoutButtonIsPresent() {
        return logoutButton.isElementPresent();
    }
}
