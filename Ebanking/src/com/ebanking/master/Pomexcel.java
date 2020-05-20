package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pomexcel

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
	@Test
	public void Rol() throws InterruptedException, IOException
	{
	
FileInputStream Fis=new FileInputStream("E:\\Tlp28Workspace\\Ebanking\\src\\com\\ebanking\\Testdata\\Role.xlsx");
		
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row Count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//Multiple Iterations ------ Loop
		
		for (int i=1;i<=Rc;i++) 
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rtyp=WC1.getStringCellValue();
			
		
	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.Rol();
	
	Roledetials RD=PageFactory.initElements(driver,Roledetials.class);
	RD.Nrol();
	Thread.sleep(4000);
	Rolecreation RC=PageFactory.initElements(driver,Rolecreation.class);
	RC.Rcre(Rname,Rtyp);
	Thread.sleep(4000);
	driver.switchTo().alert().accept();
	
	RD.home();
	
  }
	
	}
}