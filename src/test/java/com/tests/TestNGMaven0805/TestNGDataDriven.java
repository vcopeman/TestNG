package com.tests.TestNGMaven0805;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataDriven {
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3]; //Object is array name
		
		data[0][0]="John";
		data[0][1]="John@email.com";
		data[0][2]="London";
		
		data[1][0]="Vikki";
		data[1][1]="vikki@test.com";
		data[1][2]="Hertfordshire";	
				
		return data;			
	}
	
	//Keep parameters in method
	
	@Test(dataProvider="getData")
	public void testusedatafromDataProvider(String name, String email, String address)
	{
		System.out.println("name: "+name+" email "+email+" address "+address+"");
	}

}
