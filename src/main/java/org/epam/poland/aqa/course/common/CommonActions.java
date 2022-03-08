package org.epam.poland.aqa.course.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.epam.poland.aqa.course.common.Constants.WINDOWS_CHROME_DRIVER;
import static org.epam.poland.aqa.course.common.Constants.WINDOWS_CHROME_DRIVER_PATH;

public class CommonActions {

    private CommonActions() {
    }

    public static WebDriver createDriver() {

        System.setProperty(WINDOWS_CHROME_DRIVER, WINDOWS_CHROME_DRIVER_PATH);
        return new ChromeDriver();

    }
}

