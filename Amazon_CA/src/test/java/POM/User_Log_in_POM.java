package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class User_Log_in_POM extends BaseClass
{
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement HelloSignIn;
	@FindBy(id="ap_email") WebElement userid;
	@FindBy(id="continue") WebElement continue1;
	@FindBy(id="ap_password") WebElement pswd;
	@FindBy(id="signInSubmit") WebElement continue2;
	
    public User_Log_in_POM()
    {
      PageFactory.initElements(driver,this);
    }
    
    public void SignInBtn() {
		HelloSignIn.click();}
    
    public void AddName(String Uname) {
    	userid.sendKeys(Uname);}
    
    public void clicContinueBtn1() {
    	continue1.click();}
    
    public void Addpswd(String Upswd) {
    	pswd.sendKeys(Upswd);}
    
    public void clicContinueBtn2() {
    	continue2.click();
    
  
	}
    
}
