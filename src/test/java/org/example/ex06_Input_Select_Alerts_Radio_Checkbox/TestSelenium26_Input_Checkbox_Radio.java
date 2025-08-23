package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;


import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium26_Input_Checkbox_Radio extends CommonToAll {

    @Description("This is description")
    @Test
    public void test_HTMLTags() {

        WebDriver driver = new ChromeDriver();
        String URL="https://awesomeqa.com/practice.html";
        openBrowser(driver,URL);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Sayan");

        WebElement radioButton=driver.findElement(By.id("sex-0"));
        radioButton.click();

        WebElement checkBox= driver.findElement(By.id("//input[@id='rofession-1']"));
        checkBox.click();






        closedBrowser(driver);


    }


}
