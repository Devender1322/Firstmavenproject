package com.auto.scripts;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getlink {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.google.com");
		
		D.manage().window().maximize();
		
		List <WebElement> all =  D.findElements(By.tagName("a"));
		System.out.println(all.size());
		
		for(int i=0; i>all.size(); i++)
		{
			System.out.println(all.get(i).getAttribute("zyx"));
			System.out.println(all.get(i).getText());
		}
		
		
		
		

}
}
