package com.ebanking.master;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{
     @BeforeMethod
	public void xyz()
	{
	Assert.assertEquals("Selenium","Selenium");	
	}
	
	@Test
	public void abc()
	{
		Assert.assertEquals("TestNg","TestNg");		
	}
	@Test
	public void bcd()
	{
		Assert.assertEquals("TestNg123","TestNg123");		
	}
	
	@AfterMethod
	public void pqr()
	{
		Assert.assertEquals("Manual","Manual");	
	}
	
}
