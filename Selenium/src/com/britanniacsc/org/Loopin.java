package com.britanniacsc.org;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Loopin {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException, Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","cb786a74");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","5.1.1");
		capabilities.setCapability("appActivity","com.whatsapp.Main");
		File file = new File("/Users/amar/Documents/workspace/Selenium/apk/com.whatsapp_v2.17.65-451654_Android-4.0.apk");
		capabilities.setCapability("app",file.getAbsolutePath());
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);	
		List<MobileElement> chatThreads = driver.findElements(By.className("android.widget.RelativeLayout"));
		System.out.println(chatThreads.size());
		for(MobileElement ele:chatThreads){
			ele.click();
			driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("Happy Birthday");
			driver.findElement(By.id("com.whatsapp:id/send")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("com.whatsapp:id/camera_btn")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.whatsapp:id/shutter")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.whatsapp:id/send")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.whatsapp:id/back")).click();
			
		}
}
}
