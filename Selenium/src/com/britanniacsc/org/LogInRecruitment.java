package com.britanniacsc.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInRecruitment {
public WebDriver driver;
	
	@BeforeClass
	public void launchURL() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("dev.cherrywork.in:7009");
		driver.manage().window().maximize();
		Thread.sleep(5000);
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
	
	@AfterMethod()
	public void createRequisition() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div/div[1]/div[1]/button")).click();
		Thread.sleep(5000);
		Select requisitionTypeDropdown = new Select(driver.findElement(By.className("modal-content")).findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div/select")));
		requisitionTypeDropdown.selectByIndex(1);
		Select requisitionSubTypeDropdown = new Select(driver.findElement(By.className("modal-content")).findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div/select")));
		requisitionSubTypeDropdown.selectByIndex(1);
		driver.findElement(By.className("modal-content")).findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[1]/input")).sendKeys("Test Automation");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[2]/input")).sendKeys("Britannia");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[3]/input")).sendKeys("Amar Kumar");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[4]/input")).sendKeys("Amar Kumar");
		Select function = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[5]/select")));
		function.selectByIndex(1);
		Select budgetfunction = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[6]/select")));
		budgetfunction.selectByIndex(1);
		Select channelType = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[7]/select")));
		channelType.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[8]/input")).sendKeys("Naukari");
		Select grade = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[9]/select")));
		grade.selectByIndex(1);
		Select region = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[10]/select")));
		region.selectByIndex(1);
		Select location = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[11]/select")));
		location.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[12]/input")).sendKeys("1234");
		Select educationalQualification = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[13]/select")));
		educationalQualification.selectByIndex(1);
		Select requiredExperience = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[14]/select")));
		requiredExperience.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[15]/input")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[16]/textarea")).sendKeys("JD");
		Select psychometricTest = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[2]/div/div[17]/select")));
		psychometricTest.selectByIndex(1);
		Select evaluationType = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/select")));
		evaluationType.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[3]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[4]/input")).sendKeys("Amar");
		Select feedbackForm = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[3]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[5]/select")));
		feedbackForm.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[3]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[4]/input")).sendKeys("Amar");
		Select feedbackForm2 = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[3]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[5]/select")));
		feedbackForm2.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[1]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("modal-body header-background")).findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();
	}
}
	


