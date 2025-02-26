package pages.utils.bankManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SearchCustomer extends BasePage {
    public SearchCustomer(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder = 'Search Customer']")
    private WebElement searchCustomerButton;

    public void setSearchCustomerButton(String customerName) {
        waitForPageLoad();
        searchCustomerButton.click();
        safeSendKeys(searchCustomerButton, customerName);
    }

}
