package com.tcs.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement element=driver.findElement(By.xpath("//*[@id=\"authentication\"]"));
	Actions actions=new Actions(driver);	
	actions.doubleClick(element).perform();
	Alert dclick=driver.switchTo().alert();
	System.out.println("Alert Text:"+dclick.getText());
	dclick.accept();
	driver.close();
	
	}
}
