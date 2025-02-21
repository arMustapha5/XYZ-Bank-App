package tests.BankManagerTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.utils.bankManagerPages.BankManagerLoginPage;

@Test
public class BankManagerLoginPageTest extends BaseTest {

    @Test(priority = 0)
    public static void clickBankManagerLogin() throws InterruptedException {
        BankManagerLoginPage managerPage = new BankManagerLoginPage(driver);
        Thread.sleep(3000);
        managerPage.clickBankManagerLogin();
        Thread.sleep(3000);
    }


}
