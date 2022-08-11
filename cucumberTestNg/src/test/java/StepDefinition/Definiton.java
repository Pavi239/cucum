package StepDefinition;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definiton {
	
	WebDriver driver;

	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("Enter the username")
	public void enter_the_username() {
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}
	@When("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}
	@When("Click loginbtn")
	public void click_loginbtn() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("LOgin successfull")
	public void l_ogin_successfull() {
		String Expectedname = driver.findElement(By.id("welcome")).getText();
		String Actualname = Expectedname;
	Assert.assertEquals(Expectedname, Actualname);
		driver.close();
	}



}
