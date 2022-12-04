package com.tcs.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Alert_Confirmation {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement element=driver.findElement(By.id("confirmButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
		Alert confirmAlert=driver.switchTo().alert();
	    String alertText = confirmAlert.getText();
	    System.out.println("Alert text is " + alertText);
	    confirmAlert.accept();
	
	}	

}
