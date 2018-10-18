package com.qa.parameterisation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\parameterisation\\src\\test\\java\\com\\qa\\parameterisation\\Parametisation.feature" , glue= {"com.qa.parameterisation"})

public class Runner 
{

}
