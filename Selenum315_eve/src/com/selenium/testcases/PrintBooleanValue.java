package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintBooleanValue {

	
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login"; // local variable

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // open the browser
		// how do you maximize the browser
		driver.manage().window().maximize();

		driver.get(url);
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		System.out.println(userName.isDisplayed());
		
		boolean a = userName.isDisplayed();
		
		System.out.println("print booelan value : "+ a);
		
	}
}
