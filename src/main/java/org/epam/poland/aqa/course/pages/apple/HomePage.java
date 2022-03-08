package org.epam.poland.aqa.course.pages.apple;

import org.epam.poland.aqa.course.common.Constants;
import org.epam.poland.aqa.course.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (xpath = "//a[@data-analytics-title=\"bag\"]")
    private WebElement shopButton;

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(Constants.APPLE_HOME_PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public StorePage openStorePage() {
        shopButton.click();
        return PageFactory.initElements(driver, StorePage.class);
    }



}
