import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Dell_J/Documents/reviewSource/mistake/ReviewSessionsCode/src/test/resources/features/EtsySearch1.feature"},
        plugin = {"json:C:/Users/Dell_J/Documents/reviewSource/mistake/ReviewSessionsCode/target/cucumber-parallel/1.json"},
        monochrome = false,
        tags = {},
        glue = {"stepdefs"})
public class Parallel01IT {
}
