package Demo.Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import utility.Constants;

public class Run {

	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "remdi");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "14");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("automationName", "Uiautomator2");
		dc.setCapability("autoGrantPermissions", true);
		
		//dc.setCapability("appPackage","com.example.mmfsl");
		//dc.setCapability("appActivity","com.example.mmfsl.MainActivity");
		
		dc.setCapability("app", "C:\\Users\\ManikantaBirre\\Downloads\\android-sit-4.1.9.apk");
		
		URL url=new URL("http://127.0.0.1:4723");
		
		AppiumDriver driver= new AppiumDriver(url, dc);
		
	    System.out.println("Appium server start");
	    
	    //Allowing permissions to access Mahindra application
	   // driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
	    
	    
	    
	    //if app is not working then contact customer care
	    //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Contact customer care\"]")).click();
	    //Email
	    //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Email us\"]")).click();
	    
	    //selecting a language Option	      
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"English\"]")).click();
	    //android.widget.ImageView[@content-desc="తెలుగు Telugu"]
	    Thread.sleep(2000);
	    //continue forward after opting language  //android.view.View[@content-desc="Continue"]
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Continue\"]")).click();
	    Thread.sleep(2000);
	    //allow the app permission to access phone calls
	    driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
	    //select a number from the drop down before proceeding
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"+15551234567\"]")).click();
	    //Proceeding further after allowing permission
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
	    //to click on back button if user wants to visit previous screen
	    //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Back\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"98764-21123\"]")).sendKeys("9591441021");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.CheckBox")).click();
	    
	    //accept the terms and conditions to get OTP 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"I accept\"]")).click();
	    //click to get OTP
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Get OTP\"]")).click();
	    //Enter OTP 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("123456");
	    //verify the OTP
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Verify\"]")).click();
	    //if OTP validation fails
	    //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Try a different phone number\"]")).click();
	    
	    
	    System.out.println("done");
		

	}

}
