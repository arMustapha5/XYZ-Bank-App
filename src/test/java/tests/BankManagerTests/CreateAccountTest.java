package tests.BankManagerTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.bankManagerPages.BankManagerLoginPage;
import pages.utils.bankManagerPages.CreateAccount;

@Test
public class CreateAccountTest extends BaseTest {
    @Test(priority = 2)
    public void testOpenAccount() throws InterruptedException {
        BankManagerLoginPage managerPage = new BankManagerLoginPage(driver);
        CreateAccount createAccount = new CreateAccount(driver);

        managerPage.clickBankManagerLogin();
       createAccount.clickOpenAccount();
        createAccount.selectCustomer("Hermoine Granger");
        createAccount.selectCurrency("Dollar");
        Thread.sleep(3000);
       createAccount.submitForm();
        Thread.sleep(3000);
    }
}
