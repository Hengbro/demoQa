package com.juaracoding;

import com.juaracoding.drivers.DriverSingleston;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private static WebDriver driver;
    public LoginPage loginPage;
    @BeforeClass
    public void setUp(){
        DriverSingleston.getInstance("chrome");
        driver = DriverSingleston.getDriver();
        String url = "https://demoqa.com/login";
        driver.get(url);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void  finish(){
        DriverSingleston.delay(5);
        DriverSingleston.closeObjectInstance();
    }

    @Test
    public void testValidLogin(){
        //loginPage.loginForm("Adminn", "admin123");
        loginPage.loginForm("Admin", "admin123");
        //Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
        System.out.println("Test login");
    }
}
