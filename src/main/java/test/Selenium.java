package test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	
	static WebDriver driver = null;
	public static WebElement LOALink;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//PageFactory.initElements(driver, Selenium.class);
		driver.get("https://google.com");
		//driver.navigate().to("https://google.com");	
		
 		
		WebElement searchtextbox = driver.findElement(By.name("q"));
		searchtextbox.sendKeys("mouse right click on the webelement in selenium"+ Keys.ENTER);
	//	Thread.sleep(2000);
		
		//Catch catch1 = new Catch(driver);
		//catch1.LOAlink.click();
		LOALink =
				 driver.findElement(By.partialLinkText("Double click and Right Click"));
		String OldWindow = driver.getWindowHandle();
		
		
		  Actions action = new Actions(driver);		  
		  action.moveToElement(LOALink).keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).click().build().perform();
		  Set<String> handles = driver.getWindowHandles();
		  
		  for (String windowname : handles) {
			  driver.switchTo().window(windowname);
			
		}
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("location.reload()");
		  
		//  Thread.sleep(2000);
		  
		  driver.switchTo().frame(1);
		  
		  Thread.sleep(2000);
		  
		  String imagetext = driver.findElement(By.xpath("//iframe[1]")).getAttribute("id");
		  
		  System.out.println(imagetext);
		  driver.switchTo().defaultContent();
		  
		  
		/*
		 * WebElement SignIn = driver.findElement(By.xpath("//*[text()='Sign in']"));
		 * String text = SignIn.getText(); System.out.println(text);
		 */ 
		  /*
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_CONTROL);
		 */
		
		
		/*
		 * LOALink.click(); driver.navigate().back(); Thread.sleep(2000);
		 * driver.navigate().refresh(); driver.navigate().refresh();
		 * System.out.println("Refresh is success");
		 */
		//catch1.LOAlink.click();
		/*
		 * WebElement LOALink =
		 * driver.findElement(By.partialLinkText("Learn Automation Online - YouTube"));
		 * LOALink.click(); driver.navigate().back(); Thread.sleep(2000);
		 * driver.navigate().refresh(); System.out.println("Refresh is success");
		 */
		// WebDriverWait wait = new WebDriverWait(driver, 10); 
		  // wait.until(ExpectedConditions.elementToBeClickable(catch1.LOAlink)).click();	 
		
		System.out.println("Again clicked Learn Automation Online - 2");
		//LOALink.click();
		//driver.close();
		/*
		 * WebElement searchtextbox1 = driver.findElement(By.name("q"));
		 * Thread.sleep(2000); searchtextbox1.sendKeys("Learn automation online"+
		 * Keys.ENTER);
		 */
		//driver.get("https://google.com");
		driver.close();
		driver.quit();
		
		

	}

}
