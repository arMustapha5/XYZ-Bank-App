package tests.BankManagerTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.bankManagerPages.BankManagerLoginPage;
import pages.utils.bankManagerPages.DeleteAccount;
import pages.utils.bankManagerPages.SearchCustomer;
import pages.utils.bankManagerPages.ViewCustomers;

@Test
public class DeleteAccountTest extends BaseTest {


    @Test(priority = 5)
    public void testDeleteCustomer() throws InterruptedException {

        BankManagerLoginPage managerPage = new BankManagerLoginPage(driver);
        ViewCustomers viewCustomers = new ViewCustomers(driver);
        SearchCustomer searchCustomers = new SearchCustomer(driver);
        DeleteAccount deleteAccount = new DeleteAccount(driver);
        managerPage.clickBankManagerLogin();

        viewCustomers.clickCustomers();
        Thread.sleep(3000);
        searchCustomers.setSearchCustomerButton("Hermoine");
        Thread.sleep(3000);
        deleteAccount.setDeleteCustomerButton();
        Thread.sleep(3000);
    }

}
