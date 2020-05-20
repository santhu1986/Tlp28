package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecreation 
{

	
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy (id="lstRtypeN")
	WebElement Rtype;
	
	@FindBy(id="btninsert")
	WebElement Sub;
	
	
	public void Rcre(String Rn,String Rty)
	{
		Rname.sendKeys(Rn);
		//Rtype.click();
		//Rtype.sendKeys("E");
		Select Rt=new Select(Rtype);
		Rt.selectByVisibleText(Rty);
		Sub.click();
		}
}
