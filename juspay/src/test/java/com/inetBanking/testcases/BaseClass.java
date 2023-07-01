package com.inetBanking.testcases;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.AfterClass;
import org.testng.TestNG;
import com.inetUtilities.*;
public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String url =readconfig.getApplicationURL();
	public String password=readconfig.getPassword();
	public String emailId = readconfig.getEmailId();
	public String product = readconfig.getnameofproduct();
	public String upiID = readconfig.getUPIId();
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("inetingBanking");

@BeforeClass
public void setUp(){
	System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().getImplicitWaitTimeout();
	PropertyConfigurator.configure("log4j.properties");
	log.info("Now it will work");
	log.info("I'm ready");
	}
//	@AfterClass
//public void tearDown() throws InterruptedException {
		//Thread.sleep(5000);
	//	log.info("Test case executed successfully");
		//driver.quit();
//	}
}
