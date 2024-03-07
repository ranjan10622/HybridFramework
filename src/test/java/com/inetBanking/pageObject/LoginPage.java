package com.inetBanking.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
	PageFactory.initElements(driver,this);
	

}
	
	@FindBy(name="uid")
	
       WebElement txtUserName;
	
	@FindBy(name="password")
	
	 WebElement txtPassword;
	
	@FindBy(name ="btnLogin")
	
	 WebElement blogin;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		blogin.click();
	}
}