package tests.CustomersTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.utils.customerPages.CustomerLogin;
import pages.utils.customerPages.CustomerWithdrawal;

public class CustomerWithdrawalTest extends BaseTest {
    @Test(priority = 4)
    public void testWithdrawal() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerWithdrawal customerWithdrawal = new CustomerWithdrawal(driver);

        customerLogin.clickCustomerLogin();
        customerLogin.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerWithdrawal.withdraw(String.valueOf(50));
        Thread.sleep(3000);
        Thread.sleep(3000);
        customerWithdrawal.withdraw("50");
    }
}
