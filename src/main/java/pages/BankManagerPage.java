package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

public class BankManagerPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    private WebElement addCustomerButton;

    @FindBy(xpath = "//input[@placeholder = 'Search Customer']")
    private WebElement searchCustomerButton;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement deleteCustomerButton;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    private WebElement openAccountButton;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    private WebElement customersButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    private WebElement postCodeInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//button[@type='Process']")
    private WebElement processButton;

    @FindBy(css = ".alert.alert-success")
    private WebElement successAlert;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement bankManagerLoginButton;

    @FindBy(id = "userSelect")
    private WebElement customerSelect;

    @FindBy(id = "currency")
    private WebElement currencySelect;

    public BankManagerPage(WebDriver driver) {
        super(driver);
    }

    public void clickBankManagerLogin() {
        waitForPageLoad();
        waitForElementToBeClickable(bankManagerLoginButton);
        bankManagerLoginButton.click();
        wait.withTimeout(Duration.ofSeconds(5));
    }

    public void clickAddCustomer() {
        waitForPageLoad();
        safeClick(addCustomerButton);
        // Verify the form is loaded
        Assert.assertTrue(verifyElementPresent(firstNameInput),
                "Add Customer form did not load properly");
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

    public void clickOpenAccount() {
        waitForPageLoad();
        safeClick(openAccountButton);
        // Add verification for account form loading
    }

    public void clickCustomers() {
        waitForPageLoad();
        safeClick(customersButton);
    }
    public void setSearchCustomerButton(String customerName) {
        waitForPageLoad();
        searchCustomerButton.click();
        safeSendKeys(searchCustomerButton, customerName);
    }
    public void setDeleteCustomerButton() {
        waitForPageLoad();
        deleteCustomerButton.click();
    }

    public void selectCustomer(String customerName) {
        waitForElementToBeVisible(customerSelect);
        customerSelect.sendKeys(customerName);
    }

    public void selectCurrency(String currency) {
        waitForElementToBeVisible(currencySelect);
        currencySelect.sendKeys(currency);
        // Add customer selection logic
    }

    public void submitForm() {
        currencySelect.submit();
    }
}
