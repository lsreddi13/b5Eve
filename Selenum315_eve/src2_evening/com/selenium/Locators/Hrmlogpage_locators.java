package com.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmlogpage_locators {
	public static void main(String[] args) throws InterruptedException {
		Hrmlogpage_locators obj = new Hrmlogpage_locators();
		obj.verifyErrorMessage();

	}

	public void login() {
		
		// open the browser and application

		// enter username

		// enter password

		// click login button

		// verify

	}
	//print page title
	

	public void verifyErrorMessage() throws InterruptedException {
		// open the browser and application
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		String loginURL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		
		driver.get(loginURL);
		
		
		//print page title
		String pageTitle = driver.getTitle();
		System.out.println("page title is : "+ pageTitle);
//		Assert.assertEquals("actual Result", "Expected Result", "filure message.");
		
		
		// enter username "admin"
		WebElement userName = driver.findElement(By.id("txtUsername"));
//		userName.click();
		userName.clear();
		userName.sendKeys("Admin");

		// enter wrong password "admin1234"
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.clear();
		pwd.sendKeys("abababababa");

		// click login button
		WebElement loginBtn = driver.findElement(By.className("button"));

		// get the button name
//		System.out.println(loginBtn.getAttribute("value"));		
		String loginBtn_Value = loginBtn.getAttribute("value");
		System.out.println("print button value : " + loginBtn_Value);
		
		
		String btnName = loginBtn.getAttribute("name");
		System.out.println("print name : " + btnName);
		
		String btnType = loginBtn.getAttribute("type");
		System.out.println("print type : " + btnType);
		
		String btnID = loginBtn.getAttribute("id");
		System.out.println("print ID : " + btnID);
		
		
		
		loginBtn.click();

		// verify error message "Invalid Credentials"
		WebElement errorText = driver.findElement(By.id("spanMessage"));
		String actualErrorMessage = errorText.getText();

		String expectedErrorMessage = "Invalid credential";

		if (actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - error message is not same as expected - actual error is : " + actualErrorMessage
					+ " and expectd error message is : " + expectedErrorMessage);

		}
		
		//print the page url 
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("after submitting the invalid details - the page url is  : "+ currentURL);
		System.out.println("before submitting the invalid details - the page url is : "+ loginURL);
		Thread.sleep(5000);
		//close the browser
//		driver.close();
		driver.quit();
	}

}
