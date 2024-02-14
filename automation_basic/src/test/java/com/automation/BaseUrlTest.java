package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseUrlTest extends BaseDriver {
	
	String url ="https://www.boibazar.com/";
	
	@Test
	public void OpenUrl() throws InterruptedException {
		driver.get(url);	
        driver.manage().window().maximize();
		Thread.sleep(5000); // 1000 = 1sec
		String title=driver.getTitle();
		String expected="Online Book Shop in Bangladesh - Buy Books Online at BoiBazar.com";
        Assert.assertEquals(title, expected, "Text does not match the expected value.");
		
		}

}
