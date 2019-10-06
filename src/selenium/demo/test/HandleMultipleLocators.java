package selenium.demo.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i=0;i<links.size();i++)
		{
			System.out.println("Next link is:"+links.get(i).getText());
		}
		driver.close();
	}
}
