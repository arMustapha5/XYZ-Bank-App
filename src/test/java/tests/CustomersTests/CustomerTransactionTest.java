package tests.CustomersTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.utils.customerPages.CustomerLogin;
import pages.utils.customerPages.CustomerTransaction;

@Test
public class CustomerTransactionTest extends BaseTest {

    @Test(priority = 1)
    public void testTransactions() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerTransaction customerTransaction = new CustomerTransaction(driver);
        customerLogin.clickCustomerLogin();
        Thread.sleep(3000);
        customerLogin.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerTransaction.transactions();
        Thread.sleep(3000);
    }
}

