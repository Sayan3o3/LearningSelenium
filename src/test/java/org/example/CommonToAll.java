package org.example;

import org.openqa.selenium.WebDriver;

public class CommonToAll {
    public WebDriver driver;
    public static void openBrowser(WebDriver driver,String url){
        driver.get(url);
    }
    public static void closedBrowser(WebDriver driver){
        driver.quit();
    }
}
