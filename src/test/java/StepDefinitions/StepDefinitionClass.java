/*
package StepDefinitions;

import org.testng.Assert;

import Base.BaseTest;
import Constants.FrameworkConstants;
import Pages.LoginPage;
import Utils.PropertyUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseTest
{
	PropertyUtils prop;
	LoginPage page;
	@Given("user is on the login page")
	public void user_is_on_the_login_page()
	{
		prop=new PropertyUtils(FrameworkConstants.CONFIG_FILE_PATH);
	    setup(prop.GetPropery("browser"));
	    page = new LoginPage(getDriver());
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() 
	{
	   page.enterEmail("shruti@gmail.com");
	   page.enterPassword("shruti@123");
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() 
	{
	    page.LoginButton();
	}

	@Then("user should be navigated to the homepage")
	public void user_should_be_navigated_to_the_homepage()
	{
		 String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("https://demowebshop.tricentis.com/"),"User is not navigated to the homepage!");
		 System.out.println(currentUrl);
	       tearDown();
	}



}
*/