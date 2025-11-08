package StepDefinitions;
import org.testng.Assert;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps 
{
	Hooks hooks; 
    HomePage page;
    
    public SearchPageSteps()
    {
        // Zero-argument constructor for Cucumber
        page = new HomePage(Hooks.getDriver()); // getDriver() must be static//getDriver() returns the WebDriver instance that was created in your @Before method (the browser that was opened and logged in).

//So after this call, you have access to the same browser session that the hook opened.
    }
@Given("user is on homepage")
public void user_is_on_homepage() 
{
	System.out.println("User is on homepage");
}

@When("user searches for {string}")
public void user_searches_for(String ProductName) 
{
   page.searchButtonClick(ProductName);
}

@Then("search results should contain {string}")
public void search_results_should_contain(String productName)
{
	String url=Hooks.getDriver().getCurrentUrl();
Assert.assertTrue(url.contains("search?q=laptop")||url.contains("search?q=book")||url.contains("search?q=gift+card"),"❌ User is not navigated to any of the expected product pages!");

}



}
