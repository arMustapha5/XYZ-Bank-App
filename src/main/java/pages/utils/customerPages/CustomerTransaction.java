package pages.utils.customerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class CustomerTransaction extends BasePage {
    public CustomerTransaction(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Transactions')]")
    private WebElement transactionButton;

    public void transactions() {
        waitForElementToBeClickable(transactionButton);
        transactionButton.click();
    }

}
