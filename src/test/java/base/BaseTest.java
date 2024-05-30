package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	public static FileInputStream fis1;
	public static Properties configProp;
	public static FileInputStream fis2;
	public static Properties locatorsProp;
	
	
	@BeforeTest
	public void fileSetUp() throws IOException
	{
		
		fis1=new FileInputStream("config.properties");
		configProp=new Properties();
		configProp.load(fis1);
		
		fis2=new FileInputStream("locators.properties");
		locatorsProp=new Properties();
		locatorsProp.load(fis2);
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
