package com.britanniacsc.org;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArraysLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//amar//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/java/java_arrays.htm");
		List<WebElement>list= driver.findElements(By.tagName("a"));
		List li = new ArrayList();
		
		
		for(WebElement ele:list){
			System.out.println("Without sorting =" + ele.getText());
		}
	}
}


	
