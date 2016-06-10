package PgObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPgObject {

	WebDriver driver;
	
	public RegPgObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By firstName = By.xpath(".//*[@id='create-account-firstname']");
	public By lastName = By.xpath(".//*[@id='create-account-lastname']");
	public By email = By.xpath(".//*[@id='create-account-emailId']");
	public By pwd = By.xpath(".//*[@id='create-account-password']");
	public By conPwd = By.xpath(".//*[@id='create-account-confirm-password']");
	public By createAccount = By.xpath(".//*[@id='create-account-submit-button']");
}