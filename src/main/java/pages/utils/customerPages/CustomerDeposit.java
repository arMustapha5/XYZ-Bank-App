package pages.utils.customerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class CustomerDeposit extends BasePage {
    public CustomerDeposit(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    private WebElement depositButton;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement amountInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;


    public void deposit(String amount) {
        depositButton.click();
        amountInput.sendKeys(amount);
        submitButton.click();
    }

}
