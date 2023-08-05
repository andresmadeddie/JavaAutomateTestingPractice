package com.none.carina.demo.gui.practice.demoblaze.com;

import com.none.carina.demo.gui.practice.demoblaze.com.component.Header;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage extends AbstractPage {

    @FindBy(xpath = "//div[@id=\"carouselExampleIndicators\"]")
    private ExtendedWebElement carousel;

    @FindBy(xpath = "//div[@id='navbarExample']")
    private Header header;

    public BasePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(carousel);
    }

    public Header getHeader() {
        return header;
    }
}
