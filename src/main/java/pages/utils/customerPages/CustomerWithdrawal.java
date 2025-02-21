package pages.utils.customerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CustomerWithdrawal extends BasePage {

    public CustomerWithdrawal(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    private WebElement withdrawalButton;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement amountInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;



    public void withdraw(String amount) {
        waitForElementToBeClickable(withdrawalButton);
        withdrawalButton.click();
        // waitForElementToBeVisible(amountInput);
        amountInput.sendKeys(amount);
        submitButton.click();
    }

}
