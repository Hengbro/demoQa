package com.juaracoding;

import com.juaracoding.drivers.DriverSingleston;
import com.juaracoding.pages.AddProduct;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Contans;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddProductTest {
    private static WebDriver driver;
    private LoginPage loginPage;
    private AddProduct addProduct;
    @BeforeClass
    public void setUp(){
        DriverSingleston.getInstance("chrome");
        driver = DriverSingleston.getDriver();
        driver.get(Contans.URL);
        loginPage = new LoginPage();
        addProduct = new AddProduct();
    }

    @AfterClass
    public void  finish(){
        DriverSingleston.delay(5);
        DriverSingleston.closeObjectInstance();
    }

    @Test
    public void testValidAddProduct(){
        loginPage.loginForm("hengki", "heNg1912@#");
        addProduct.addProductForm();
    }
}
