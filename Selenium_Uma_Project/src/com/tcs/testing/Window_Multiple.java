package com.tcs.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Multiple {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent window is"+parent);
		Set<String> s=driver.getWindowHandles();
		System.out.println("Child window is"+s);
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			String child=i.next();
			if(!parent.equalsIgnoreCase(child))
				driver.switchTo().window(child);			
			driver.close();
			System.out.println("child window closed");
			
		}
		
		
		
		
	}

}
