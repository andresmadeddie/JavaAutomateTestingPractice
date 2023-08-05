package com.none.carina.demo.practice.automationexercise.com;

import com.none.carina.demo.gui.practice.automationexercise.com.HomePage;
import com.none.carina.demo.gui.practice.automationexercise.com.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPractice implements IAbstractTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUsername("a@d");
        loginPage.typePassword("a@d");
        HomePage homePage = loginPage.clickLoginButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        Assert.assertTrue(homePage.getHeader().checkLogoutButtonIsPresent(), "User is not logged");
    }
}
