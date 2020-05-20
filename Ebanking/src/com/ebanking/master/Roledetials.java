package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roledetials 
{

	@FindBy(xpath="//img[@src='images/admin_but_01.jpg']")
	WebElement Rhome;
	
	@FindBy(xpath="//input[contains(@name,'btnRoles')]")
	WebElement Nrole;
	
	
	public void home() 
	{
	Rhome.click();	
	}
	
	public void Nrol()
	{
		Nrole.click();
	}
}
