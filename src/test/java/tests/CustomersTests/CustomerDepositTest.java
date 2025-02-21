package tests.CustomersTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.customerPages.CustomerDeposit;
import pages.utils.customerPages.CustomerLogin;

public class CustomerDepositTest extends BaseTest {
    @Test(priority = 3)
    public void testDeposit() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerDeposit customerDeposit = new CustomerDeposit(driver);
        customerLogin.clickCustomerLogin();
        customerLogin.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerDeposit.deposit(String.valueOf(1000));
        Thread.sleep(3000);
        Thread.sleep(3000);
        customerDeposit.deposit("1000");
    }
}
