package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleston;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {

    private WebDriver driver;
    public AddProduct(){
        this.driver = DriverSingleston.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='gotostore']")//*[@id="login"]
    private WebElement btnGoToProduct;
    @FindBy(xpath = "//*[@id='see-book-Learning JavaScript Design Pattern']/a")//*[@id="login"]
    private WebElement btnNameProduct;
    @FindBy(xpath = "//button[@id='addNewRecordButton']")//*[@id="login"]
    private WebElement btnAddProduct;

    public void  addProductForm (){
        btnGoToProduct.click();
        btnNameProduct.click();
        btnAddProduct.click();
    }
    //*[@id="gotoStore"]
    //*[@id="see-book-Learning JavaScript Design Patterns"]/a
    //*[@id="addNewRecordButton"]
}
