package com.tcs.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Alert_Example {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F://Text//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement element=driver.findElement(By.id("promtButton"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	Alert prompt=driver.switchTo().alert();
	String alertPrompt=prompt.getText();
	System.out.println("The string is"+alertPrompt);
	prompt.sendKeys("Test User");
	prompt.accept();
	driver.close();
	
	
}
}
