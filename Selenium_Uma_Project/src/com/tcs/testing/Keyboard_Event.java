package com.tcs.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Keyboard_Event {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		//User Name
		WebElement usrname=driver.findElement(By.id("userName"));
		usrname.sendKeys("Mrs.Uma Maheswari");
		//Mail Id
		WebElement mailid=driver.findElement(By.id("userEmail"));
		mailid.sendKeys("umamahe.tvr@gmail.com");
		//Current Address
		WebElement current_address=driver.findElement(By.id("currentAddress"));
		current_address.sendKeys("23,Pidari kovil street,Tiruvarur");
		//Temporary Address
		current_address.sendKeys(Keys.CONTROL);
		current_address.sendKeys("A");
		current_address.sendKeys(Keys.CONTROL);
		current_address.sendKeys("C");
		current_address.sendKeys(Keys.TAB);
		WebElement per_address=driver.findElement(By.id("permanentAddress"));
		per_address.sendKeys(Keys.CONTROL);
		per_address.sendKeys("V");
		//assertEquals(current_address.getAttribute("value"),per_address.getAttribute("value"));
		driver.close();
		
	}

}
