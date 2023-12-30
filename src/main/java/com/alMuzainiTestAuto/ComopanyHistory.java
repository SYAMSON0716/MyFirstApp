package com.alMuzainiTestAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ComopanyHistory {
	
	
	@Test
	public void alMuzainiContact() {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ".MyFirstApp\\pom.xml.exe");
		driver.get("https://www.muzaini.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text() , 'ABOUT US')]")).click();
		//driver.switchTo().window(null)
		driver.findElement(By.xpath("//a[contains(text() , 'Company History')]")).click();
		
	}

}
