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

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

       //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();

       //Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessFully() {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();

        //Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToBookPageSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();

        //Verify the text ‘Books’
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//div[@class= 'master-wrapper-page']//a[text()='Jewelry ']")).click();

        //Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//div[@class= 'master-wrapper-page']//a[text()='Gift Cards ']")).click();

        //Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @After
    public void tearDown() {
        closeBrowser();

    }

}
