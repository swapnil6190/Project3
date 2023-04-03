 package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginstepdef {
	
	WebDriver driver;
	@Given("^user should be in login page$")
	public void user_should_be_in_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("file:///D:/supportive%20files%20program/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   driver.manage().window().maximize();
	   
	}

	@When("^user enter valid credentials$")
	public void user_enter_valid_credentials() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user should be on homepage$")
	public void user_should_be_on_homepage() throws Throwable {
	  Assert.assertEquals("JavaByKiran | Dashboard",driver.getTitle());
	}
	@Then("^user should be see JBK logo$")
	public void user_should_be_see_JBK_logo() throws Throwable {
	   WebElement logo=driver.findElement(By.tagName("img"));
	   Assert.assertTrue(logo.isDisplayed());
	}
	@When("^user click on Register link$")
	public void user_click_on_Register_link() throws Throwable {
	  driver.findElement(By.xpath("//*[@class='text-center']")).click();
	}

	@When("^user fill the form$")
	public void user_fill_the_form() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("swapnil");
		driver.findElement(By.id("mobile")).sendKeys("123456");
		driver.findElement(By.id("email")).sendKeys("swap3604@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
	}

	@Then("^user should see successful message$")
	public void user_should_see_successful_message() throws Throwable {
	   Assert.assertEquals("User registered successfully.",driver.switchTo().alert().getText());
	}





}
