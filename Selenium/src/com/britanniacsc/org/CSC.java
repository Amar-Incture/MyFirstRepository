package com.britanniacsc.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSC {
	@Test
	public void setUp(){
	System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
}
