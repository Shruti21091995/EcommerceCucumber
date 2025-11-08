package StepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Pages.NewProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps
{
	NewProductPage page;
	Hooks hooks;
	
	public AddToCartSteps()
	{
		page=new NewProductPage(hooks.getDriver());
	}

	@When("user clicks on the ProductImage")
	public void user_clicks_on_the_product_image() 
	{
		JavascriptExecutor js=(JavascriptExecutor)hooks.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true)",page.laptopImage);
	    page.clickOnImage(hooks.getDriver(),page.laptopImage);
	}

	@Then("user redirected to next product page")
	public void user_redirected_to_next_product_page() 
	{
		String oldUrl = "https://yourwebsite.com"; // replace with your homepage URL
	    String newUrl = Hooks.getDriver().getCurrentUrl();
	    Assert.assertNotEquals(newUrl, oldUrl, "User is not navigated to Product page");
	}

	@Then("user click on the product to cart button")
	public void user_click_on_the_product_to_cart_button() 
	{
	    page.AddToCartClick();
	}

	@Then("the cart should have {int} item")
	public void the_cart_should_have_item(Integer count) 
	{
	  System.out.println("cart has"+count+"intems in the cart");
	  
	}



}
