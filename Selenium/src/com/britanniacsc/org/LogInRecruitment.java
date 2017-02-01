package com.britanniacsc.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInRecruitment {

	
	@Test
	public static void launchURL() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("dev.cherrywork.in:7009");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("balakrishnan@britindia.com");
		driver.findElement(By.name("password")).sendKeys("cherry");
		driver.findElement(By.xpath("/html/body/div[1]/center/div/div[3]/form/div[4]/button")).click();
	}
	

}
