package qaptaintesting.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetcodeInTestPageObject {
    protected WebDriver driver;

    // Objects
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-test-site[1]/section[2]/div[1]/div[1]/div[1]/div[19]/app-menu[1]/div[1]/footer[1]/a[1]")
    protected WebElement footerFirstLink;

    public LetcodeInTestPageObject(WebDriver pDriver) {
        driver = pDriver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    /**
     * Performs a left mouse button click on the footer's first link.
     */
    public void clickFooterFirstLink() {
        footerFirstLink.click();
    }
}
