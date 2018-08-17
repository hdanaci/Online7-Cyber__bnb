package cyber_bnb.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", 
							"html:target/default-cucumber-reports",
							"json:target/cucumber.json" },

				 tags = "@temp", 
				 features = { "src/test/resources/com/cyber_bnb/features" }, 
				 glue = {"cyber_bnb/step_definitions" }, 
				 monochrome = true,
				 dryRun = false
				)
public class CukesRunner {
}
