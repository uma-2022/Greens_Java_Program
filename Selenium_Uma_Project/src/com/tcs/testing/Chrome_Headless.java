package com.tcs.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Headless {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/");
		System.out.println("Title of the page is----->"+driver.getTitle());
		driver.close();
	}
}
