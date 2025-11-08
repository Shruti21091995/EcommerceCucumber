package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ActionClassUtils;
import Utils.WaitUtils;

public class HomePage 
{
   public WebDriver driver;
   
   @FindBy(xpath="//a[@href='/computers']")
   public WebElement ComputerHover;
   
   @FindBy(xpath="//a[@href='/desktops']")
   public WebElement Desktopoption;
   
   @FindBy(id="small-searchterms")
   public WebElement SearchBoxFiled;
   
   @FindBy(xpath="//input[@class='button-1 search-box-button']")
   public WebElement SaechButton;
   
   @FindBy(id="small-searchterms")
   public WebElement serachTextbox;
   
   public HomePage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
    public void ComputerMethod()
   {
	   WaitUtils.ElementToBeVisible(driver, ComputerHover);
	   ActionClassUtils.ActionClassMouseHoverMethod(driver, ComputerHover);
	   
   }
   
  public void DesktopClickMethod()
   {
	   ComputerMethod();
	   Desktopoption.click();
   }
   
   public void enterProductName(String productName)
   {
	   WaitUtils.ElementToBeVisible(driver, SearchBoxFiled);
	   SearchBoxFiled.sendKeys(productName);
   }
   
   public void searchButtonClick(String productName)
   {
	   enterProductName(productName);
	   SaechButton.click();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
