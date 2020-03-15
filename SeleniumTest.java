package com.mycompany.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
	WebDriver driver = null;
		// TODO Auto-generated method stub
	@Before
	public void launch(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skyid.sky.com/signup/skycom");  
	}
	@Test
	public void Registeration(){
		WebElement titleDropDown = driver.findElement(By.xpath("//*[@id='title']"));
		System.out.println(driver.getTitle());
		Select titledd = new Select(titleDropDown);
		titledd.selectByValue("Mr");
		// Find Element Firstname and enter detils
		driver.findElement(By.xpath(".//input[@id='firstname']")).sendKeys("Umesh");
		// Find Element Lastname and enter detils
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys("A");
		// Find Element Email address and enter detils
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("aumesh@gmail.com");
		// Find Element Confirm email address and enter detils
		driver.findElement(By.xpath(".//input[@id='confirmEmail']")).sendKeys("aumesh@gmail.com");
		// Find Element password address and enter detils
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("Password1");
		// Find Element Confirm password address and enter detils
		driver.findElement(By.xpath(".//input[@id='confirmPassword']")).sendKeys("Password1");
		// Find Element First checkbox and enter detils
		driver.findElement(By.xpath(".//input[@name='termsAndConditions']")).click();
		// Find Element Second Checkbox and select
		driver.findElement(By.xpath(".//input[@name='marketingOptOut']")).click();  
	}
	
	@After
	public void quitbrowser()
	{
		driver.quit();
	}

	}