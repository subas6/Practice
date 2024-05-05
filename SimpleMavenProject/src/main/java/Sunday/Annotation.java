package Sunday;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@Test
	public void method1()
	{
		System.out.println("executing method 1");
	}
	@Test
	public void method2()
	{
		System.out.println("executing method 2");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
}
