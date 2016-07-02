package com.test.cucumber;

import static org.junit.Assert.assertEquals;

import com.test.dto.RegistrationDto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterUserTest {

	RegistrationDto registrationDto= null;
	@Given("^\"([^\"]*)\" provided valid information of himself \"([^\"]*)\"$")
	public void provided_valid_information_of_himself(String patientname, String nodata) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		registrationDto= new RegistrationDto();
	if(!nodata.equals("contact")){
		registrationDto.setContact("1234567890");
	}
		registrationDto.setEmail("test@test.com");
		registrationDto.setPatientName(patientname);
		registrationDto.setSecurityKey("test");
		
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   assertEquals(arg1,"Submit");
	}

	@Then("^Should display \"([^\"]*)\"$")
	public void Should_display(String arg1) throws Throwable {
	 
		if(registrationDto.getContact() == null){
			assertEquals(arg1, "Fail");
		}else{
		assertEquals( arg1 ,"Success");
		}
		}
/*
	
	@Given("^viru provided information of himself $")
	public void viru_provided_information_of_himself() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^Click on Submit$")
	public void Click_on_Submit() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Should display success$")
	public void Should_display_success() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^pankaj provided information of himself contact$")
	public void pankaj_provided_information_of_himself_contact() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Should display Fail$")
	public void Should_display_Fail() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}*/
}
