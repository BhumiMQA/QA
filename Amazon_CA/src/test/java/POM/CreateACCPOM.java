package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class CreateACCPOM extends BaseClass
{
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement HelloSignIn;
	@FindBy(id="createAccountSubmit") WebElement Actbtn;
	@FindBy(id="ap_customer_name") WebElement name;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="ap_password_check") WebElement Ag_password;
	@FindBy(id="continue") WebElement cont;
	
	
    public CreateACCPOM()
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void SignInBtn() {
		HelloSignIn.click();}
    
    public void Accbtn() {
    	Actbtn.click();}
    
    public void AddName(String Uname) {
		name.sendKeys(Uname);}
    
    public void Addmail(String Umail) {
    	email.sendKeys(Umail);}
    
    public void Addpswd(String pswd) {
    	password.sendKeys(pswd);}
    
    public void Addagpswd(String agpswd) {
    	Ag_password.sendKeys(agpswd);}
    
    public void clicContinueBtn() {
    	cont.click();
	}
    
}
