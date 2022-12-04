package com.tcs.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames_Heading {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		WebElement  element=driver.findElement(By.xpath("//div[@class='main-header']"));
	    String heading=element.getText();
		System.out.println("The Web page heading is:"+heading);
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frame1Element= driver.findElement(By.tagName("body"));
		String parent=frame1Element.getText();
		System.out.println("Frame1 is"+parent);
		//WebElement frame2=driver.findElement(By.id("frame0"));
		driver.switchTo().frame(0);
		String child=driver.findElement(By.tagName("p")).getText();
		System.out.println("Frame1 is"+child);
		driver.switchTo().defaultContent();
		WebElement main_Page=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
		System.out.println("Heading is:"+main_Page.getText());
		driver.close();
		
		
				
	}

}
