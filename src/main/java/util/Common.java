package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common {
	
	private	WebDriver driver;
	private WebElement webelement;

	
	public Common(WebDriver driver){
		this.driver = driver;	 
	}
	
	public void fill(String text, By element){
		webelement = driver.findElement(element);
		webelement.sendKeys();
		
	}
	
	public void click(By element){
		webelement = driver.findElement(element);
		webelement.click();
	}
	}

