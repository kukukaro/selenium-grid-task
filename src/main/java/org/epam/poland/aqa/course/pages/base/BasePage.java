package org.epam.poland.aqa.course.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.epam.poland.aqa.course.common.Config.AMAZON_CORRECT_LOGIN;
import static org.epam.poland.aqa.course.common.Config.EXPLICIT_WAIT;

public class BasePage {

    protected WebDriver driver;
    private final By userInfoLocator = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public boolean userIsLoginIn() {
        return waitElementIsVisible(driver.findElement(userInfoLocator))
                .getText()
                .contains(AMAZON_CORRECT_LOGIN);
    }

    protected WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT)
                .until(ExpectedConditions.visibilityOf(element));

        return element;
    }

    protected WebElement waitElementIsAvailable(By by) {
        return (new WebDriverWait(driver, EXPLICIT_WAIT))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
