package juspayMob.TestCases;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Baseclasscheck {
    static String appiumServerURL = "http://192.168.1.8:4723/wd/hub";
    public AppiumDriver driver;
    public String productof = "light";
    public String cards = "123412346";
    public String mm = "15";
    public String yy = "6";
    public String cvv = "789";
    @SuppressWarnings("deprecation")
	@BeforeClass
    public void setUp() {
        // Set desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");

        try {
            driver = new AndroidDriver(new URL(appiumServerURL), capabilities);
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize Appium driver: " + e.getMessage(), e);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
