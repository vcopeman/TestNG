package com.tests.TestNGMaven0805;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG 
    
	{
		
		@Test(enabled=false,dependsOnMethods="SecondTest",alwaysRun=true)
		public void FirstTest()
		
		{
			System.out.println("First test");
		}
		
		@Test(enabled=false)
		public void SecondTest()
		
		{
			System.out.println("Second test");
		}
		
		@Test(enabled=false,timeOut=5000)
		public void timeouttest() throws InterruptedException
		
		{
			Thread.sleep(10000);
			System.out.println("Second test");
		}
		
		@Test(enabled=false,groups="Priority1")
		public void HighPriorityTest1()
		
		{
			System.out.println("High Priority Test 1");
		}
		
		@Test(enabled=false,groups="Priority1")
		public void HighPriorityTest2()
		
		{
			System.out.println("High Priority Test 2");
		}
		
		@Parameters("noofproducts")
		@Test
		public void noofproducts(String noofproducts)	
		{
			System.out.println("The number of products availible is "+noofproducts);
		}
		
		@BeforeMethod
		public void testprerequisite()
		{
			System.out.println("Before Method");
		}
		
		@AfterMethod
		public void testpostrequisite()
		{
			System.out.println("After Method");
		}
		
		@BeforeTest
		public void beforetest()
		{
			System.out.println("Before test");
		}
		
		@AfterTest
		public void aftertest()
		{
			System.out.println("After test");
		}
		
    
	}
