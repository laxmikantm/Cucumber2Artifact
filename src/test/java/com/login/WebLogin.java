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
import org.apache.commons.io.FileUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebLogin{
	
	public WebDriver driver;
	
	public WebElement element;
	

	
	@Given("^the user accesses the login page of cognizant outlook web access$")
	public void access_outlook_web_access(){
		
		driver = new FirefoxDriver();
		driver.get("https://usmail.cognizant.com/");
				
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
				
		
	}


	
	@When("^the user try to sign-on with incorrect username$")
	public void Login_with_invalid_user_name() throws IOException{
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(MyUtil.IncorrectUNAME);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(MyUtil.CorrectPASSWORD);
		
		
		driver.findElement(By.id("password")).submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	/*
	@Then("^the message should be displayed prompting the user to enter correct credentials&")
	public void prompt_to_enter_correct_login() throws Exception{
		
		if(driver.getPageSource().contains("The user name or password you entered isn't correct"))	
		{
			System.out.println("\n Incorrect Username Password message being verified.");
		}
	assertTrue("Incorrect credential password present on the screen", driver.getPageSource().contains("The user name or password you entered isn't correct"));
driver.close();
		
	} 
	*
	*/
	
	@Then("^the message should be displayed prompting the user to enter correct credentials$")
	public void the_message_should_be_displayed_prompting_the_user_to_enter_correct_credentials() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		if(driver.getPageSource().contains("The user name or password you entered isn't correct"))	
		{
			System.out.println("\n Incorrect Username Password message being verified.");
		}
		assertTrue("Incorrect credential password present on the screen", driver.getPageSource().contains("The user name or password you entered isn't correct"));
		driver.close();
	}
	
	@After
	public void closure(){
		driver.quit();
		
	}

}
