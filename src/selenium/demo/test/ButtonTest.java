package selenium.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
		
	WebElement button=driver.findElement(By.id("idOfButton"));
	button.click();
	
	Thread.sleep(1000);
	driver.close();
	
}
}
