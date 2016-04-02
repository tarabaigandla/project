package stepdefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber2 {
	static FirefoxDriver driver;
	@Given("^we launch the browser and navigate to orange HRM$")
	public void we_launch_the_browser_and_navigate_to_orange_HRM() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
	    throw new PendingException();
	}

	@Given("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Sleeper.sleepTightInSeconds(7);
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		Sleeper.sleepTightInSeconds(6);
		driver.findElement(By.id("btnLogin")).click();

	    
	    throw new PendingException();
	}

	@Then("^welcome admin msg should be displayed$")
	public void welcome_admin_msg_should_be_displayed() throws Throwable {
		String expmsg="welcome Admin";
		String actmsg=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actmsg,expmsg);
	    
	    throw new PendingException();
	}

	@When("^we click on welcome admin link$")
	public void we_click_on_welcome_admin_link() throws Throwable {
	    driver.findElement(By.id("welcome")).click();
	    throw new PendingException();
	}

	@When("^also click on logout link$")
	public void also_click_on_logout_link() throws Throwable {
		 driver.findElement(By.linkText("Logout")).click();
	    throw new PendingException();
	}

	@Then("^it should come to homepage$")
	public void it_should_come_to_homepage() throws Throwable {
		String expurl="http://opensource.demo.orangehrm.com/index.php/auth/login";
		String acturl=driver.getCurrentUrl();
	    throw new PendingException();
	}



}
