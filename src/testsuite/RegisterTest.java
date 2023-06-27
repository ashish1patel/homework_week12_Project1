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

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setBaseUrl() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void verifyUserShouldRegisterAccountSuccessfully() throws InterruptedException {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Click on Gender radio button
        driver.findElement(By.xpath("//input[@type = 'radio' and @value = 'M']")).click();

        //Enter the First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ashish");

        //Enter the Last Name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Patel");

        //Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("March");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1986");

        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prime1233@gmail.com");

        //Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("prime123");

        //Enter Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("prime123");

        //Click on REGISTER button
        driver.findElement(By.xpath("//button[@name='register-button']")).click();

        //Verify the text 'Your registration completed'
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);


        Thread.sleep(5000);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}