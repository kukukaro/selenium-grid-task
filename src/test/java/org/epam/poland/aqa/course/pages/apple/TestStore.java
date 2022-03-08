package org.epam.poland.aqa.course.pages.apple;

import org.epam.poland.aqa.course.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;


public class TestStore {

    private WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setUp(String browser) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        driver = new RemoteWebDriver(new URL(Constants.SELENIUM_GRID_URL), capabilities);
    }

    @Test
    public void shouldOpenStorePage() {
        HomePage homePage = new HomePage(driver);
        homePage.openStorePage();
    }

}
