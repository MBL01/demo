package Demo.Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class Login {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("deviceName", "Oneplus");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "14");
		dcap.setCapability("udid", "emulator-5554");
		dcap.setCapability("automationName", "UiAutomator2");
		dcap.setCapability("autoGrantPermissions", true);
		dcap.setCapability("app", "C:\\Users\\ManikantaBirre\\Downloads\\android-sit-4.1.9.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver ad = new AppiumDriver(url, dcap);
		
		System.out.println("Appium session created successfully");
		
		//WebDriverWait wait = new WebDriverWait(ad, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(ad));
		Thread.sleep(2000);
		ad.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"English\"]")).click();
		Thread.sleep(2000);
		ad.findElement(By.xpath("//android.view.View[@content-desc=\"Continue\"]")).click();
		Thread.sleep(2000);
		ad.findElement(By.xpath("//android.widget.EditText")).sendKeys("9591441021");
		
		
	}

}
