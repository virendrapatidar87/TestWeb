package com.test.cucumber;

import static org.junit.Assert.assertEquals;

import com.test.dto.PatientRecordDTO;
import com.test.service.SaveRecordDaoImpl;
import com.test.utility.DateTimeUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */

public class SaveRecordTest 
{
	PatientRecordDTO patientRecordDTO= null;
	public void InputData() {
		// TODO Auto-generated method stub
		
		
	}
@Given("^Patient has entered correct data$")
public void Patient_has_entered_correct_data() throws Throwable {
    // Express the Regexp above with the code you wish you had
//    throw new PendingException();
	patientRecordDTO=new PatientRecordDTO();
	patientRecordDTO.setDocname("Virendra");
	patientRecordDTO.setFilename("Abc.png");
	patientRecordDTO.setDate("2016/06/30");
	patientRecordDTO.setTime("15:52:00");
}
@Given("^with valid credentials \"([^\"]*)\"$")
public void with_valid_credentials(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
assertEquals(arg1,"Patil" );
}



@When("^click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
//    throw new PendingException();
	assertEquals(arg1,"Submit");
}




@Then("^System should display \"([^\"]*)\"$")
public void System_should_display(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
//    throw new PendingException();
	if(DateTimeUtil.checkDateFormat(patientRecordDTO.getDate())){
		assertEquals("Successful Test",arg1, new SaveRecordDaoImpl().saveRecord(patientRecordDTO));
	}else {
		assertEquals("Date Format Is Incorrect",arg1,"Incorrect Date Foramat");
	}
	
}

@Given("^Patient has entered incorrect Data$")
public void Patient_has_entered_incorrect_Data() throws Throwable {
    // Express the Regexp above with the code you wish you had
	patientRecordDTO=new PatientRecordDTO();
	patientRecordDTO.setDocname("Virendra");
	patientRecordDTO.setFilename("Abc.png");
	patientRecordDTO.setTime("15:52:00");
	patientRecordDTO.setDate("20-06-2016");
	
}
}
