package selenium.demo.test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/start/join");
		//implecit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement E1 =  driver.findElement(By.xpath("//input[@id='first-name']"));
		E1.sendKeys("Nutan");
		
		WebElement E2 =  driver.findElement(By.xpath("//input[@class='cell-body-textinput' and @name='lastName'] "));
		E2.sendKeys("Kumbhar");
		
		WebElement E3 =  driver.findElement(By.xpath("//input[@type='email']"));
		E3.sendKeys("test@test.com");
		
		WebElement E4 =  driver.findElement(By.xpath("//input[@id='join-password']"));
		E4.sendKeys("PASS");
		
		//explicite wait
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='join-password']"))));
		
		//fluent wait
		FluentWait fwait=new FluentWait(driver);
		fwait.withTimeout(5, TimeUnit.SECONDS);
		fwait.pollingEvery(5, TimeUnit.SECONDS);
		fwait.ignoring(NoSuchElementException.class);
		fwait.withMessage("No element found exception");
		
		//Thread.sleep(2000);
		driver.quit();
	}

}





