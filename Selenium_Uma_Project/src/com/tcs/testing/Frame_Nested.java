package com.tcs.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Nested {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/nestedframes");
		int frame_Count=driver.findElements(By.tagName("iframe")).size();//No of frames
		System.out.println("Number of Frames on a Page:"+frame_Count);
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);//Switch  frame1
		int frame1_Count=driver.findElements(By.tagName("iframe")).size();//frame1 ---Parent Frame
		System.out.println("Number of Frames inside the Frame1:"+frame1_Count);
		driver.switchTo().frame(0);//Child frame
		int frame0_Count=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames inside the Frame2:"+frame0_Count);//frame2---Child Frame
		driver.switchTo().parentFrame();
     	WebElement frame2=driver.findElement(By.tagName("body"));
		String frame1_ChildText=frame2.getText();
		System.out.println("Frame1 is :"+frame1_ChildText);
	    driver.close();
		 
		
		
		
		
	}

}