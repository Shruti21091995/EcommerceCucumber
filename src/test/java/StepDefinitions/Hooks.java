package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.ecommerceAutomation.demowebshop.factory.WebDriverFactory;

import Pages.LoginPage;
import Utils.PropertyUtils;
import Constants.FrameworkConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private static WebDriver driver;
    private PropertyUtils prop;

    @Before("@LoginRequired")
    public void setUpScenario() {
        prop = new PropertyUtils(FrameworkConstants.CONFIG_FILE_PATH);
        String browser = prop.GetPropery("browser");
        driver = WebDriverFactory.CraeteDriver(browser); // your WebDriver factory
        driver.manage().window().maximize();
        driver.get(prop.GetPropery("url"));

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("shruti@gmail.com", "shruti@123");
    }

    @After
    public void tearDownScenario() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
