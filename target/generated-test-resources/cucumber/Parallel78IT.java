import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Dell_J/Documents/reviewSource/mistake/ReviewSessionsCode/src/test/resources/features/EtsySearch4 - Copy (5).feature"},
        plugin = {"json:C:/Users/Dell_J/Documents/reviewSource/mistake/ReviewSessionsCode/target/cucumber-parallel/78.json"},
        monochrome = false,
        tags = {},
        glue = {"stepdefs"})
public class Parallel78IT {
}
