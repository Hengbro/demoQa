package com.juaracoding.drivers;

import com.juaracoding.drivers.Strategy.DriverStrategy;
import com.juaracoding.drivers.Strategy.DriverStrategyImplementer;
import com.juaracoding.utils.Contans;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleston {
    public static DriverSingleston instance=null;
    private static WebDriver driver;

    public DriverSingleston(String driver){
        instantiate(driver);
    }

    public WebDriver instantiate(String strategy){
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Contans.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static DriverSingleston getInstance(String driver){
        if(instance == null){
            instance = new DriverSingleston(driver);
        }
        return  instance;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }

    public static void delay(int seconds) {
        long milliseconds = seconds * 1000L;
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // Tangani eksepsi jika terjadi gangguan saat tidur.
            e.printStackTrace();
        }
    }
}
