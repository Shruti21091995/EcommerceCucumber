package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefinitions"},
    plugin = {
        "pretty","summary",
        "html:target/cucumber-reports",            // ✅ creates HTML report directory
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"
    },
    monochrome = true
)
public class Runner {
}
