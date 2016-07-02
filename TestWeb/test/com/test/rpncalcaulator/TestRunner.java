package com.test.rpncalcaulator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="test/resources"/*tags={"@Positive,@Negetive"}*/,format={"pretty", "html:target/cucumber"} )
public class TestRunner {

}
