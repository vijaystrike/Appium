package testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
public class Appium_Xpath extends NEWExtent {
    @Test
	public   void testone() throws InterruptedException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();


		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		capabilities.setCapability("DEVICE_NAME","emulator-5554");
		capabilities.setCapability("appPackage","com.spotjo");
		capabilities.setCapability("appActivity","com.spotjo.MainActivity");
		capabilities.setCapability("newCommandTimeout","400");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(30000);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("Guestflow testing", "Guestflow test case");

		test.log(Status.INFO, "Test one started");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Guest']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Navigate to Skills");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Enter Upto 5 Skills']")).sendKeys("3");

		Thread.sleep(30000);
		test.log(Status.PASS, "Enter the 1st skill");
		driver.findElement( By.xpath("//android.widget.TextView[@text='3D simulation']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Enter the 2nd skill");
		driver.findElement( By.xpath("//android.widget.TextView[@text='3D laser scanning']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Enter the 3rd skill");
		driver.findElement( By.xpath("//android.widget.TextView[@text='3D visualization programs']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "skill entered successfully");
		driver.findElement( By.xpath("//android.widget.TextView[@text='Done']")).click();

		Thread.sleep(30000);
		test.log(Status.SKIP, "Next page");
		driver.findElement( By.xpath("//android.view.ViewGroup[@index='8']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Enter the place to work");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Place to Work']")).sendKeys("che");

		Thread.sleep(30000);
		test.log(Status.PASS, "Location enter successfully");
		driver.findElement( By.xpath("//android.widget.TextView[@text='Chennai, Tamil Nadu, India']")).click();

		Thread.sleep(30000);
		test.log(Status.SKIP, "Next page");
		driver.findElement( By.xpath("//android.view.ViewGroup[@index='9']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "select the company");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Select Company']")).sendKeys("du");

		Thread.sleep(30000);
		test.log(Status.PASS, "Company selected");
		driver.findElement( By.xpath("//android.widget.TextView[@text='dummy daimler']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Company Saved");
		driver.findElement( By.xpath("//android.widget.TextView[@text='Done']")).click();

		Thread.sleep(30000);
		test.log(Status.SKIP, "Next page");
		driver.findElement( By.xpath("//android.view.ViewGroup[@index='8']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Select employment");
		driver.findElement( By.xpath("//android.widget.TextView[@text='Fulltime']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Selected");
		driver.findElement( By.xpath("//android.widget.TextView[@text='Employed']")).click();

		Thread.sleep(30000);
		test.log(Status.PASS, "Register");
		driver.findElement( By.xpath("//android.view.ViewGroup[@index='17']")).click();

		Thread.sleep(30000);
		test.log(Status.FAIL,test.addScreenCaptureFromPath(CaptureScreen(driver))+ "List of jobs");
		driver.findElement( By.xpath("//android.widget.EditText[@text='2 Jobs Found']")).sendKeys("d");

		driver.quit();

	}
	public static String CaptureScreen(AndroidDriver driver) throws IOException{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destinationfile = new File("src/../reports"+System.currentTimeMillis()+".png");
		String absolutepath_screen = Destinationfile.getAbsolutePath();
		FileUtils.copyFile(source, Destinationfile);
		return absolutepath_screen;
	    }

	

}
