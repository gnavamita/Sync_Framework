package testcase;

import BaseClass.BrowserActions;
import BaseClass.BrowserSetUp;
import org.openqa.selenium.By;
import org.testng.annotations.*;


public class HomePageTests extends BrowserActions {

    // BrowserActions browserActions = new BrowserActions();
    // BrowserSetUp browserSetup = new BrowserSetUp();

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        browserOpen();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void closeBrowser() {
        browserClose();
    }


    @Test
    public void Request_a_Demo_Test() throws InterruptedException {
        dropdown("asdasdafdasf", "Optiasdaadfon 1");
        clickingElement(".//span[text()='Request a Demo']");
        typingText("name", "bony");
        typingText("email", "bonyghosh@gmail.com");
        typingText("phone", "8788473203");

//
//        driver.findElement(By.xpath(".//span[text()='Request a Demo']")).click();
//
//        driver.findElement(By.name("name")).sendKeys("bony");
//        driver.findElement(By.name("email")).sendKeys("bonyghosh@gmail.com");
//        driver.findElement(By.name("phone")).sendKeys("8788473203");
    }


    @Test
    public void Talk_To_Us() throws InterruptedException {
        clickingElement(".//span[text()='Talk to Us']");
        //driver.findElement(By.xpath(".//span[text()='Talk to Us']")).click();
    }

    @Test
    public void Pricing() {
        clickingElement(".//a[text()='Pricing']");
        //driver.findElement(By.xpath(".//a[text()='Pricing']")).click();
    }

    @Test
    public void Syncinns_AI() {
        clickingElement(".//a[text()='Syncinns AI']");
        //driver.findElement(By.xpath(".//a[text()='Syncinns AI']")).click();
    }

    @Test
    public void Solution() {
        clickingElement(".//div[text()='Solution']");
        //driver.findElement(By.xpath(".//div[text()='Solution']")).click();
    }

    @Test
    public void Tools() {
        clickingElement(".//div[text()='Tools']");
        // driver.findElement(By.xpath(".//div[text()='Tools']")).click();
    }

    @Test
    public void Get_a_Demo() {
        clickingElement(".//span[text()='Get a demo']");
        //driver.findElement(By.xpath(".//span[text()='Get a demo']")).click();
    }

    @Test
    public void Partner_with_us() {
        clickingElement(".//span[text()='Partner with us']");
        // driver.findElement(By.xpath(".//span[text()='Partner with us']")).click();
    }

    @Test
    public void AR() {

        driver.findElement(By.linkText("https://www.syncinns.com/ar/partner-with-us")).click();

    }


}

