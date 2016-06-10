package PgObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePgObject {
	
	WebDriver driver;
	
	public HomePgObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By Account = By.xpath(".//*[@id='header-account-menu']");
	public By createAccount = By.xpath(".//*[@id='header-account-register']");
}