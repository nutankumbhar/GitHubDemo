package selenium.demo.test;
//import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Nutan\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		//String tabID = driver.getWindowHandle();
		//System.out.println(tabID);
		//Set<String> setsrID= driver.getWindowHandles();
		//System.out.println(setsrID);
		  WebElement ele= driver.findElement(By.id("Sug_kwdsugg"));
	    ele.sendKeys("Manual Testing"+Keys.TAB);
	    Thread.sleep(5000);
						
		WebElement ele1= driver.findElement(By.name("location"));
		ele1.sendKeys("Pune"+Keys.TAB);
			
		//WebElement ele7= driver.findElement(By.id("cjaExp"));
		//ele7.sendKeys("3"+Keys.TAB);
		
		//WebElement ele6= driver.findElement(By.id("cjaMinSal"));
		//ele6.sendKeys("3"+Keys.TAB);
	
		WebElement ele3= driver.findElement(By.className("srchTxt"));
		ele3.sendKeys("Account"+Keys.TAB);
		
		WebElement ele8= driver.findElement(By.id("cjaRole"));
		ele8.sendKeys("QA Analyst"+Keys.TAB);
		//System.out.println(driver.findElement(By.id("cjaRole")));
		
		WebElement ele9= driver.findElement(By.id("nyja"));
		ele9.sendKeys("QA1 Alerts"+Keys.TAB);
		Thread.sleep(1000);
		
		WebElement ele10= driver.findElement(By.id("eml"));
		ele10.sendKeys("nutan1@test.com"+Keys.TAB);
		Thread.sleep(1000);
		
		WebElement ele11= driver.findElement(By.className("lightCyanBtn"));
		ele11.click();
		
		//WebElement ele4= driver.findElement(By.linkText("Register Now"));
		//ele4.click();
		//driver.navigate().to("https://www.naukri.com/free-job-alerts");;
		//WebElement ele5= driver.findElement(By.partialLinkText("Search"));
		//ele5.click();
		Thread.sleep(5000);
	  //  driver.close();
	}
}
