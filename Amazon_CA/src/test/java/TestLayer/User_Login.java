package TestLayer;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BasePackage.BaseClass;
import POM.User_Log_in_POM;
import utilities.TestData;

public class User_Login extends BaseClass {
	User_Log_in_POM lp;
	
	 public User_Login()
	 { 
		 super();
     }
	  
	  
	  @BeforeMethod
	  public void initsetup() throws InterruptedException 
	  {
	     initiantion();
	     lp = new User_Log_in_POM();
	  }
	  
	  @Test(dataProvider="LoginData") 
	  public void LogIn(String user,String pwd) 
	  { 
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 lp.SignInBtn();
		 lp.AddName(user);
		 lp.clicContinueBtn1();	 
	     lp.Addpswd(pwd);
	     lp.clicContinueBtn2();
	     
	     if (driver.getTitle().equals("Amazon Sign In")) 
			{ 
				Assert.assertTrue(true); }
		    else { Assert.assertTrue(false); }
	  }
	 
		 
    @DataProvider(name="LoginData")
	public Object[][] Data()
	{
    	Object result[][]=TestData.Readdata("Sheet1");
    	return result;
	}

    
    @AfterMethod
    public void quit()
	{
    	screenshot("Login");
	    driver.quit();
    }
}
