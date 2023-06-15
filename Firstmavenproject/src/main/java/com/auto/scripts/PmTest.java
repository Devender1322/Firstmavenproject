package com.auto.scripts;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PmTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Dr = new ChromeDriver();
		
		PmPage Pm = new PmPage(Dr);
		
		Dr.get("https:/www.saucedemo.com");
		Pm.Enterusername("standard_user");
		Pm.EnterPWname("secret_sauce");
		Pm.Enterlogin();
		
		
	}

}
