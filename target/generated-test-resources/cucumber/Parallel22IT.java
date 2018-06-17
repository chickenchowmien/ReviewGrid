import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Dell_J/Documents/reviewSource/mistake/ReviewSessionsCode/src/test/resources/features/EtsySearch2 - Copy (10).feature"},
        plugin = {"json:C:/Users/Dell_J/Documents/reviewSource/mistake/ReviewSessionsCode/target/cucumber-parallel/22.json"},
        monochrome = false,
        tags = {},
        glue = {"stepdefs"})
public class Parallel22IT {
}
