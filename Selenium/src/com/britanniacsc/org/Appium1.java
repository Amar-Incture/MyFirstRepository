package com.britanniacsc.org;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Appium1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName","cb786a74");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("platformVersion","5.1.1");
			capabilities.setCapability("appActivity","com.whatsapp.Main");
			File file = new File("/Users/amar/Documents/workspace/Selenium/apk/com.whatsapp_v2.17.65-451654_Android-4.0.apk");
			capabilities.setCapability("app",file.getAbsolutePath());
			AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);	
//			driver.findElement(By.id("com.whatsapp:id/contact_row_container")).click();
//			driver.findElement(By.id("com.whatsapp:id/menuitem_search")).click();
//			driver.findElement(By.id("com.whatsapp:id/search_src_text")).sendKeys("Sujith");
//			Thread.sleep(3000);
//			List<MobileElement> chatThreads = driver.findElements(By.className("android.widget.RelativeLayout"));
//			System.out.println(chatThreads.size());			
//			driver.findElement(By.id("com.whatsapp:id/contact_row_container")).click();	
//			Thread.sleep(3000);
//			driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("Hi");
//			Thread.sleep(3000);
//			driver.findElement(By.id("com.whatsapp:id/send")).click();	
//			List<MobileElement> group = driver.findElementsByClassName("android.widget.TextView");
//			System.out.println(group.size());
//			Thread.sleep(5000);			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath(".//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.ai[1]/android.widget.TextView[1]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.id("com.whatsapp:id/pickfiletype_gallery")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath(".//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath(".//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.view.View[1]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.id("com.whatsapp:id/send")).click();
//			Thread.sleep(3000);
//			MobileElement element = (MobileElement) driver.findElement(By.id("com.whatsapp:id/voice_note_btn"));
//			element.tap(1, 10000);
			driver.findElement(By.id("com.whatsapp:id/contact_row_container")).click();
			MobileElement voiceIcon = (MobileElement) driver.findElement(By.id("com.whatsapp:id/voice_note_btn"));
			MobileElement textBox = (MobileElement) driver.findElement(By.id("com.whatsapp:id/entry"));
			TouchAction action = new TouchAction((MobileDriver) driver);
			action.longPress(voiceIcon).moveTo(textBox).release().perform();
			Thread.sleep(3000);
			driver.findElement(By.id("com.whatsapp:id/back")).click();
			Thread.sleep(3000);
			List<MobileElement> navigationBarOptions = driver.findElements(By.id("com.whatsapp:id/tab"));
			for(MobileElement ele1:navigationBarOptions){
				ele1.click();
			}
			
			/*MobileElement desiredElement = (MobileElement) driver.findElement(By.id("com.whatsapp:id/contactpicker_row_name"));
			while(desiredElement.getText()!="Chaitanya"){
			Dimension size = driver.manage().window().getSize();
		    int x = size.getWidth() / 2;
		    int starty = (int) (size.getHeight() * 0.60);
		    int endy = (int) (size.getHeight() * 0.10);
		    driver.swipe(x, starty, x, endy, 2000);*/
		}
	}
	



