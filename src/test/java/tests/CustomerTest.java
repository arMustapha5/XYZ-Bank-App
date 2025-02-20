package tests;

import base.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerPage;

public class CustomerTest extends BaseTest {
    private WebDriverWait wait;


    @Test(priority = 0)
    public void testLogin() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(driver);
        Thread.sleep(3000);
        customerPage.clickCustomerLogin();
        Thread.sleep(3000);
        customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void testTransactions() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(driver);
        customerPage.clickCustomerLogin();
        Thread.sleep(3000);
        customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerPage.transactions();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void testTransactionReset() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(driver);
        customerPage.clickCustomerLogin();
        Thread.sleep(3000);
        customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerPage.transactions();
        Thread.sleep(3000);
        customerPage.TransactionReset();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void testDeposit() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(driver);
        customerPage.clickCustomerLogin();
        customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerPage.deposit(String.valueOf(1000));
        Thread.sleep(3000);
        //  customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerPage.deposit("1000");
        // Assert.assertEquals(customerPage.getBalance(), "1000");
    }

    @Test(priority = 4)
    public void testWithdrawal() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(driver);
        customerPage.clickCustomerLogin();
        customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerPage.withdraw(String.valueOf(50)); // Replace with the amount you want to withdraw();
        Thread.sleep(3000);
        // customerPage.selectCustomer("Hermoine Granger");
        Thread.sleep(3000);
        customerPage.withdraw("50");
        //Assert.assertEquals(customerPage.getBalance(), "50");

    }
}