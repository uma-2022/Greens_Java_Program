package com.tcs.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_HoverOffset {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demoqa.com/slider/");
	    System.out.println("Demo qa webpage displayed");
	    Actions actions=new Actions(driver);
	    WebElement element=driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
	    actions.moveToElement(element,50,0).perform();
	    element.click();
	    System.out.println("Hover action has done");
	    driver.close();
	}
}
