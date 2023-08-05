package com.none.carina.demo.practice.saucedemo.com;

import com.none.carina.demo.gui.practice.saucedemo.com.HomePage;
import com.none.carina.demo.gui.practice.saucedemo.com.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPractice implements IAbstractTest {

    @Test
    public void loginTest() {
        LoginPage loginPage  = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        HomePage homePage = loginPage.clickLoginButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }
}
