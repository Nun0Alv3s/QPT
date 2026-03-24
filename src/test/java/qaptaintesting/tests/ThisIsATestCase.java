package qaptaintesting.tests;

import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qaptaintesting.pageobjects.LetcodeInTestPageObject;

public class ThisIsATestCase {

    protected WebDriver driver = new ChromeDriver();

    @Test
    public void ThisIsATestCase_test(){
        // Starting URL can be set here when provided, for example:
        // driver.get("http://example.com");
        driver.get("https://letcode.in/test");

        LetcodeInTestPageObject letcodeInTestPageObject = new LetcodeInTestPageObject(driver);
        letcodeInTestPageObject.clickFooterFirstLink();
    }

    @AfterTest
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }
}