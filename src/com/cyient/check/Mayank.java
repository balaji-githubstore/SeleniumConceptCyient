package com.cyient.check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mayank {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

//		//click on edit
////		driver.findElement(By.id("personal_txtOtherID")).sendKeys("1001");
////		driver.findElement(By.id("btnSave")).click();
//
//		driver.findElement(By.id("personal_txtNickName")).sendKeys("john");
//		driver.findElement(By.id("btnSave")).click();
//		// emergency contacts details
//
//		driver.findElement(By.linkText("Emergency Contacts")).click();
//		driver.findElement(By.id("emgcontacts_name")).sendKeys("Mayank");
//		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Father");
//		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("2501534");
		
	        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	        
	        //click on edit
	        driver.findElement(By.id("personal_txtOtherID")).sendKeys("test123");
	        driver.findElement(By.id("btnSave")).click();
	        
	        
	        driver.findElement(By.linkText("Emergency Contacts")).click();
	        driver.findElement(By.id("btnAddContact")).click();
	        driver.findElement(By.id("emgcontacts_name")).sendKeys("Bhavana");    
	        driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Sister");
	        driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("010789022");
	        driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("7986302002");
	        driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("01042233677");
	        driver.findElement(By.id("btnSaveEContact")).click();
	        
	        
	        
	    }

	
}
