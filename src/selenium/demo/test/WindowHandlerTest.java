package selenium.demo.test;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	
	String ParentWindow=driver.getWindowHandle();
	System.out.println("Parent Window:"+ParentWindow);
	System.out.println("Parent Window Title:" +driver.getTitle());
	
	WebElement windowbutton= driver.findElement(By.id("win1"));
	windowbutton.click();
	//to shift from one window tab to another window tab
	Set<String> setWindows= driver.getWindowHandles();
	System.out.println(setWindows);
	
	for (String windowID:setWindows)
	{
		if (!ParentWindow.equals(windowID))
		{
			driver.switchTo().window(windowID);
			System.out.println("Child Window Title:"+driver.getTitle());
		}
	}
	driver.quit();
}
}
