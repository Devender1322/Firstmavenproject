package com.auto.scripts;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waittt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver D = new ChromeDriver();
		
		D.get("https:/www.ebay.com");
		D.manage().window().maximize();
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = D.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a)"));
		
		Actions Action = new Actions(D);
		Action.moveToElement(ele).build().perform();
		D.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		

		
	}

}
