package com.tcs.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Test//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		int dragX=drag.getLocation().getX();
		int dragY=drag.getLocation().getY();
		System.out.println("XOffset---->"+dragX+"YOffset----->"+dragY);
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		int dropX=drag.getLocation().getX();
		int dropY=drag.getLocation().getY();
		System.out.println("XOffset---->"+dragX+"YOffset----->"+dragY);
		 dropX=(dropX-dragX)+10;
		 dropY=(dropY-dragY)+20;
		actions.dragAndDropBy(drag,dropX,dropY).perform();
		String droptext=drop.getText();
		if(droptext.equals("Dropped"))
		{
			System.out.println("Pass: Source is not dropped at location as expected");
		}
		else
		{
			System.out.println("Fail: Source is not dropped at location as expected");
			
		}
		driver.close();
		
		
	}

}
