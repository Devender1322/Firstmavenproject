package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Insta {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.instagram.com/");
	//	D.manage().window().maximize();
		D.findElement(By.partialLinkText("username")).sendKeys("devender__godara");
//	D.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("@Devender1322");
//	D.findElement(By.className("_acan _acap _acas _aj1-")).click();
		Thread.sleep(4000);
		D.close();
	}
}
