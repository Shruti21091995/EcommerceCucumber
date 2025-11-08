package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.WaitUtils;

public class NewProductPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[contains(@class,'product-item')]//a")
	public WebElement laptopImage;
	
	@FindBy(id="add-to-cart-button-2")
	public WebElement AddToCartButton;
	
	@FindBy(xpath="//span[@class='cart-qty']")
	public WebElement CartItemCount;
	
	
  public NewProductPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
    public void clickOnImage(WebDriver driver, WebElement laptopImage)
   {
    	WaitUtils.ElementToBeVisible(driver, laptopImage);
    	laptopImage.click();
    	 try {
    	        Thread.sleep(2000); // just for debugging, remove later
    	    } catch (InterruptedException e) {
    	        e.printStackTrace();
    	    }
    	    System.out.println("Clicked successfully!");
   }
    
   public void AddToCartClick()
   {
	   WaitUtils.ElementToBeVisible(driver, AddToCartButton);
	   AddToCartButton.click();
  }
   
   public String CartItemCount()
   {
	   WaitUtils.ElementToBeVisible(driver, CartItemCount);
	  String CartCount =CartItemCount.getText();
	  return CartCount;
   }
   
   
   
  
}
