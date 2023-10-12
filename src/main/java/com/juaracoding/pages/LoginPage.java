package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleston;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleston.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='userName']")//*[@id="userName"]
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")//*[@id="password"]
    private WebElement password;
    @FindBy(xpath = "//button[@id='login']")//*[@id="login"]
    private WebElement btnLogin;

    public void  loginForm (String username, String password){
        this.username.sendKeys("hengki");
        this.password.sendKeys("heNg1912@#");
        btnLogin.click();
    }
}
