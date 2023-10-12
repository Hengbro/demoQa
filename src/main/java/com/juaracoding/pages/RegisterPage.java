package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleston;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;
    public RegisterPage(){
        this.driver = DriverSingleston.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='newUser']")//*[@id="addNewRecordButton"]"//button[@type='submit']"
    private WebElement btnAdd;
    @FindBy(xpath = "//button[@id='login']")//*[@id="login"]
    private WebElement btnLogin;
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")//*[@id="lastname"]
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='userName']")//*[@id="userName"]
    private WebElement email;
    @FindBy(xpath = "//input[@id='password']")//*[@id="password"]
    private WebElement password;

    @FindBy(xpath = "//*[@id='recaptcha-anchor']/div[4]")
    private WebElement btnRecaptcha;
    @FindBy(xpath = "//button[@id='register']")//*[@id="register"]
    private WebElement btnSubmit;

    public void  addAcoutnlogin (
            String firstName,
            String lastName,
            String email,
            String password
    ){
        btnAdd.click();
        this.firstName.sendKeys("Juara");
        this.lastName.sendKeys("Coding");
        this.email.sendKeys("juaracoding@gmail.com");
        this.password.sendKeys("12345678");
        btnRecaptcha.click();
        btnSubmit.click();
    }
}
