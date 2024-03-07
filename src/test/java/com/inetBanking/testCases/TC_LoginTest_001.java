package com.inetBanking.testCases;


import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

    

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest()
	{
		 
		 
		 LoginPage lp = new LoginPage(driver);
		 lp.setUserName("mngr556918");
		 lp.setPassword("ErubEge");
		 lp.clickSubmit();
		 
		
	}
	

}
