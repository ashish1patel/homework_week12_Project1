package testsuite;
/*
Create the package ‘testsuite’ and create the
following classes inside the ‘testsuite’ package.
1. LoginTest
2. TopMenuTest
3. RegisterTest
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on login link
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Login’ link
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //Enter valid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prime1233@gmail.com");

        //Enter valid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("prime123");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on the ‘Login’ link
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //Enter invalid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prime321@gmail.com");

        //Enter invalid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("prime321");

        //Click on Login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        /*Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/
        String expectedText = "‘Login was unsuccessful.\n" +
                "Please correct the errors and try again. No customer account found’";
        String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @After
    public void tearDown() {
        //  closeBrowser();
    }
}

