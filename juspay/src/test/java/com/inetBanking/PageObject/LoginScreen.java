package com.inetBanking.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestNG;
import org.openqa.selenium.By;

public class LoginScreen {
	WebDriver ldriver;
	public LoginScreen(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[13]/div[2]/a[1]/span[1]")
	@CacheLookup
		WebElement signupbox;
	@FindBy(id ="ap_email")
	@CacheLookup
		WebElement emailbox;
	@FindBy(id = "continue")
	@CacheLookup
		WebElement contiueButton;
	@FindBy (id ="ap_password")
	@CacheLookup
		WebElement passwordBox;
	@FindBy(id = "signInSubmit")
	@CacheLookup
		WebElement signupButton;
	
	public void setUsermail(String mailname){
		signupbox.click();
		emailbox.sendKeys(mailname);
		contiueButton.click();
	}
	public void setPassWord(String emailID) {
		passwordBox.sendKeys(emailID);
		signupButton.click();
	}
	
	
}
