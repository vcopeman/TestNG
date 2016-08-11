package package2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG 
    
	{
		@Test(enabled=true,dependsOnMethods="SecondTest",alwaysRun=true)
		public void FirstTest()

		{
			System.out.println("pack 2 Test 1 has passed");
		}
		
		@Test
		public void SecondTest()
		
		{
			System.out.println("pack 2 Test 2 has passed");	
		}
		
		@Test(timeOut=5000)
		public void timeouttest() throws InterruptedException
		
		{
			//Thread.sleep(10000);
			System.out.println("Timeout test has passed");
		}
		
		@BeforeMethod
		public void testprerequisite()
		{
			System.out.println("pack 2 Before Method");
		}
		
		@AfterMethod
		public void testpostrequisite()
		{
			System.out.println("pack 2 After Method");
		}
		
		@BeforeTest
		public void beforetest()
		{
			System.out.println("pack 2 Before test");
		}
		
		@AfterTest
		public void aftertest()
		{
			System.out.println("pack 2 After test");
		}
		
    
	}
