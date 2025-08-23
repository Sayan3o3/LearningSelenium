package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;




import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium27_Select_Static extends CommonToAll {
    @Test
    public void test_select(){

        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/dropdown";
        openBrowser(driver, URL);
        WebElement selectDropdown= driver.findElement(By.id("dropdown"));
        Select select=new Select(selectDropdown);
        select.selectByVisibleText("Option 1");

    }
}
