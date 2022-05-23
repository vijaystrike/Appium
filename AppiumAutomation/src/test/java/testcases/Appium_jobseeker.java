

package testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appium_jobseeker  {
	@Test
	public  void testone() throws InterruptedException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		capabilities.setCapability("DEVICE_NAME","emulator-5554");
		capabilities.setCapability("appPackage","com.spotjo");
		capabilities.setCapability("appActivity","com.spotjo.MainActivity");
		capabilities.setCapability("newCommandTimeout","600");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(20000);

		  // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("testone", "Spot your job");
		
        // log(Status, details)
        test.log(Status.INFO, "click login button");
	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();



		Thread.sleep(20000);
		test.log(Status.PASS, "click opportunties button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Opportunities']")).click();


		Thread.sleep(20000);
		test.log(Status.PASS, "tap on email");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).click();



		Thread.sleep(20000);
		test.log(Status.INFO, "enter email");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Email or Username']")).sendKeys("ajith8982kumar@gmail.com");



		Thread.sleep(20000);
		test.log(Status.INFO, "enter password");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Spotjo#2022");



		Thread.sleep(20000);
		test.log(Status.PASS, "click login button");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='9']")).click();



		Thread.sleep(20000);
		test.log(Status.PASS, "click personal information");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='9']")).click();



		Thread.sleep(20000);
		test.log(Status.INFO, "enter first name");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Enter First Name']")).sendKeys("vijay");


		Thread.sleep(20000);
		test.log(Status.INFO, "enter last name");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Enter Last Name']")).sendKeys("kumar");

		Thread.sleep(20000);
		test.log(Status.INFO, "enter place");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Enter Place']")).sendKeys("chennai");

		Thread.sleep(20000);
		test.log(Status.INFO, "enter cell number");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Enter Cell No.']")).sendKeys("123456789");



		Thread.sleep(20000);
		test.log(Status.PASS, "click next button");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']")).click();

		Thread.sleep(20000);
		test.log(Status.PASS, "click next button");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']")).click();





		Thread.sleep(20000);
		test.log(Status.PASS, "click skills");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='10']")).click();



		Thread.sleep(20000);
		test.log(Status.PASS, "click add skills");
		driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();



		Thread.sleep(20000);
		test.log(Status.INFO, "enter skills");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Enter Skills']")).sendKeys("B");

		Thread.sleep(20000);
		test.log(Status.INFO, "choose the skills from option");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Arable farming']")).click();



		Thread.sleep(20000);
		test.log(Status.PASS, "click done");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='6']")).click();

		Thread.sleep(20000);
		test.log(Status.PASS, "rate your skill");
		driver.findElement(By.xpath("//android.widget.Button[@index='10']")).click();



		Thread.sleep(20000);
		test.log(Status.PASS, "click finish button");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='13']")).click();



		Thread.sleep(20000);
		test.log(Status.FAIL,test.addScreenCaptureFromPath(CaptureScreen(driver))+ "click exit button");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();

		Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='11']")).click();

		//   Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();

		//   Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("abc");

		//   Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='5']")).click();		

		//	  Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Company name']")).sendKeys("abc");

		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();

		// Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"01 May 2022\"]")).click();

		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();

		//	Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();

		// Thread.sleep(20000);

		//	driver.findElement(By.xpath( "//android.view.View[@index='3']")).click();

		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();

		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='10']")).click(); 

		//      Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.Button[@index='10']")).click();

		//	   Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.view.ViewGroup[@index='14']")).click();

		//	 Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();

		//		Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='12']")).click();


		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();

		// Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Education']")).sendKeys("b");

		// Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();

		// Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='5']")).click();

		// Thread.sleep(20000);

		//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter University']")).sendKeys("abc");

		//	Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();


		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.Textview[@text='From Date']")).click();

		//	 Thread.sleep(20000);


		//	driver.findElement(By.xpath("//android.view.View[@content-desc=\"01 May 2022\"]")).click();

		//	 Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();

		//	Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();

		//	Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.View[@content-desc=\"02 May 2022\"]")).click();

		//	 Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();

		//	 Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='9']")).click();

		//	Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.widget.Button[@index='10']")).click();  


		//	   Thread.sleep(20000);

		//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='13']")).click();

		//		Thread.sleep(20000);

		//		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "click Language button");
		//driver.findElement(By.xpath("//android.view.ViewGroup[@index='13']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "click Add Language");
		//driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();



		//Thread.sleep(20000);
		//test.log(Status.INFO, "Enter Language");
		//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Language']")).sendKeys("Hindi"); 

		//Thread.sleep(20000);
		//test.log(Status.PASS, "choose your language");
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Hindi']")).click();



		//Thread.sleep(20000);
	//	test.log(Status.PASS, "click next button");
	//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='6']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "Rate your language");
		//driver.findElement(By.xpath("//android.widget.Button[@index='10']")).click();



		//Thread.sleep(20000);
		//test.log(Status.PASS, "click finish button");
		//driver.findElement(By.xpath("//android.view.ViewGroup[@index='13']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "click exit button");
		//driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "click Salary button");
		//driver.findElement(By.xpath("//android.view.ViewGroup[@index='14']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "click seekbar button");
		//driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click(); 
        
		


		//Thread.sleep(20000);
		//test.log(Status.INFO, "choose your salary by scrolling");
		//driver.findElement(By.xpath("//android.widget.SeekBar[@index='0']")).click(); 



		//Thread.sleep(20000);
		//test.log(Status.FAIL, "click save button");
		//driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();


		//Thread.sleep(20000);
		//test.log(Status.PASS, "click my profile button");
		//driver.findElement(By.xpath("//android.view.ViewGroup[@index='15']")).click();

		//Thread.sleep(20000);
		//test.log(Status.PASS, "check all the info and exit");
		//driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();

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

