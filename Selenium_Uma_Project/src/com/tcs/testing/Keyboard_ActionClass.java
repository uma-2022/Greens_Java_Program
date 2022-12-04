package com.tcs.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Actions actions=new Actions(driver);
		/*WebElement name=driver.findElement(By.id("userName"));
		name.sendKeys("Uma Maheswari");
		WebElement mailid=driver.findElement(By.id("userEmail"));
		mailid.sendKeys("umamahe.tvr@gmail.com");
		WebElement currentaddress=driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("23,Pidari kovil street,Tiruvarur"); 
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("A");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("C");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		//WebElement peraddress=driver.findElement(By.id("permanentAddress"));
		//assertEquals */
		
       
        
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        
        // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        
        //Compare Text of current Address and Permanent Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        //assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));

		driver.close();
	}

}
