package pages.utils.bankManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class ViewCustomers extends BasePage {
    public ViewCustomers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    private WebElement customersButton;

    public void clickCustomers() {
        waitForPageLoad();
        safeClick(customersButton);
    }

}
