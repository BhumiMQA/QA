package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class User_Address_POM extends BaseClass
{
	@FindBy(xpath = "//h2[contains(text(),'Your Addresses')]") WebElement addList; 
	@FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]") WebElement addressadd; 
	@FindBy(id = "address-ui-widgets-enterAddressFullName") WebElement fullName; 
	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber") WebElement phone; 
	@FindBy(id = "address-ui-widgets-enterAddressLine1") WebElement address; 
	@FindBy(id = "address-ui-widgets-enterAddressCity") WebElement city; 
	@FindBy(id = "address-ui-widgets-enterAddressPostalCode") WebElement code; 
	@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion") WebElement pro; 
	@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8") WebElement pro8; 
	@FindBy(id = "address-ui-widgets-use-as-my-default") WebElement def; 
	@FindBy(id = "address-ui-widgets-form-submit-button") WebElement con; 
	
	
    public User_Address_POM()
    {
      PageFactory.initElements(driver,this);
    }
    public void addressclick() {
    	addList.click();}
   
    public void addclick() {
    	addressadd.click();}
    
    public void AddName(String Uname) {
    	fullName.sendKeys(Uname);}
    
    public void Addphone(String num) {
    	phone.sendKeys(num);}
    
    public void Adddre(String address1) {
    	address.sendKeys(address1);}
    
    public void Addcity(String addcity) {
    	city.sendKeys(addcity);}
    
    public void Addcode(String pcode) {
    	code.sendKeys(pcode);}
    
    public void Addpro() 
    {
    	pro.click();
    	pro8.click();}
    
    public void adddef() {
    	def.click();}
    
    public void countin() {
    	con.click();}
    
}
