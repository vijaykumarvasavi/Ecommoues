package Pomropogitary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	public Register(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-payment-email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='input-payment-telephone']")
	private WebElement phonenum;
	
	@FindBy(xpath="//input[@id='input-payment-password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='input-payment-confirm']")
	private WebElement passwordconfirm;
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='input-payment-address-2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	private WebElement postcod;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	private WebElement countary;
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
	private WebElement state;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement chechbox;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement Regbutton;
	
	

}
