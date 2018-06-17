package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.EtsyPage;

import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EtsyStepsFirefox {
	
	private WebDriver driver;
	private EtsyPage etsy;
	private String keyword;
	
	@Given("User in on Etsy homepage using firefox")
	public void user_in_on_Etsy_homepage() throws Exception{
	  //WebDriverManager.firefoxdriver().setup();
	   //driver = new FirefoxDriver();
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL("http://13.59.159.14:4444/wd/hub"), caps);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 //  driver.manage().window().maximize();
	   driver.get("https://etsy.com");
	   Assert.assertEquals("Etsy.com | Shop for anything from creative people everywhere",
			   driver.getTitle());
	}
	
	@When("User searches for bamboo spoon in firefox")
	public void user_searches_for(String keyword) {
		this.keyword=keyword;
		etsy = new EtsyPage(driver);
		etsy.searchBox.sendKeys(keyword + Keys.ENTER);
		System.out.println("SEARCHINGG FOR "+keyword);

		
	}

	@Then("Search results should be displayed in firefox")
	public void search_results_should_be_displayed() {
	    Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(keyword));
	    driver.quit();
	}

}
