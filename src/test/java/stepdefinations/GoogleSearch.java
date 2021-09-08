package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class GoogleSearch {

	private WebDriver driver;
	
	public GoogleSearch() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		System.out.println("Browser is opened successfully");
	}

	@When("^I navigate to \"([^\"]*)\" page$")
	public void iNavigateToPage(String arg0) {
		driver.get(arg0);
	}

	@Then("page title is \"([^\"]*)\"$")
	public void pageIs(String arg0) {
		Assert.assertEquals(driver.getTitle(), arg0);
	}


}
