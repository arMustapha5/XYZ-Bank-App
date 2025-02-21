package pages.utils.bankManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class BankManagerLoginPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement bankManagerLoginButton;

    public BankManagerLoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickBankManagerLogin() {
            waitForPageLoad();
            waitForElementToBeClickable(bankManagerLoginButton);
            bankManagerLoginButton.click();
            wait.withTimeout(Duration.ofSeconds(5));
    }
}