package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

public class HomePageDefinition {

	private WebDriver driver;
	
	public HomePageDefinition() {
		this.driver = Hook.getDriver();
	}

	@Then("page title is \"([^\"]*)\"$")
	public void pageIs(String arg0) {
		Assert.assertEquals(driver.getTitle(), arg0);
	}


}
