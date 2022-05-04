package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HelloSelenium {
	static String url = "https://opensource-demo.orangehrmlive.com/"; // local variable

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // open the browser

		driver.get(url);

		// linkTest
		// partial linktext

		WebElement userName = driver.findElement(By.id("txtUsername"));// xpath
		userName.clear();
		userName.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin123");

//		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		WebElement loginBtn = driver.findElement(By.className("button"));
		loginBtn.click();

		WebElement errorMessage = driver.findElement(By.id("spanMessage"));
		String actual_error = errorMessage.getText();

		System.out.println("Error displayed as : " + actual_error);

		String exp_error = "Invalid credential";

		if (exp_error.equalsIgnoreCase(actual_error)) {
			System.out.println("expected error message displayed.");
		} else {
			System.out.println("Wrong error message displayed : " + actual_error
					+ "   ---  and the expected error message : " + exp_error);
		}
//		wait method 
		Thread.sleep(5000);
		driver.close();

//		
//		
//		driver.findElement(By.id("txtPassword")).sendKeys("ppppppp");
//		

		//
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dfasdfasdfasd");
//		
//		.sendkeys
//		.click
//		.getText

//		locators in selenium 
//		id
//		name
//		tagname
//		classname
//		css
//		xpath
//		linktext
//		partial linktext

//		System.setProperty("webdriver.opera.driver", ".//BrowserDrivers//operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("https://fb.com");

//		driver.quit();
	}

}
