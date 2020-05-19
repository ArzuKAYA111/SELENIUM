package Com.test;

import Com.Utils.BaseClass;
import Com.Utils.Constants;

public class TestClass extends BaseClass{  // Tested the Base Class

	public static void main(String[] args) {
		System.out.println(Constants.CHROME_DRIVER_PATH);		
		System.out.println(Constants.GECKO_DRIVER_PATH);		
		System.out.println(Constants.CONFIGURATION_FILEPATH);	
BaseClass.setUp();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		tearDown();
	}
}