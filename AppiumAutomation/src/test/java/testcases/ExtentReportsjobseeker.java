package testcases;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ExtentReportsjobseeker {


	public	 ExtentReports extent;
	public WebDriver driver;
	public ExtentTest logger;
    public  AndroidDriver driver1;
    
	@BeforeTest
	public void setExtent() {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		extent.addSystemInfo("Host Name","vijay");
		extent.addSystemInfo("Environment","QA");

	}

	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}

	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestsScreenshots/"+ screenshotName + dateName +".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}









	@BeforeMethod
	
	public  void reportsetup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		capabilities.setCapability("DEVICE_NAME","emulator-5554");
		capabilities.setCapability("appPackage","com.spotjo");
		capabilities.setCapability("appActivity","com.spotjo.MainActivity");
		capabilities.setCapability("newCommandTimeout","600");
		AndroidDriver  driver1 = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 
	}
	    @Test
		 public  void jobseeker() throws InterruptedException, IOException {
	    	driver1.get("http://127.0.0.1:4723/wd/hub");
           logger = extent.startTest("jobseeker");
        
        
		Thread.sleep(20000);

		driver1.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();


		Thread.sleep(20000);

		driver1.findElement(By.xpath("//android.widget.TextView[@text='Opportunities']")).click();


		Thread.sleep(20000);

		driver1.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).click();



		Thread.sleep(20000);

		driver1.findElement( By.xpath("//android.widget.EditText[@text='Email or Username']")).sendKeys("ajith8982kumar@gmail.com");



		Thread.sleep(20000);

		driver1.findElement( By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Spotjo#2021");



		Thread.sleep(20000);

		driver1.findElement(By.xpath("//android.view.ViewGroup[@index='9']")).click();
	} 



	private void startActivity(Activity activity) {
			// TODO Auto-generated method stub
			
		}

	@AfterMethod
	public void Teardown(ITestResult result) throws IOException {

		if(result.getStatus()==ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL,"TEST CASE FAILED IS"+result.getName());
			logger.log(LogStatus.FAIL,"TEST CASE FAILED IS"+result.getThrowable());

			String screenshotPath = ExtentReportsjobseeker.getScreenshot(driver, result.getName());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS,"TEST CASE PASSED IS"+result.getName());
		}
		extent.endTest(logger);
		driver.quit();
	}
}