
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

/**
 * 
 * 
 * @author Ajay
 *

public class Login {
	
	public WebDriver driver;
	
	public WebElement element;
	

	
	@Given("^I navigate to the singlesignon login application$")
	public void setUp(){
		File pathtobonary = new File(LoginUtil.FLOCATION);
		 FirefoxBinary ffbinary = new FirefoxBinary(pathtobonary);
		
		 FirefoxProfile firefoxprofile = new FirefoxProfile();
		driver = new FirefoxDriver(ffbinary, firefoxprofile);
		//driver = new FirefoxDriver();
		driver.get(LoginUtil.BASE_URL);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		try{
		driver.switchTo().alert().accept();
		}
		catch(NoSuchFrameException e){
			
		}
		
		
		
		
	}
	
	

	//@Test (priority=1)
	@When("^When I try to login with correct username password credentials$")
	public void Login_with_correct_credentials() throws IOException{
		
		
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__userNameInput']")).clear();
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__userNameInput']")).sendKeys(LoginUtil.UNAME);
		
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__passwordInput']")).clear();
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__passwordInput']']")).sendKeys(LoginUtil.PASSWORD1);
		
	
		driver.findElement(By.id("PageContent_content_controlspanel_0__loginButton")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
		@Then("^Then I should see that login successful$")
		public  void login_sucessful(){
		if (driver.getTitle() == LoginUtil.TAR_TITLE){
			Reporter.log("Loggedin Successful");
		}else
			Reporter.log("Techical error in login- Please investigate");
		
		assertEquals("Screen title matched with expected", driver.getTitle(), LoginUtil.TAR_TITLE);
		
		driver.close();
		
	}
	
	
	@Test (priority =2)
	public  void negativeTest() throws IOException{
		
		driver.navigate().to(LoginUtil.BASE_URL);
		driver.manage().deleteAllCookies();
		driver.navigate().to(LoginUtil.BASE_URL);
		
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__userNameInput']")).clear();
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__userNameInput']")).sendKeys(LoginUtil.UNAME);
		
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__passwordInput']")).clear();
		driver.findElement(By.xpath(".//*[@id='PageContent_content_controlspanel_0__passwordInput']']")).sendKeys(LoginUtil.PASSWORD2);
		
	
		driver.findElement(By.id("PageContent_content_controlspanel_0__loginButton")).click();
		
		
		Reporter.log("Loged-in: unsuccessful");
		
	}
	
	@AfterTest
	public void closure(){
		driver.close();
		Reporter.log("\n ****** Driver closed After End of Tests ***********");
	}
	
}
***/

