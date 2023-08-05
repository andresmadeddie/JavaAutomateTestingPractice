package com.none.carina.demo.gui.practice.demoblaze.com.component;

import com.none.carina.demo.gui.practice.demoblaze.com.LoginPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import groovy.util.logging.Log;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = "//a[text()=\"Log in\"]")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[@id='logout2']")
    private ExtendedWebElement logoutButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

    public boolean isLogoutButtonPresent() {
        return logoutButton.isElementPresent();
    }
}
