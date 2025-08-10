package org.example.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {
    @Test
    public void test_code(){

        Assert.assertEquals("Sayan","Sayan");
    }
    @Test
    public void test_OpenVWOLoginPage(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.quit();
    }
}
