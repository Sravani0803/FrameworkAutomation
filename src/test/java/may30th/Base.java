package may30th;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeTest
	public void configRead()
	{
		System.out.println("In BeforTest..");
	}
	@AfterTest
	public void quit()
	{
		System.out.println("In AfterTest..");
	}
	@BeforeClass
	public void fileUp()
	{
		System.out.println("In BeforeClass..");
	}
	@AfterClass
	public void closeFile()
	{
		System.out.println("In AfterClass ..");
	}
	@BeforeMethod
	public void setUp()
	{
		System.out.println("In beforemethod ...");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("In aftermethod..");
	}
}
