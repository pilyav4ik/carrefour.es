package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Hook;

public class SignUpPageDefinition {

    private WebDriver driver;

    public SignUpPageDefinition() {
        this.driver = Hook.getDriver();
    }

    public SignUpPageDefinition(WebDriver driver) {
        this.driver = Hook.getDriver();
    }
    @Then("field for input password visible and enable")
    public void passwordField(){
        driver.findElement(By.className("gigya-input-password")).isDisplayed();
        driver.findElement(By.className("gigya-input-password")).isEnabled();
    }
}
