package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//If you are using junit then use @RunWith
//If its a TestNG then use extends///
@CucumberOptions(features = {"src\\test\\resources\\Login\\Login.feature"},
glue = {"StepDefinition"},
plugin = {"html:Result/TestNG.html"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
