package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTestSelenium {

	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login"; // local variable

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // open the browser
		// how do you maximize the browser
		driver.manage().window().maximize();

		driver.get(url);

		// how do you print page title
//		System.out.println(driver.getTitle());
		String loginPageTitle = driver.getTitle();
		System.out.println("hrm login page title : " + loginPageTitle);
		String exp_loginPageTitle = "OrangeHRM";

		if (loginPageTitle.equalsIgnoreCase(exp_loginPageTitle)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL - page it is not same with expected page title.");
		}

		WebElement loginBtn = driver.findElement(By.className("button"));

		String btnValue = loginBtn.getAttribute("value");
		System.out.println("Print button value : " + btnValue);

		WebElement userName = driver.findElement(By.id("txtUsername"));// xpath
		System.out.println(userName.isDisplayed());
		
		boolean a = userName.isDisplayed();
		
		System.out.println("print booelan value : "+ a);
		
		userName.clear();
		userName.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin12344");

		loginBtn.click();
//get the page url

		String currentURL = driver.getCurrentUrl();
		System.out.println("after clicking login button  : " + currentURL);
		System.out.println("before clicking login button : " + url);

		/*
		 * // linkText WebElement fwdLink =
		 * driver.findElement(By.linkText("Forgot your password?"));
		 * 
		 * String redirect_fwdLink_url = fwdLink.getAttribute("href");
		 * System.out.println("forgot password link url : " + redirect_fwdLink_url);
		 * 
		 * driver.navigate().to(redirect_fwdLink_url);
		 */
		//		driver.get(redirect_fwdLink_url);

		//partial Link text

		WebElement fwdLink = driver.findElement(By.partialLinkText("Forgot your"));

		String redirect_fwdLink_url = fwdLink.getAttribute("href");
		System.out.println("forgot password link url : " + redirect_fwdLink_url);

		driver.navigate().to(redirect_fwdLink_url);
		Thread.sleep(3000);
//		driver.close();
		
		driver.quit();

	}
}
