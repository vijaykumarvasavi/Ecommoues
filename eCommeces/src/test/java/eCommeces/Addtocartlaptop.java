package eCommeces;

import org.openqa.selenium.WebElement;

import Pomropogitary.Addtocart;

public class Addtocartlaptop extends baseclasscart {	
	
	
	    public void addtocart() throws Exception {
		
		Addtocart add = new Addtocart(driver);
		
		
		add.getIphone().click();
		Thread.sleep(2000);
		
		WebElement WELCOME = add.getWelcometext();
		String text = WELCOME.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		WebElement QUANTITY = add.getAddquatity();
		QUANTITY.clear();
		QUANTITY.sendKeys("2");
		Thread.sleep(2000);
		
		add.getAddtocart().clear();
		Thread.sleep(2000);
		
		WebElement WELCOMESECESSADD = add.getWelcometext();
		WELCOMESECESSADD.getText();
		System.out.println(WELCOMESECESSADD);
		Thread.sleep(2000);
		
		add.getCart().clear();
		Thread.sleep(2000);
		
		add.getCartview().clear();
		Thread.sleep(2000);
		
		add.getChechout().click();
		Thread.sleep(2000);
		
		add.getContitueBt().click();
		Thread.sleep(2000);
		
		
		
	    }

}
