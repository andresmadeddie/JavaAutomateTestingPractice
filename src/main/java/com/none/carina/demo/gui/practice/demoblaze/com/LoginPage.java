package com.none.carina.demo.gui.practice.demoblaze.com;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@id=\"loginusername\"]")
    private ExtendedWebElement usernameField;

    @FindBy(xpath = "//input[@id=\"loginpassword\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//button[text()=\"Log in\"]")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);

        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(loginButton);
    }

    public void typeUsername(String username) {
        usernameField.type(username);
    }

    public void typePassword(String password) {
        passwordField.type(password);
    }

    public void clickLogInButton() {
        loginButton.click();
    }
}