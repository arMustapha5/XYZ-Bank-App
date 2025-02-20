package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CustomerPage extends BasePage {
    @FindBy(id = "userSelect")
    private WebElement customerSelect;

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    private WebElement depositButton;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    private WebElement customerLoginButton;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    private WebElement withdrawalButton;

    @FindBy(xpath = "//button[contains(text(),'Transactions')]")
    private WebElement transactionButton;


    @FindBy(xpath = "//input[@type='number']")
    private WebElement amountInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//strong[@class='ng-binding']")
    private WebElement balance;

    @FindBy(xpath = "//button[contains(text(),'Reset')]")
    private WebElement resetButton;

    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    public void selectCustomer(String customerName) {
        // waitForElementToBeVisible(customerSelect);
        customerSelect.sendKeys(customerName);
        customerSelect.submit();
        // Add customer selection logic
    }
    public void transactions() {
        waitForElementToBeClickable(transactionButton);
        transactionButton.click();
    }
    public void TransactionReset(){
        waitForElementToBeClickable(resetButton);
        resetButton.click();
    }

    public void deposit(String amount) {
        //waitForElementToBeClickable(depositButton);
        depositButton.click();
        //waitForElementToBeVisible(amountInput);
        amountInput.sendKeys(amount);
        submitButton.click();
    }


    public void withdraw(String amount) {
        waitForElementToBeClickable(withdrawalButton);
        withdrawalButton.click();
        // waitForElementToBeVisible(amountInput);
        amountInput.sendKeys(amount);
        submitButton.click();
    }

    public void clickCustomerLogin(){
        waitForPageLoad();
        waitForElementToBeClickable(customerLoginButton);
        customerLoginButton.click();
        wait.withTimeout(Duration.ofSeconds(5));
    }

    public String getBalance() {
        //waitForElementToBeVisible(balance);
        return balance.getText();
    }
}
