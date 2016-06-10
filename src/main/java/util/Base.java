package util;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PgObject.HomePgObject;
import PgObject.RegPgObject;

public class Base {
	
	public static WebDriver driver;
	public static Common common;
	public static HomePgObject homepgobj;
	public static RegPgObject regpgobj;
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/Flights");
		common = new Common(driver);
		homepgobj = new HomePgObject(driver);
		regpgobj = new RegPgObject(driver);
		

}
}
