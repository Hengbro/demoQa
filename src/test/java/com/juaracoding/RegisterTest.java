package com.juaracoding;

import com.juaracoding.drivers.DriverSingleston;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RegisterPage;
import com.juaracoding.utils.Contans;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest {
    private static WebDriver driver;
    public RegisterPage registerPage;
    @BeforeClass
    public void setUp(){
        DriverSingleston.getInstance("chrome");
        driver = DriverSingleston.getDriver();
        driver.get(Contans.URL);
        registerPage = new RegisterPage();
    }

    @AfterClass
    public void  finish(){
        DriverSingleston.delay(5);
        DriverSingleston.closeObjectInstance();
    }

    @Test
    public void testValidLogin(){
        //loginPage.loginForm("Adminn", "admin123");
        registerPage.addAcoutnlogin("Hengki", "Sarumaha", "hengki@gmail.com", "12345678");
        System.out.println("Test add account");
    }
}
