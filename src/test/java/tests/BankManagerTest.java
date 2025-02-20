package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BankManagerPage;

public class BankManagerTest extends BaseTest {
    @Test(priority = 0)
    public void testLogin() throws InterruptedException {
        BankManagerPage managerPage = new BankManagerPage(driver);
        Thread.sleep(3000);
        managerPage.clickBankManagerLogin();
        Thread.sleep(3000);

    }


    @Test(priority = 1)
    public void testAddCustomer() throws InterruptedException {
        BankManagerPage managerPage = new BankManagerPage(driver);
        managerPage.clickBankManagerLogin();
        Thread.sleep(3000);
        managerPage.clickAddCustomer();
        Thread.sleep(3000);
        managerPage.addNewCustomer("John", "Doe", "12345");
        Thread.sleep(3000);
        // Add assertions here
    }

    @Test(priority = 2)
    public void testOpenAccount() throws InterruptedException {
        BankManagerPage managerPage = new BankManagerPage(driver);
        managerPage.clickBankManagerLogin();
        managerPage.clickOpenAccount();
        managerPage.selectCustomer("Hermoine Granger");
        managerPage.selectCurrency("Dollar");
        Thread.sleep(3000);
        managerPage.submitForm();
        Thread.sleep(3000);
        // Add account opening logic and assertions
    }
    @Test(priority = 4)
    public void testCustomers() throws InterruptedException {
        BankManagerPage managerPage = new BankManagerPage(driver);
        managerPage.clickBankManagerLogin();
        managerPage.clickCustomers();
        Thread.sleep(3000);
        // Add account opening logic and assertions
    }
    @Test(priority = 4)
    public void testDeleteCustomers() throws InterruptedException {
        BankManagerPage managerPage = new BankManagerPage(driver);
        managerPage.clickBankManagerLogin();
        managerPage.clickCustomers();
        Thread.sleep(3000);
        managerPage.setSearchCustomerButton("Hermoine Granger");
        Thread.sleep(3000);
        managerPage.setDeleteCustomerButton();

        Thread.sleep(3000);


    }
}