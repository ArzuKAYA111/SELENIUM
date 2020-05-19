package JavaHW;
import Com.Utils.BaseClass;// we are in different package that is why we import the Com Utils BaseClass
import Com.Utils.Constants;

public class BaseClassTest extends BaseClass {

	public static void main(String[] args) {
		System.out.println(Constants.CHROME_DRIVER_PATH);		
		System.out.println(Constants.GECKO_DRIVER_PATH);		
		System.out.println(Constants.CONFIGURATION_FILEPATH);			

		setUp();

     String title=driver.getTitle();

     System.out.println(title);
     tearDown();    
   }
}