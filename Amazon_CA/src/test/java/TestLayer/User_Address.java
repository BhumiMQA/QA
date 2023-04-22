package TestLayer;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POM.User_Address_POM;
import POM.User_Log_in_POM;

public class User_Address extends BaseClass
{
	User_Address_POM ad;
	User_Log_in_POM lp;
	
	 public User_Address()
	 { 
		 super();
    }
	  
	  
	  @BeforeMethod
	  public void initsetup() throws InterruptedException 
	  {
	     initiantion();
	     ad = new User_Address_POM();
	     lp = new User_Log_in_POM();
	  }
	 
	  @Test(priority = 1)
	  public void accountLogIn() throws InterruptedException 
	  {
		  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		  lp.SignInBtn();
		  lp.AddName(prop.getProperty("email"));
		  lp.clicContinueBtn1();	 
	      lp.Addpswd(prop.getProperty("password"));
	      lp.clicContinueBtn2();
	      Thread.sleep(2000);
	      
	      lp.SignInBtn();
	      ad.addressclick();
	      ad.addclick();
	      ad.AddName(prop.getProperty("username"));
	      ad.Addphone(prop.getProperty("mobile"));
	      ad.Adddre(prop.getProperty("Address"));
	      ad.Addcity(prop.getProperty("city"));
	      ad.Addpro();
	      ad.Addcode(prop.getProperty("Postal"));
	      ad.countin();
	      
	     
	      
	  }
      @AfterMethod
	  public void quit()
	  {
    	  screenshot("User_Address");
	    	driver.quit();
	  }
}
