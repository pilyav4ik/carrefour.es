package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Hook;

public class CategoryPageDefinition {

    private WebDriver driver;

    public CategoryPageDefinition() {
        this.driver = Hook.getDriver();
    }

    @And("click to product category with name {string}")
    public void clickToCategoryLink(String categoryName){
        driver.findElement(By.xpath("//a[@title='"+categoryName+"']")).click();
    }

    @And("click to sub category with name {string}")
    public void clickToSubCategory(String sugbCategoryName){
        driver.findElement(By.xpath("//p[contains(text(),'"+sugbCategoryName+"')]/parent::a")).click();
    }

    @And("click to checkbox with text {string}")
    public void clickToCheckbox(String checkboxName){
        driver.findElement(By.xpath("//label[contains(text(),'"+checkboxName+"')]/parent::div/parent::a")).click();
    }
}
