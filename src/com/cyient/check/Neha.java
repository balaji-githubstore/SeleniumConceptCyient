package com.cyient.check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neha {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("testing");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.id("emgcontacts_name")).sendKeys("Ne");
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("abc");
		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("7654222");
		driver.findElement(By.id("btnSaveEContact")).click();

	}

}
