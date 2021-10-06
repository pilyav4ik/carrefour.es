package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Hook;

public class BasePageDefinition {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public BasePageDefinition() {
        this.driver = Hook.getDriver();
    }


    @Given("open a browser")
    public void openABrowser() {
        System.out.println("Browser is opened successfully");
    }

    private void acceptCookies(){
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }

    @When("^navigate to \"([^\"]*)\" page$")
    public void navigateToPage(String arg0) {
        driver.get(arg0);
        acceptCookies();
    }

    @And("click link with text {string}")
    public void i_click_to_link_with_link_text(String arg0){
        driver.findElement(By.xpath("//a[contains(text(),'"+arg0+"')]")).click();
    }

    @And("click link with title {string}")
    public void i_click_to_link_with_title_text(String arg0) {
        driver.findElement(By.xpath("//a[@title='"+arg0+"']")).click();
    }

    @And("click link with {string} two")
    public void i_click_to_link_with_link_text2(String arg0){
        driver.findElement(By.xpath("//h2[contains(.,'"+arg0+"')]")).click();
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

    @When("click button with text {string}")
    public void clickButtonByText(String text){
        driver.findElement(By.xpath("//button[contains(text(),'"+text+"')]")).click();
    }

    @When("click button with value {string}")
    public void clickSubmitButtonByValue(String value){
        driver.findElement(By.xpath("//input[@value='"+value+"']")).click();
    }

    @And("click web element with tag {string} and text {string}")
    public void clickToText(String tagName, String text){
        driver.findElement(By.xpath("//"+tagName+"[contains(text(),'"+text+"')]"))
        .click();

    }
    @Then("popup with text \"Produicto actualizado\" visible")
    public void cartPopup(){
        driver.findElement(By.className("add-to-cart-layover")).isDisplayed();
    }


    @When("click to cart button")
    public void clickCartButton(){
        driver.findElement(By.xpath("//div[@class='cart-header__container']//a")).click();
        if (!driver.getCurrentUrl().equals("https://www.carrefour.es/supermercado/MiCarrito")){
            driver.get("https://www.carrefour.es/supermercado/MiCarrito");
        }
    }


    @When("total price in cart is {string}")
    public void total_price_in_cart_is(String price) {

        driver.findElement(By.xpath("//span[contains(text(),'"+price+"')]")).getText();
    }

    @And("cart count is {double}")
    public void cartCount(Double count){
        String countSt = driver.findElement(By.className("cart-header__count")).getText();
        System.out.println(countSt);
    }

    @And("product with name {string} visible")
    public void productWithNameVisible(String productName){
        driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]")).isDisplayed();
    }

    @And("product quantity is {string}")
    public void productQuantity(String quantity){
        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-unidades-ci45967010583']")));
        WebElement option = select.getFirstSelectedOption();
        String selectedOption = option.getText();
        Assert.assertEquals(quantity, selectedOption);

    }

}
