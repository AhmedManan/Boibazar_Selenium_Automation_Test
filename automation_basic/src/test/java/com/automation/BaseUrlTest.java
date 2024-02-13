package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseUrlTest extends BaseDriver {
	
	String url ="https://www.boibazar.com/";
	
	@Test
	public void OpenUrl() {
		driver.get(url);	
		String title=driver.getTitle();
		String expected="Online Book Shop in Bangladesh - Buy Books Online at BoiBazar.com";
        Assert.assertEquals(title, expected, "Text does not match the expected value.");
		
		}

}
