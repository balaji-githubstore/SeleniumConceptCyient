package com.cyient.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CyientTest {

	public static void main(String[] args) {
		//class --> ChromeDriver 
		//non-static methods --> get(String url), getTitle(), getCurrentUrl()
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.cyient.com/");
		
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		

	}

}
