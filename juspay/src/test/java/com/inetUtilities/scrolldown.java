package com.inetUtilities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrolldown {
	private WebDriver driver;

    public void WaitUtils(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void scrollandclick(WebDriver driver, WebElement element) {
    	Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
    }
}








