package tests.BankManagerTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.bankManagerPages.AddCustomer;
import pages.utils.bankManagerPages.BankManagerLoginPage;

@Test
public class AddCustomerTest extends BaseTest {
    @Test(priority = 1)
    public void testAddCustomer() throws InterruptedException {
        BankManagerLoginPage managerPage = new BankManagerLoginPage(driver);
        AddCustomer addCustomer = new AddCustomer(driver);

        managerPage.clickBankManagerLogin();
        Thread.sleep(3000);
        addCustomer.clickAddCustomer();
        Thread.sleep(3000);
        addCustomer.addNewCustomer("Abdul", "Mustapha", "12345");
        Thread.sleep(3000);


    }

}