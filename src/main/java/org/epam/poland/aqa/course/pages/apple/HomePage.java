package org.epam.poland.aqa.course.pages.apple;

import org.epam.poland.aqa.course.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy (xpath = "//a[@data-analytics-title=\"bag\"]")
    private WebElement shopButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage openLoginPage() {
        shopButton.click();
        

        return PageFactory.initElements(driver, LoginPage.class);
    }



}
