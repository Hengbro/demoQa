package com.juaracoding.drivers.Strategy;

import com.juaracoding.utils.Contans;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements  DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        String path = Contans.urlChrome;
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }
}
