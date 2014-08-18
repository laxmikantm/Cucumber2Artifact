package com.login;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test/resources/WebLogin.feature",//path to the features
        format = {"html:target/cucumber"},//what formatters to use
        tags = {"@run2"})//what tags to include(@)/exclude(@~)
public class RunTest{
	
}
