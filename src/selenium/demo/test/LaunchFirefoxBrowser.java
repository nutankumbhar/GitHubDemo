package selenium.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchFirefoxBrowser {
	
		public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","F:\\Nutan\\Automation\\Selenium\\geckodriver-v0.25.0-win32\\geckodriver.exe" );
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
	}
}


//System.setProperty("webdriver.gecko.driver", "F:/geckodriver/geckodriver.exe");
//FirefoxOptions options = new FirefoxOptions();
//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//WebDriver driver =  new FirefoxDriver(options);
//driver.get("https://stackoverflow.com");
//System.out.println("Page Title is : "+driver.getTitle());
