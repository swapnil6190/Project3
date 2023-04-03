package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features" ,
		glue="com.stepdefs" ,
		plugin={"html:target"},
		dryRun=false,//it is used to compile feature file
		monochrome=true //it is used for readable output in the console
		
		
		)

public class TestRunner {

/*
2 Scenarios ([36m1 skipped[0m, [33m1 undefined[0m)
5 Steps ([36m3 skipped[0m, [33m2 undefined[0m)
0m0.000s

*/

}
