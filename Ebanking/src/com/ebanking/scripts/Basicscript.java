package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException
	{
		
		String Expval="ranford Bank";
	
		//Launch firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//URL
		
		driver.get("http://183.82.100.55/ranford2");

		//Maximise
		
		driver.manage().window().maximize();
		
		String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		System.out.println(driver.getTitle());
		
		//Comparision
		
		if (Expval.equals(Actval)) 
		{
		System.out.println("Ranford Application Launch");	
		}
		else
		{
			System.out.println("Ranford Application Not Launch");
		}
		
		//Admin Login
		
		Expval="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.id("login")).click();
		
		
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
				
		
		
		//Branch Creation
		
	    Expval="Sucessfully";
				
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
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
		//Home button
		
		
		
		
		
		
		
		
		//Rolecreation
		//Emp creation
		//Logout
		//Banker Login
		//Logout
		//Close
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
