package com.alMuzainiTestAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlMozainiHome {
	
	@Test
	public void alMuzainiContact() {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ".MyFirstApp\\pom.xml.exe");
		driver.get("https://www.muzaini.com/");
		driver.manage().window().maximize();
	

}
}