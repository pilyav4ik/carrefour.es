package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;




// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"src//test//java//features"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ="@web"
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}
