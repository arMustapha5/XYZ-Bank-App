package pages.utils.customerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class CustomerTransactionReset extends BasePage {
    public CustomerTransactionReset(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Reset')]")
    private WebElement resetButton;


    public void TransactionReset(){
        waitForElementToBeClickable(resetButton);
        resetButton.click();
    }

}
