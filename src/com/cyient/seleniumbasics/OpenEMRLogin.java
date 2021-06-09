package com.cyient.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEMRLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		// dropdown
		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		// login
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
		// get the title

		//make sure you are in proper page
		
		//wait for logout present
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[text()='Logout']")));
		
		System.out.println(driver.getTitle());

		// mousehover on profile name
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Billy']"))).perform();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authUser")));
		
		//make sure you are in proper page
		System.out.println(driver.getTitle());
	}

}
