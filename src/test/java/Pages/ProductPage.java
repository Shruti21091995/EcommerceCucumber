package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.WaitUtils;

public class ProductPage
{
  public WebDriver driver;
  
  @FindBy(css = "div.product-name h1")
  public WebElement productTitle;
  
  @FindBy(xpath = "//div[@class='product-price']//span[contains(@class,'price-value')]")
  private WebElement productPrice;

  @FindBy(id="addtocart_13_EnteredQuantity")
  public WebElement Quantity;
  
  @FindBy(id="add-to-cart-button-13")
  public WebElement AddtoCartNButton;
  
  @FindBy(css="p.content")
  public WebElement SuccessMessage;
  
  @FindBy(xpath="//a(@href='/cart']")
  public WebElement ShoppingCart;
  
  @FindBy(xpath="//span[@class='cart-qty']")
  public WebElement CartCount;
  
  
 
  public ProductPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public String getproductTitle()
  {
	  WaitUtils.ElementToBeVisible(driver, productTitle);
	return productTitle.getText();
	  
  }
  
  public String getProductPrice()
  {
	  WaitUtils.ElementToBeVisible(driver, productPrice);
	  return productPrice.getText();
  }
  
  public void setQuantity(String ProductQuantity)
  {
	  Quantity.clear();
	  Quantity.sendKeys(ProductQuantity);
  }
  
  public void ClickOnAddToCartButton()
  {
	  WaitUtils.ElementToBeVisible(driver, AddtoCartNButton);
	  AddtoCartNButton.click();
  }
  
  public String AddtoCartSuccessMessage()
  {
	  WaitUtils.ElementToBeVisible(driver, SuccessMessage);
	  return SuccessMessage.getText();
  }
  
  public void ClickOnShoppingCartLink()
  {
	  WaitUtils.ElementToBeVisible(driver, ShoppingCart);
	  ShoppingCart.click();
  }
  public int cartCount()
  {
	  return Integer.parseInt(CartCount.getText());
  }
  public void AddtoCartFunctionalityMethod(String ProductQuantity)
  {
	  getproductTitle();
	  getProductPrice();
	  setQuantity(ProductQuantity);
	  ClickOnAddToCartButton();
	  AddtoCartSuccessMessage();
  }
}
