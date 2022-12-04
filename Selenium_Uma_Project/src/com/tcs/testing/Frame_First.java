package com.tcs.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-bottom");
		WebElement bottom=driver.findElement(By.cssSelector("body"));
		System.out.println("The frame text is:"+bottom.getText());
		driver.switchTo().defaultContent();
		driver.quit();
				
		
		
	}

}