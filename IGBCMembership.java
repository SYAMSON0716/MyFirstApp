package com.IGBC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IGBCMembership {
	
	@Test
	public void loginIGBC() {
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./New folder\\TestNGProject\\pom.xml");
		driver.get("https://portal.igbc.in/login");
		driver.findElement(By.id("email")).sendKeys("syampolepalli@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sony@123");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a/span")).click();
		
		
	}

	

}
