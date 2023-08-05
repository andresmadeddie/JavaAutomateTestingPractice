package com.none.carina.demo.gui.practice.automationexercise.com;

import com.none.carina.demo.gui.practice.automationexercise.com.component.Header;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//div[@id='slider-carousel']")
    private ExtendedWebElement carousel;

    @FindBy(xpath = "//div[@class='header-middle']")
    private Header header;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(carousel);
    }

    public Header getHeader() {
        return header;
    }
}
