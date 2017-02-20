package com.britanniacsc.org;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Appium1 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName","cb786a74");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("platformVersion","5.1.1");
			capabilities.setCapability("appActivity","com.whatsapp.Main");
			File file = new File("/Users/amar/Documents/workspace/Selenium/apk/com.whatsapp_v2.17.65-451654_Android-4.0.apk");
			capabilities.setCapability("app",file.getAbsolutePath());
			AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);	
			driver.findElement(By.id("com.whatsapp:id/contact_row_container")).click();
			driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("hello");
			driver.findElement(By.id("com.whatsapp:id/send")).click();
		}

	}


