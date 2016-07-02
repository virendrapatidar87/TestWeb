/**
 * 
 */
package com.test.rpncalcaulator;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Virendra.Patidar
 *
 */
public class TestRegisterUserUI {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	@Given("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		driver = new FirefoxDriver();
	    baseUrl = "http://localhost:7001/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "TestWeb/login");
	    driver.findElement(By.linkText("SignUp")).click();
	}

	@Given("^I want to add a new User with name \"([^\"]*)\", contact \"([^\"]*)\", email \"([^\"]*)\", securityKey \"([^\"]*)\"$")
	public void i_want_to_add_a_new_User_with_name_contact_email_securityKey(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		 driver.findElement(By.name("patientName")).clear();
		    driver.findElement(By.name("patientName")).sendKeys(arg1);
		    driver.findElement(By.name("contact")).clear();
		    driver.findElement(By.name("contact")).sendKeys(arg2);
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(arg3);
		    driver.findElement(By.name("securityKey")).clear();
		    driver.findElement(By.name("securityKey")).sendKeys(arg4);
	}

	@When("^click on button \"([^\"]*)\"$")
	public void click_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("operation")).click();
	}

	@Then("^System should display \"([^\"]*)\"$")
	public void system_should_display(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(arg1, "Registration SuccessFul now Go to Login Page");
	}
}
