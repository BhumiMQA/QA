package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POM.CreateACCPOM;

public class CreateACC extends BaseClass {
	CreateACCPOM accpom;

	public CreateACC() {
		super();
	}

	@BeforeMethod
	public void initsetup() throws InterruptedException {
		initiantion();
		accpom = new CreateACCPOM();
	}

	@Test(priority = 1)
	public void accountLogIn() throws InterruptedException {
		accpom.SignInBtn();
		Thread.sleep(3000);

		accpom.Accbtn();
		Thread.sleep(3000);

		accpom.AddName(prop.getProperty("username"));
		accpom.Addmail(prop.getProperty("email"));
		accpom.Addpswd(prop.getProperty("password"));
		accpom.Addagpswd(prop.getProperty("password"));
		accpom.clicContinueBtn();
		Thread.sleep(3000);

		if (driver.getTitle().equals("Amazon Sign In")) 
		{ 
			Assert.assertTrue(true); }
	    else { Assert.assertTrue(false); }
       
		
	}
	
	@Test(priority = 2)
	public void accountLogInmob() throws InterruptedException {
		accpom.SignInBtn();
		Thread.sleep(3000);

		accpom.Accbtn();
		Thread.sleep(3000);

		accpom.AddName(prop.getProperty("username"));
		accpom.Addmail(prop.getProperty("mobile"));
		accpom.Addpswd(prop.getProperty("password"));
		accpom.Addagpswd(prop.getProperty("password"));
		
		accpom.clicContinueBtn();
		Thread.sleep(3000);

	}
    @AfterMethod
    public void quit()
     {
    	screenshot("accountLogIn");
    	driver.quit();
     }

}
