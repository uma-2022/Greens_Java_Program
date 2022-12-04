package com.tcs.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Test\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions actions=new Actions(driver);
	driver.get("https://demoqa.com/menu/");
	//main item2
	WebElement menu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	actions.moveToElement(menu).perform();
	System.out.println("Done mouse over Main Item2");
	//sub sub list
	WebElement submenu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
	actions.moveToElement(submenu).perform();
	System.out.println("Done mouse over Main Item2 to sub sub list");
	//sub sub item1
	WebElement subsubmenu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
	subsubmenu.click();
	System.out.println("Done mouse over Main Item2 to sub sub item");
	driver.close();
	
	
}
}
