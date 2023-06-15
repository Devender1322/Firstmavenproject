package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownprcatice {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		D.manage().window().maximize();
//		D.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		
		WebElement d = D.findElement(By.className("col-lg-3"));
		
		Select S = new Select(d);
		
		
		S.selectByIndex(1);
		S.selectByValue("Google");
		S.selectByVisibleText("Google");
		
		WebElement a = D.findElement(By.xpath("//*[@id=\"animals\"]"));
		
		Select q = new Select(a);
		
		
		q.selectByIndex(1);
		q.selectByValue("avatar");
		q.selectByVisibleText("Avatar");
		
}


}
