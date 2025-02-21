package tests.CustomersTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.utils.customerPages.CustomerLogin;
import pages.utils.customerPages.CustomerTransaction;
import pages.utils.customerPages.CustomerTransactionReset;

@Test
public class CustomerTransactionResetTest extends BaseTest {
    @Test(priority = 2)
    public void testTransactionReset() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerTransaction customerTransaction = new CustomerTransaction(driver);
        CustomerTransactionReset customerTransactionReset = new CustomerTransactionReset(driver);
        customerLogin.clickCustomerLogin();
        Thread.sleep(3000);
        customerLogin.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerTransaction.transactions();
        Thread.sleep(3000);
        customerTransactionReset.TransactionReset();
        Thread.sleep(3000);
    }

}
