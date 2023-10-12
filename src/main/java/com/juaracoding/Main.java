package com.juaracoding;

import com.juaracoding.drivers.DriverSingleston;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    private static WebDriver driver;
    public static void main(String[] args) {
        DriverSingleston.getInstance("chrome");
        driver = DriverSingleston.getDriver();
        String url = "https://demoqa.com/";
        driver.get(url);
        LoginPage loginPage = new LoginPage();

        loginPage.loginForm("Admin", "admin123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        DriverSingleston.delay(3);
        DriverSingleston.closeObjectInstance();
    }
}