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
 	
 	public void HoverWatch() {
 		Actions A = new Actions(dr);
 		A.moveToElement(WatchJewe).perform();
 	}
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







}
