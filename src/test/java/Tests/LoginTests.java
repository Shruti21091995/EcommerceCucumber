/*
package Tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import Constants.FrameworkConstants;
import Pages.LoginPage;
import Utils.ExcelReaderUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Ecommerce Application")
@Feature("Login Module")
public class LoginTests extends BaseTest
{
	private static final Logger logger = LogManager.getLogger(LoginPage.class);
  @Test(priority=1)
  @Severity(SeverityLevel.CRITICAL)
  @Story("Valid Login Test")
  @Description("Test verifies that user can log in with valid credentials.")
  public void LoginWithValidUser()
  {
	  logger.info("Starting login test...");
	  LoginPage login=new LoginPage(driver);
	  ExcelReaderUtils.setExcelFile(FrameworkConstants.ExcelSheetPath, FrameworkConstants.ExcelSheet);
	  String Username=ExcelReaderUtils.getCellData(1, 0);
	  String Password=ExcelReaderUtils.getCellData(1, 1);
	  login.Login(Username, Password);
	  ExcelReaderUtils.closeExcel();
	  logger.info("Login test completed successfully.");
  }
  
  @Test(priority=2)
  @Severity(SeverityLevel.CRITICAL)
  @Story("InValid Login Test")
  @Description("Test verifies that user cannot log in with Invalid credentials.")
  public void LoginWithInavalidUser()
  {
	  LoginPage login=new LoginPage(driver);
	  login.Login("diduyapatil@gmail.com", "Divya@123");
	String error=login.ErrorMessage();
	Assert.assertTrue(error.contains("Login was unsuccessful"), "Error message not shown for invalid login.");
	  
  }
}
//divyapatil@gmail.com  Divya@123
*/