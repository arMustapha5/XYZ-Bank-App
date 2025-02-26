package tests.BankManagerTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.bankManagerPages.BankManagerLoginPage;
import pages.utils.bankManagerPages.ViewCustomers;

@Test
public class ViewCustomerTest extends BaseTest {
    @Test(priority = 3)
    public void testCustomers() throws InterruptedException {
        BankManagerLoginPage  managerPage = new BankManagerLoginPage(driver);
        ViewCustomers viewCustomers = new ViewCustomers(driver);
        managerPage.clickBankManagerLogin();
        viewCustomers.clickCustomers();
        Thread.sleep(3000);
    }
}

