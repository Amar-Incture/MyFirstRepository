package com.britanniacsc.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInRecruitment {
public WebDriver driver;
	
	@BeforeMethod
	public void launchURL() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("dev.cherrywork.in:7009");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.findElement(By.name("email")).sendKeys("balakrishnan@britindia.com");
		driver.findElement(By.name("password")).sendKeys("cherry");
		driver.findElement(By.xpath("/html/body/div[1]/center/div/div[3]/form/div[4]/button")).click();
	}
	
	@Test
	public void requisitionList() throws Exception{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='dropdownMenu1']")).click();
		driver.findElement(By.xpath("//*[@id='page-container']/ng-include/nav/div[2]/div/table/tbody/tr/td[1]/ng-include/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='rec']/li[1]/div/a")).click();
	}
	
	@AfterMethod
	public void createRequisition() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div/div[1]/div[1]/button")).click();
		Thread.sleep(5000);
		Select requisitionTypeDropdown = new Select(driver.findElement(By.className("modal-content")).findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div/select")));
		requisitionTypeDropdown.selectByIndex(1);
		Select requisitionSubTypeDropdown = new Select(driver.findElement(By.className("modal-content")).findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div/select")));
		requisitionSubTypeDropdown.selectByIndex(1);
		driver.findElement(By.className("modal-content")).findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/button[1]")).click();
	}
	
}
	


