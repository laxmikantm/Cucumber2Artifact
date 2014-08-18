
package com.login;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
/**
public class WebMailLogin {
	
	public WebDriver driver;
	
	public WebElement element;
	
	
	@Given("^user accesses the login page of cognizant outlook web access$")
	public void accessing_outlook_web_access(){
		
		driver = new FirefoxDriver();
		driver.get(Util.BASE_URL);

		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
				
		
	}


	@When("^the user try to sign-on with incorrect username$")
	public void Login_with_invalid_user_name() throws IOException{
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(Util.IncorrectUNAME);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Util.CorrectPASSWORD);
		
		
		driver.findElement(By.id("password")).submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
		@Then("^message should be displayed prompting the user to enter correct credentials$")
		public  void incorrect_username_prompt(){
		
				if(driver.getPageSource().contains("The user name or password you entered isn't correct"))	
				{
					System.out.println("\n Incorrect Username Password message being verified.");
				}
			assertTrue("Incorrect credential password present on the screen", driver.getPageSource().contains("The user name or password you entered isn't correct"));
		driver.close();
	}
	
	
	
		@When("^the user try to sign-on with incorrect password$")
		public void Login_with_invalid_password() throws IOException{
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(Util.CorrectUNAME);
			
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(Util.IncorrectPASSWORD);
			
			
			driver.findElement(By.id("password")).submit();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}

	
	
	@AfterTest
	public void closure(){
		driver.quit();
		Reporter.log("\n ****** Script closed After End of Tests ***********");
	}
}

**/