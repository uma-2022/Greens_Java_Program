package com.tcs.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.online.citibank.co.in/");
		System.out.println("Tooltip web Page Displayed");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginId\"]/img"));
		String loginbox=login.getAttribute("title");
		System.out.println(loginbox);
		driver.close(); 
	} 

	
	}


