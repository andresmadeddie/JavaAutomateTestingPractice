package com.none.carina.demo.practice.orangehrmlive.com;

import com.none.carina.demo.gui.practice.orangehrmlive.com.HomePage;
import com.none.carina.demo.gui.practice.orangehrmlive.com.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPractice implements IAbstractTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUsername("Admin");
        loginPage.typePassword(R.TESTDATA.get("password"));
        HomePage homePage = loginPage.clickLoginButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }
}
