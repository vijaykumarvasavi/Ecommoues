package Pomropogitary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	public Addtocart(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	 
	
		
	public WebElement getIphone() {
		return laptop;
	}

	public WebElement getWelcometext() {
		return welcometext;
	}

	public WebElement getAddquatity() {
		return addquatity;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getAddsucess() {
		return addsucess;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCartview() {
		return cartview;
	}

	public WebElement getChechout() {
		return chechout;
	}

	public WebElement getContitueBt() {
		return contitueBt;
	}


	@FindBy(xpath="//img[@title='MacBook']")
	private WebElement laptop;
	
	@FindBy(xpath="//div[@id='logo']")
	private WebElement welcometext;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement addquatity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement addsucess;
	
	@FindBy(xpath="//div[@id='cart']")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement cartview;
	
	@FindBy(xpath="//div[@class='pull-right']")
	private WebElement chechout;
	
	@FindBy(xpath="//input[@id='button-account']")
	private WebElement contitueBt;
	
	
		
	
	
	
	
	
	
}
