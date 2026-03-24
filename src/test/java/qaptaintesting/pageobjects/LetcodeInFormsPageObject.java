package qaptaintesting.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetcodeInFormsPageObject {
    protected WebDriver driver;

    // Objects
    @FindBy(xpath = "//*[@id='firstname']")
    protected WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='lasttname']")
    protected WebElement lastNameInput;

    public LetcodeInFormsPageObject(WebDriver pDriver) {
        driver = pDriver;
        PageFactory.initElements(driver, this);
    }

    // Methods

    /**
     * Fills the first name input field with the provided value.
     *
     * @param value the first name to enter (e.g., "QualityUser123")
     */
    public void fillFirstName(String value) {
        firstNameInput.clear();
        firstNameInput.sendKeys(value);
    }

    /**
     * Fills the last name input field with the provided value.
     *
     * @param value the last name to enter (e.g., "TesterinoExample")
     */
    public void fillLastName(String value) {
        lastNameInput.clear();
        lastNameInput.sendKeys(value);
    }
}
