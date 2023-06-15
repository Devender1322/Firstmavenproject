package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w3school {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.w3schools.com/");
		D.manage().window().maximize();
		D.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[1]/a[2]")).click();
		D.findElement(By.xpath("//*[@id=\"my-video\"]/button")).click();
		
}
}