package com.inetBanking.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	//public String baseURL = "https://demo.guru99.com/v3/index.php ";
	
	public String username = "mngr556918";
	
	public String password = "ErubEge";
	
	public static WebDriver driver;

	
	@BeforeClass
	public void setup() throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://demo.guru99.com/v3/index.php");
		  
		 driver.manage().window().maximize();
		  	  
		 driver.wait(5000);
	}

   @AfterClass
  public void teardown()
  {
	  driver.quit();
  }
}