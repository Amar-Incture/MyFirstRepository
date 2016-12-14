package com.britanniacsc.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSC {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception{
	System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
	 driver = new ChromeDriver();
	driver.get("http://hrapps.britindia.com");
	driver.manage().window().maximize();
	}
	
	@Test
	public void elements() throws Exception{
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
	//driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/table/tbody/tr[2]/td[1]")).click();
	//*[@id="wrapper"]/div[2]/div/div/div[2]/div/form/div[1]/div
	
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[1]/div[1]/button[1]")).click();
		
		Thread.sleep(40000);
		System.out.println(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div")).isEnabled());
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("New2");
		Select options = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/select")));
		options.selectByVisibleText("CSC");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[4]/div[1]/input")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='datepicker-2672-5724-24']/button/span")).click();
	}
	
}


