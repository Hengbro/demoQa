package com.juaracoding.drivers.Strategy;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStategy(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
           //case "frirefox":
                //return new Firefox();
            default:
                return null;
        }
    }
}
