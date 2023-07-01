package com.inetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestNG;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import com.inetUtilities.*;
public class searchandpurchase {
	WebDriver ldriver;
	public searchandpurchase(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy (id = "twotabsearchtextbox")
	WebElement searchBar;
	@FindBy (id = "nav-search-submit-button")
	WebElement searchNav;	
	@FindBy (xpath = "//img[@alt='Apple iPhone 13 (128GB) - Pink']")
	WebElement selectedProduct;
	@FindBy (xpath = "//input[@id='buy-now-button']")
	WebElement buyNow;
	@FindBy (id = "pp-WEdBik-120")
	WebElement upi;
	@FindBy (id = "pp-WEdBik-108")
	WebElement upinumber;
	@FindBy (id = "ppw-widgetEvent:ValidateUpiIdEvent")
	WebElement verifyButton;
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	WebElement verifiedElement;
	@FindBy (xpath = "//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")
	WebElement usethis;
	@FindBy (xpath = "//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']")
	WebElement orderButton;
	@FindBy (xpath = "//div[@class='a-alert-content']")
	WebElement FinalVerification;
	
	public void setSearchBar(String nameOfProduct) {
		searchBar.click();
		searchBar.sendKeys(nameOfProduct);
		searchNav.click();
	}
	public void setPurchase(WebDriver driver) {
		 Actions actions = new Actions(driver);
		 actions.moveToElement(selectedProduct).click().perform();
	}
	public void setBuy (String upiID, WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(buyNow).click().perform();
		actions.moveToElement(upi).click().perform();
		upinumber.sendKeys(upiID);
		verifyButton.click();
	}
	public String setVerified() {
		String verified = verifiedElement.getAttribute("class");
		return verified;
	}
	public void setPayment() {
		usethis.click();
		orderButton.click();
		
	}
	public String setVerifiedAtOrder() {
		String verified = FinalVerification.getText();
		return verified;
	}
}
