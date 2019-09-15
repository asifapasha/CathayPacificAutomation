package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@test",
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"},
        glue = {"com.automation.Steps"},
        dryRun = false,
        monochrome = true,
        features = "src//test//java//Features//bookingflight.feature")
public class TestRunner {
}
