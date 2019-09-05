package automationFramework;

import java.util.concurrent.TimeUnit;
import pageObject.HomePage;

import pageObject.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectModel {
	 private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     driver.get("http://www.store.demoqa.com");
	 
	    
	 
	     HomePage.lnk_MyAccount(driver).click();
	 
	     LoginPage.txtbx_UserName(driver).sendKeys("testuser_1");
	 
	     LoginPage.txtbx_Password(driver).sendKeys("Test@123");
	 
	     LoginPage.btn_LogIn(driver).click();
	 
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     HomePage.lnk_LogOut(driver).click(); 
	 
	     driver.quit();

	}

}
