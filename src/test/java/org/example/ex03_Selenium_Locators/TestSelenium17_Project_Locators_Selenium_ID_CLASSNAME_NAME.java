package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME extends CommonToAll {
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Sayan Giri")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login() {
        WebDriver driver = new ChromeDriver();
        String url = "https://app.vwo.com";
        openBrowser(driver, url);
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@gmail.com");
        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("password");
        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();
        // Step 4 - Wait some time.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement errorMmessage = driver.findElement(By.className("notification-box-description"));
        System.out.println(errorMmessage.getText());

        // Step 6, we have added the TestNG assertion to verify.
        Assert.assertEquals(errorMmessage.getText(), "Your email, password, IP address or location did not match");
        closedBrowser(driver);
    }
}
