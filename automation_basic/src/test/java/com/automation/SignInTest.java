package com.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTest extends BaseDriver {

	String url ="https://www.boibazar.com/";
	
	@Test
	public void OpenSignInForm() throws InterruptedException {
		driver.get(url);	
        driver.manage().window().maximize();
		Thread.sleep(5000); // 1000 = 1sec
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		Thread.sleep(5000); // 1000 = 1sec
		
		}
}
