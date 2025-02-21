package pages.utils.bankManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class CreateAccount extends BasePage {
    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    private WebElement openAccountButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(id = "userSelect")
    private WebElement customerSelect;

    @FindBy(id = "currency")
    private WebElement currencySelect;

    public void clickOpenAccount() {
        waitForPageLoad();
        safeClick(openAccountButton);
    }

    public void selectCustomer(String customerName) {
        waitForElementToBeVisible(customerSelect);
        customerSelect.sendKeys(customerName);
    }

    public void selectCurrency(String currency) {
        waitForElementToBeVisible(currencySelect);
        currencySelect.sendKeys(currency);
    }

    public void submitForm() {
        currencySelect.submit();
    }
}

