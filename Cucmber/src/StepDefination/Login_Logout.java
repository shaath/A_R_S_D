package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout 
{
	public static WebDriver driver;
	@Given("^The browser Launched and navigated to url$")
	public void the_browser_Launched_and_navigated_to_url() throws Throwable 
	{
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@When("^The tester enters username and password$")
	public void the_tester_enters_username_and_password() throws Throwable 
	{
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable
	{
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^It displays welcome admin message$")
	public void it_displays_welcome_admin_message() throws Throwable
	{
	  String expval="welcome";
	  String actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
	  Assert.assertEquals(expval, actval);
	}

	@When("^The tester clicks on Welcome admin link$")
	public void the_tester_clicks_on_Welcome_admin_link() throws Throwable
	{
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout link$")
	public void also_clicks_on_logout_link() throws Throwable
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^it displays login page$")
	public void it_displays_login_page() throws Throwable 
	{
	   Sleeper.sleepTightInSeconds(3);	
	   String expval="LOGIN";
	   String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	   Assert.assertEquals(expval, actval);
	}

}
