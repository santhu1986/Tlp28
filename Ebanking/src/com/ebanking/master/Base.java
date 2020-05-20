package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
	
	Library LB=new Library();
  
  @BeforeTest
  public void beforeTest() 
  {
  LB.Adminlgn("Admin","M1ndq");
  }

  @AfterTest
  public void afterTest() 
  {
  LB.admlgt();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  LB.OpenApp("http://183.82.100.55/Ranford2");
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Appc();
  }

}
