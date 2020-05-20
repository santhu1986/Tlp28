package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Libraryng 
  
    {
	
	WebDriver driver;
	String Expval,Actval;
	FileInputStream Fis;
    Properties Pr;	
	
	  @Test(priority=1)
		public void OpenApp() throws IOException
	{
		Fis=new FileInputStream("E:\\Tlp28Workspace\\Ebanking\\src\\com\\ebanking\\Properties\\Rep.properties");	
		Pr=new Properties();
		Pr.load(Fis);
			
		Expval="ranford Bank";
		
		//Launch firefox
		
	     driver=new FirefoxDriver();
		
		//URL
		
		driver.get("http://183.82.100.55/ranford2");

		//Maximise
		
		driver.manage().window().maximize();
		
		Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
	//	System.out.println(driver.getTitle());
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Ranford Application Launch");	
		}
		else
		{
			System.out.println("Ranford Application Not Launch");
		}

		//return "pass";
	
	}
	  @Test(priority=2)
	public void Adminlgn()
	{	
		
         Expval="Welcome to Admin";
		
		driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys("Admin");
		driver.findElement(By.id(Pr.getProperty("Pswd"))).sendKeys("M1ndq");
		driver.findElement(By.id(Pr.getProperty("Lgn"))).click();
		
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
				if (Expval.equalsIgnoreCase(Actval)) 
				{
				System.out.println("Admin Login Succ");	
				}
				else
				{
					System.out.println("Admin Login Failed");
				}
			}
	
	public void Branchcre() throws InterruptedException
	{
		

	    Expval="Sucessfully";
				
		driver.findElement(By.xpath(Pr.getProperty("Bbutton"))).click();
		driver.findElement(By.xpath("//*[@id=\"BtnNewBR\"]")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("Mindqsrhydnagar545");
		driver.findElement(By.id("txtAdd1")).sendKeys("Srnagar");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		
		//dropdown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		Select Sta=new Select(driver.findElement(By.id("lst_stateI")));
		Sta.selectByVisibleText("GOA");

		Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
		Cty.selectByVisibleText("GOA");

		driver.findElement(By.id("btn_insert")).click();
		
	Thread.sleep(4000);
		//Alert
		
	   Actval=driver.switchTo().alert().getText();
	   
	   driver.switchTo().alert().accept();
	   
	   //Comparision
	   
	   if (Actval.contains(Expval)) 
	   {
		System.out.println("Branch Created");
	}
	   else
	   {
		   System.out.println("Branch Already Exist");
	   }

	}

	
	//Rolecre

	public String Role(String RN,String RT) throws InterruptedException
	{
		Expval="Sucessfully";
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		driver.findElement(By.id("txtRname")).sendKeys(RN);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
		Thread.sleep(4000);
		String Actval=driver.switchTo().alert().getText();
		
		System.out.println(Actval);
		
		
	      driver.switchTo().alert().accept();
	      driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();  
	      if (Actval.contains(Expval)) 
	      {
	    	  System.out.println("Role Created");
	    	  
			
		}
	      else{
	    	  System.out.println("role not created");
	    	  
	      }
	      return Actval;
	     }



	
	
	//Empcre
	//Log out
	//Close
}
