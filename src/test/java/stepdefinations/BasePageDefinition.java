package stepdefinations;


import io.cucumber.java.en.*;
import javafx.scene.input.MouseButton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.Hook;

public class BasePageDefinition {

    private WebDriver driver;

    public BasePageDefinition() {
        this.driver = Hook.getDriver();
    }


    @Given("open a browser")
    public void openABrowser() throws Throwable {
        System.out.println("Browser is opened successfully");
    }

    @When("^navigate to \"([^\"]*)\" page$")
    public void navigateToPage(String arg0) {
        driver.get(arg0);
    }

    @And("click to link with {string}")
    public void i_click_to_link_with_link_text(String arg0) throws Throwable {
        driver.findElement(By.xpath("//a[@title='"+arg0+"']")).click();
    }

    @And("text with {string} visible")
    public void textVisible(String text){
        driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).isDisplayed();
    }

    @When("set e-mail with {string} to text field for email")
    public void setEmailToField(String email){
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
    }

    @Then("submit button is disable")
    public Boolean submitButtonIsDisable(){
        return !driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
    }

    @And("submit button is enable")
    public Boolean submitButtonIsEnable(){
        return driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
    }

    @And("click submit button with text {string}")
    public void clickSubmitButtonByValue(String value){
        driver.findElement(By.xpath("//input[@value='"+value+"']")).click();
    }

    @And("click web element with tag {string} and text {string}")
    public void clickToText(String tagName, String text){
        driver.findElement(By.xpath("//"+tagName+"[contains(text(),'"+text+"')]"))
        .click();

    }

}
