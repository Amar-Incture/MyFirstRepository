package com.britanniacsc.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSC {
	@Test
	public void setUp() throws Exception{
	System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://hrapps.britindia.com");
	driver.manage().window().maximize();
	Thread.sleep(15000);
	driver.findElement(By.xpath("/html/body/div[1]/center/div/div[3]/form/div[1]/input")).sendKeys("balakrishnan@britindia.com");
	driver.findElement(By.xpath("/html/body/div[1]/center/div/div[3]/form/div[2]/input")).sendKeys("123");
	driver.findElement(By.xpath("/html/body/div[1]/center/div/div[3]/form/div[3]/button")).click();
	Thread.sleep(15000);
	driver.findElement(By.xpath("//*[@id='suboptions']/li[2]/div/a")).click();
	Thread.sleep(15000);
	List<WebElement> totalTemplates = driver.findElements(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/table/tbody/tr/td[1]"));
	System.out.println(totalTemplates.size());
	int count = 0;
	for(WebElement ele : totalTemplates){
		System.out.println(ele.getText());
		String s1 = ele.getText();
		
		if(s1.equals("")){
		
			count=count+1;
		}
			
	}
	System.out.println("Total number of templates with blank names ="+count);
	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/table/tbody/tr[2]/td[1]")).click();
}
}
