package com.none.carina.demo.practice.demoblaze.com;

import com.none.carina.demo.gui.practice.demoblaze.com.BasePage;
import com.none.carina.demo.gui.practice.demoblaze.com.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPractice implements IAbstractTest {

    @Test
    public void loginTest() {
        BasePage basePage = new BasePage(getDriver());
        basePage.open();
        Assert.assertTrue(basePage.isPageOpened(), "Base page is not opened");
        LoginPage loginPage =  basePage.getHeader().clickLoginButton();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUsername("habla");
        loginPage.typePassword("habla");
        loginPage.clickLogInButton();
        Assert.assertTrue(basePage.getHeader().isLogoutButtonPresent(), "User did not login");
    }
}