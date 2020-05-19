package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catch {
	
	@FindBy(partialLinkText="Learn Automation Online - YouTube")
	public static WebElement LOAlink;
	
	public Catch(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

}
