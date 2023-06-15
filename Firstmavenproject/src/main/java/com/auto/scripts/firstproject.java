package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstproject {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver D = new EdgeDriver();
		D.get("https:/www.saucedemo.com");
		D.manage().window().maximize();
		D.findElement(By.id("user-name")).sendKeys("standard_user");
		D.findElement(By.id("password")).sendKeys("secret_sauce");
		D.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		D.close();
	}

}
