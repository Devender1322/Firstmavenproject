package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStonepage {
	private WebDriver dr;
public BlueStonepage(WebDriver d){
	
	dr = d ;
	
	PageFactory.initElements(dr, this);
	
}
 	@FindBy(xpath=("//a[text()='Watch Jewellery ']")) WebElement WatchJewe;
 	@FindBy (xpath = ("//a[text()='Charm']")) WebElement Charm;
 	@FindBy (xpath = ("//span[text()='Price']")) WebElement Price;
 	@FindBy(xpath = ("//span[@class='prcs-dlh']")) WebElement Below;
 	@FindBy(xpath = ("//span[@class='WebRupee']")) WebElement RemoveRf;	
 	@FindBy(xpath = ("//a[@title='Band']")) WebElement Band;
 	@FindBy(xpath = ("//section[@id='Delivery Time-form']/span/span")) WebElement Delivery;
 	@FindBy(xpath = ("//span[@data-tagcategory='Delivery Time']']")) WebElement Deliverytime;
 	@FindBy(xpath = ("//span[text()='Next Day Delivery']")) WebElement RemoveNF;	
 	@FindBy(xpath = ("//a[@title='Pin']")) WebElement Pin;
 	@FindBy(xpath = ("//span[text()='Offers']")) WebElement Offers;
 	@FindBy(xpath = ("//span[@data-displayname='10% Making Charge Off']")) WebElement makingcharge;
 	@FindBy(xpath = ("//span[text()='10% Making Charge Off']")) WebElement RemoveOF;
// 	@FindBy(xpath = ("//span[@class='prcs-dlh']")) WebElement Below;
 	
 	//Test-case 1
 	public void HoverWatch() {
 		Actions A = new Actions(dr);
 		A.moveToElement(WatchJewe).perform();
 	}
 	
	//Test-case 1.1
 	public void ClickCharm() {
 		Charm.click();
 	}
 	public void HoverPrice() {
 		Actions A2 = new Actions(dr);
 		A2.moveToElement(Price).build().perform();
 	}
 	public void ClickBelow() {
 		Below.click();
 	}
 	public void ClickRemoveRF() {
 		RemoveRf.click();
 	}
 	
	//Test-case 1.2
 	public void ClickBand() {
 		Band.click();
 	}
 	
 	public void HoverDelivery() {
 		Actions A3 = new Actions(dr);
 		A3.moveToElement(Delivery).perform();
 	}
 	public void ClickDeliver() {
 		Deliverytime.click();
 	}

 	public void ClickRemoveNF() {
 		RemoveNF.click();
 	}

 	//Test-case 1.3
 	public void ClickPin() {
 		Pin.click();
 	}
 	public void HoverOffer() {
 		Actions A4 = new Actions(dr);
 		A4.moveToElement(Offers).perform();
 	}
 	
 	public void ClickMaking() {
 		makingcharge.click();
 	}
 	
 	public void ClickRemoveOF() {
 		RemoveOF.click();
 	}
 	
 	
 	
}
