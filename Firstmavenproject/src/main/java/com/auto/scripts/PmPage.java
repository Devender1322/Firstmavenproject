package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PmPage {
	
	WebDriver Dr;

	public PmPage(WebDriver D)
	{
		Dr = D;
	}
	By Uname = By.id("user-name");
	By PW = By.id("password");
	By login = By.id("login-button");
	
	public void Enterusername(String Usname)
	{
		Dr.findElement(Uname).sendKeys(Usname);
	}
	
	public void EnterPWname(String pwww)
	{
		Dr.findElement(PW).sendKeys(pwww);
	}
	
	public void Enterlogin()
	{
		Dr.findElement(login).click();
	}
			
}
