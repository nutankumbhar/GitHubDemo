package selenium.demo.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		Select sel=new Select(driver.findElement(By.id("testingDropdown")));
		
		sel.selectByVisibleText("Manual Testing");
		Thread.sleep(1000);
		
		sel.selectByValue("Performance");
		Thread.sleep(1000);
		
		sel.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement ele=sel.getFirstSelectedOption();
		//System.out.println(ele.getText());
		
		List<WebElement> list=sel.getOptions();
		for (WebElement e : list)
		{
			System.out.println(e.getText());
			
		}
		driver.close();
	}
}
