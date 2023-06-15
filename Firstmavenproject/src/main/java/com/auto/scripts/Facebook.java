package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.facebook.com/");
		D.manage().window().maximize();
		D.findElement(By.id("email")).sendKeys("deven133@yandex.com");
		D.findElement(By.id("pass")).sendKeys("@Pubg1322@");
		D.findElement(By.name("login")).click();
//		Thread.sleep(4000);
//		D.close();
	}
}
