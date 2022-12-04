package com.tcs.testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Lines {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		String url=" ";
		List<WebElement> allUrls=driver.findElements(By.tagName("a"));
		System.out.println("Total url in webpage:"+allUrls.size());
		Iterator<WebElement> iterator=allUrls.iterator();
		while(iterator.hasNext())
		{
			url=iterator.next().getText();
			System.out.println(url);
		}
		driver.close();	
		}
		
		
	}


