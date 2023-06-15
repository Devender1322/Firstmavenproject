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
	
	public void FirstTest() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		
		Driver.get("https://www.bluestone.com");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Driver.findElement(By.xpath("//*[@id='denyBtn']")).click();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority = 1)
	
	public void Test1() throws InterruptedException {
		BlueStonepage BP = new BlueStonepage(Driver);
		BP.HoverWatch();
		Thread.sleep(3000);
		BP.ClickCharm();
		Thread.sleep(3000);
		BP.HoverPrice();
		Thread.sleep(3000);
		BP.ClickBelow();
		Thread.sleep(3000);
		BP.ClickRemoveRF();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void Test2() throws InterruptedException {
		BlueStonepage BP = new BlueStonepage(Driver);
		BP.HoverWatch();
		Thread.sleep(3000);
		BP.ClickBand();
		Thread.sleep(3000);
		BP.HoverDelivery();
		Thread.sleep(3000);
		BP.ClickDeliver();
		Thread.sleep(3000);
		BP.ClickRemoveNF();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void Test3() throws InterruptedException {
		BlueStonepage BP = new BlueStonepage(Driver);
		Thread.sleep(3000);
		BP.HoverWatch();
		Thread.sleep(3000);
		BP.ClickPin();
		Thread.sleep(3000);
		BP.HoverOffer();
		Thread.sleep(3000);
		BP.ClickMaking();
		Thread.sleep(3000);
		BP.ClickRemoveOF();
		Thread.sleep(3000);
	}
	
	
	
	
	@AfterMethod
	
	public void closebr() {
		Driver.close();
	}

}
