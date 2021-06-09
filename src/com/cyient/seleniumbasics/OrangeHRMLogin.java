package com.cyient.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");	
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
//		task 1
//		click on edit 
//		update --> Other Id as "test123"
//		click on save
		
		
//		task2
//		click on Emergency Contacts
//		click on add
//		add name, relationship, home Telephone, mobile, work Telephone
//		click on save
		
		driver.findElement(By.linkText("Emergency Contacts")).click();
	        

	}

}
