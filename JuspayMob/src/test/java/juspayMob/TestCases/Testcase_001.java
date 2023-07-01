package juspayMob.TestCases;
import org.testng.annotations.Test;
import org.testng.Assert;

import juspayMob.PageObject.*;

public class Testcase_001 extends Baseclasscheck {
    @Test
    public void mail() {
        FlipKart test1 = new FlipKart(driver);
		test1.flipKart(productof, driver);
		Assert.assertTrue(true);
    }
    @Test
    public void order(){
    	FlipKart test2 = new FlipKart(driver);
    	test2.chosing(cards, mm, yy, cvv);
    	
    }
}
