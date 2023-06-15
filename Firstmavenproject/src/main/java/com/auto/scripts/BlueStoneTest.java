package com.auto.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class BlueStoneTest {
	WebDriver Driver;
	
	@BeforeMethod
	
	public void FirstTest()  {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		
		Driver.get("https://www.bluestone.com");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//*[@id='denyBtn']")).click();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	
	public void Test1() {
		BlueStonepage BP = new BlueStonepage(Driver);
		BP.HoverWatch();
		BP.ClickCharm();
		BP.HoverPrice();
		BP.ClickBelow();
	}
	@Test
	
	
	@AfterMethod
	
	public void closebr() {
		Driver.close();
	}

}
