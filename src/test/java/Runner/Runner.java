package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner
{
	@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"StepDefinitions"},
	    		 plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-html-report"},
	    monochrome = true
	)
	public class TestRunner extends AbstractTestNGCucumberTests 
	{
		
	}

}
