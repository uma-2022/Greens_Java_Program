package com.tcs.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Example {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/browser-windows");
driver.findElement(By.id("windowButton")).click();
String parent=driver.getWindowHandle();
Set<String> s=driver.getWindowHandles();
Iterator<String> i=s.iterator();
while(i.hasNext())
{
	String child=i.next();
	if(!parent.equalsIgnoreCase(child))
	{
		driver.switchTo().window(child);
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("The heading of child window is:"+text.getText());
		driver.close();
	}
}

	}
}


