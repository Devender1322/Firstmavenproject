package com.auto.scripts;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sugarcrm {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.sugarcrm.com/au/request-demo/");
		
		D.manage().window().maximize();
		D.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		
		WebElement d = D.findElement(By.name("form-group"));
		
		Select S = new Select(d);
		
		
		S.selectByIndex(2);
		S.selectByValue("level1");
		S.selectByVisibleText("1-10 employees");
}

}
