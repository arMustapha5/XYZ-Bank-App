package pages.utils.bankManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class AddCustomer extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    private WebElement addCustomerButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    private WebElement postCodeInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public AddCustomer(WebDriver driver) {
        super(driver);
    }

    public void clickAddCustomer() {
            waitForPageLoad();
            safeClick(addCustomerButton);
            Assert.assertTrue(verifyElementPresent(firstNameInput),
                    "Add CustomerLogin form did not load properly");
    }

        public void addNewCustomer(String firstName, String lastName, String postCode) {
            // Wait for and fill each field
            safeSendKeys(firstNameInput, firstName);
            safeSendKeys(lastNameInput, lastName);
            safeSendKeys(postCodeInput, postCode);

            // Click submit and wait for success
            safeClick(submitButton);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Handle alert
            try {
                driver.switchTo().alert().accept();
            } catch (Exception e) {
                System.out.println("No alert present");
            }
        }
}
