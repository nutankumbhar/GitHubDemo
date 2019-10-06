package selenium.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	
	WebElement link= driver.findElement(By.linkText("This is a link"));
	link.click();
	
	Thread.sleep(1000);
	driver.close();
	
}
}
