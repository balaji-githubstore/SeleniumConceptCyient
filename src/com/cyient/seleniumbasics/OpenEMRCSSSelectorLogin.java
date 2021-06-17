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

public class OpenEMRCSSSelectorLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");

		driver.findElement(By.cssSelector("#authUser")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");
	
		Select selectLanguage = new Select(driver.findElement(By.cssSelector("select[name='languageChoice']")));
		selectLanguage.selectByVisibleText("English (Indian)");

		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	
	}

}
