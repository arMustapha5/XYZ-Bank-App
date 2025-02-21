package pages.utils.bankManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DeleteAccount extends BasePage  {
    public DeleteAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement deleteCustomerButton;

    public void setDeleteCustomerButton() {
        waitForPageLoad();
        deleteCustomerButton.click();
    }
}
