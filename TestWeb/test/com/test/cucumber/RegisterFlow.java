package com.test.cucumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterFlow {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:7001/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

/*  @Test
  public void testRegisterFlow() throws Exception {
    driver.get(baseUrl + "/TestWeb/login");
    driver.findElement(By.linkText("SignUp")).click();
    driver.findElement(By.name("patientName")).clear();
    driver.findElement(By.name("patientName")).sendKeys("dffd");
    driver.findElement(By.name("contact")).clear();
    driver.findElement(By.name("contact")).sendKeys("dfsfd");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("dsffd");
    driver.findElement(By.name("securityKey")).clear();
    driver.findElement(By.name("securityKey")).sendKeys("dfsfds");
    driver.findElement(By.name("operation")).click();
  String text=  driver.findElement(By.id("msg")).getText();
    
 System.out.println(text);
  }*/

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
/*  @Given("^Click on \"([^\"]*)\"$")
  public void Click_on(String arg1) throws Throwable {
      // Express the Regexp above with the code you wish you had
	  driver = new FirefoxDriver();
	    baseUrl = "http://localhost:7001/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(baseUrl + "/TestWeb/login");
	    driver.findElement(By.linkText("SignUp")).click();
  }*/

/*  @Given("^I want to add a new User with name \"([^\"]*)\", contact \"([^\"]*)\", email \"([^\"]*)\", securityKey \"([^\"]*)\"$")
  public void I_want_to_add_a_new_User_with_name_contact_email_securityKey(String arg1, String arg2, String arg3, String arg4) throws Throwable {
      // Express the Regexp above with the code you wish you had
	  driver.findElement(By.name("patientName")).clear();
	    driver.findElement(By.name("patientName")).sendKeys(arg1);
	    driver.findElement(By.name("contact")).clear();
	    driver.findElement(By.name("contact")).sendKeys(arg2);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(arg3);
	    driver.findElement(By.name("securityKey")).clear();
	    driver.findElement(By.name("securityKey")).sendKeys(arg4);
  }*/

  @When("^click on button \"([^\"]*)\"$")
  public void click_on_button(String arg1) throws Throwable {
      // Express the Regexp above with the code you wish you had
	  driver.findElement(By.name("operation")).click();
  }
/*
  @Then("^System should display \"([^\"]*)\"$")
  public void System_should_display(String arg1) throws Throwable {
     assertEquals(arg1, "Registration SuccessFul now Go to Login Page");
  }*/
  

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


@Then("^System should display \"([^\"]*)\"$")
public void system_should_display(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 assertEquals(arg1, "Registration SuccessFul now Go to Login Page");
}

}
