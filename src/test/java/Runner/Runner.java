package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner
{
	@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"StepDefinitions"},
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports.html"
	    },
	    monochrome = true
	)
	public class TestRunner extends AbstractTestNGCucumberTests 
	{
		
	}

}
