package com.ecommerceAutomation.demowebshop.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory 
{
   public static WebDriver CraeteDriver(String Browser)
   {
	   WebDriver driver = null;
	   if(Browser==null)
	   {
		   Browser="Chrome";
	   }
	  switch(Browser.toLowerCase())
	  {
	  case "firefox":
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  break;
	  
	  case "chrome":
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  break;
		  
	  case "edge":
			 WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  break;
	  }
	  driver.manage().window().maximize();
	  return driver;
   }
}
