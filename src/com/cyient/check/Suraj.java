package com.cyient.check;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suraj {
	
	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
           
           
           driver.get("https://www.medibuddy.in/");
        
           driver.findElement(By.linkText("Signup")).click();
       
           driver.findElement(By.name("firstName")).sendKeys("Suraj");
           driver.findElement(By.name("phone")).sendKeys("8578456700");
           driver.findElement(By.name("username")).sendKeys("surajkuma@gmail.com");
           driver.findElement(By.name("password")).sendKeys("Sur@12345");
           driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
           driver.findElement(By.xpath("//span[text()='Male']")).click();
	}

}
