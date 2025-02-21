package tests.BankManagerTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.bankManagerPages.BankManagerLoginPage;
import pages.utils.bankManagerPages.SearchCustomer;
import pages.utils.bankManagerPages.ViewCustomers;

@Test
public class SearchCustomerTest extends BaseTest {

    @Test(priority = 5)
    public void testSearchCustomers() throws InterruptedException {
        BankManagerLoginPage managerPage = new BankManagerLoginPage(driver);
        ViewCustomers viewCustomers = new ViewCustomers(driver);
        SearchCustomer searchCustomers = new SearchCustomer(driver);
        managerPage.clickBankManagerLogin();
        viewCustomers.clickCustomers();
        Thread.sleep(3000);
        searchCustomers.setSearchCustomerButton("Hermoine");
        Thread.sleep(3000);
    }
}
