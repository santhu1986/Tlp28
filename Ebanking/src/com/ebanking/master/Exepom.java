package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
	
	@BeforeTest
  public void Login() throws InterruptedException {
	  
  
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.100.55/ranford2");
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.Login();
	
	}
	@Test(dataProvider="Rdata")
	public void Rol(String Rn,String Rty) throws InterruptedException
	{
	
	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.Rol();
	
	Roledetials RD=PageFactory.initElements(driver,Roledetials.class);
	RD.Nrol();
	Thread.sleep(4000);
	Rolecreation RC=PageFactory.initElements(driver,Rolecreation.class);
	RC.Rcre(Rn,Rty);
	Thread.sleep(4000);
	driver.switchTo().alert().accept();
	
	RD.home();
	
  }
	
	
	  @DataProvider
	    
	    public Object [][] Rdata()
	    {
	    	
	    	Object[][] Obj=new Object[3][2];
	    	
	    	  Obj[0][0]="Tellerabcd";
	    	  Obj[0][1]="E";
	    	  
	    	  Obj[1][0]="Managerabcd";
	    	  Obj[1][1]="E";
	    	  
	    	  Obj[2][0]="Clerkabcd";
	    	  Obj[2][1]="E";
	    	  
	    	  return Obj;
	    	}
	  
}