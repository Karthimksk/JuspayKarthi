package com.inetBanking.testcases;
import com.inetBanking.PageObject.*;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.Test;
public class Testcase_001 extends BaseClass{
	
@Test 
public void loginTest() {
	driver.get(url);
	LoginScreen lp = new LoginScreen(driver);
	lp.setUsermail(emailId);
	log.info("gmail id is sent");
	lp.setPassWord(password);
	log.info("contiue button is clicked");
	if(driver.getTitle().equals(" Amazon Sign In ")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertFalse(false);
	}
}
@Test
public void search() {
	searchandpurchase sp = new searchandpurchase(driver);
	sp.setSearchBar(product);
	if (driver.getTitle().equals("Amazon.in : iphone 13")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertFalse(false);
	}
	}
@Test
public void purchase() {
	searchandpurchase purchaseClick = new searchandpurchase(driver);
	purchaseClick.setPurchase(driver);
	if (driver.getTitle().equals("Amazon.in : iphone 13")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertFalse(false);
	}
}
@Test
public void checkOut() throws InterruptedException{
	
	searchandpurchase purchaseClick = new searchandpurchase(driver);
	purchaseClick.setBuy(upiID, driver);
	if (purchaseClick.setVerified().equals("Verified!"))
	{
		Assert.assertTrue(true);
	}
	else {
	Assert.assertFalse(false);
	}
}
@Test
public void OrderConfirm () {
	searchandpurchase purchaseClick = new searchandpurchase(driver);
	purchaseClick.setPayment();
	if (purchaseClick.setVerifiedAtOrder().equals("Notes"))
	{
	Assert.assertTrue(true);
	}
	else {
	Assert.assertFalse(false);
	}
}
}
