package com.auto.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	public void Stagin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver D = new ChromeDriver();

		D.get("https://www.bluestone.com");
		D.manage().window().maximize();
		Thread.sleep(10);
//		D.findElement(By.id("confirmBtn")).click();
//		D.switchTo().alert().accept();
		D.findElement(By.xpath("//*[@id='denyBtn']")).click();

		WebElement Ele = D.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions A = new Actions(D);
		A.moveToElement(Ele).build().perform();
		D.findElement(By.xpath("//a[text()='Charm']")).click();
	}
}
