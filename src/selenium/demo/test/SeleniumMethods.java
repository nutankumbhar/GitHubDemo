package selenium.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle()); //page title will be printed
		System.out.println(driver.getCurrentUrl()); //page url will be printed
		System.out.println(driver.getPageSource()); //page source will be printed
		driver.close(); //current browser window where current focus is
	// driver.quit(); //close all the instances of browser
			
	}
}
