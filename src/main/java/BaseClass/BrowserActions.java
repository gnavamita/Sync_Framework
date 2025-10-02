package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BrowserActions extends BrowserSetUp {

    public void typingText(String locator, String textToType) {
        driver.findElement(By.name(locator)).click();
        driver.findElement(By.name(locator)).sendKeys(textToType);
        //driver.findElement(By.name("bony")).sendKeys("bony@gmail.com");
    }

    public void clickingElement(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void dropdown(String locator, String textToSelect) {
        System.out.println("Subhajit select dropdown");
    }
}

