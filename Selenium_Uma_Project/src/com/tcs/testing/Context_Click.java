package com.tcs.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.cssSelector(".context-menu-one"));
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
		WebElement edit=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		edit.click();  
		
	}
	
}
