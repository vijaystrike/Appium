package testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class CompanyAdmin extends NEWExtent {
	@Test
	public   void testone() throws InterruptedException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		


		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		capabilities.setCapability("DEVICE_NAME","emulator-5554");
		capabilities.setCapability("appPackage","com.spotjo");
		capabilities.setCapability("appActivity","com.spotjo.MainActivity");
		capabilities.setCapability("newCommandTimeout","300");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(20000);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("COMPANYADMIN TESTING", "CompanyAdmintest case");

		test.log(Status.PASS, "click login page");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();

		Thread.sleep(20000);
		test.log(Status.PASS, "click Talent button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Talent']")).click();

		Thread.sleep(20000);
		test.log(Status.PASS, "click your email");  
		driver.findElement(By.xpath("//android.widget.TextView[@text='Your Email']")).click();

		Thread.sleep(20000);
		test.log(Status.INFO, "Enter email");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Email or Username']")).sendKeys("ajith8982kumar@gmail.com");

		Thread.sleep(20000);
		test.log(Status.INFO, "Enter password");
		driver.findElement( By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Spotjo#2022");

		Thread.sleep(20000);
		test.log(Status.PASS, "Login");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='9']")).click();
		
     	Thread.sleep(20000);
     	test.log(Status.PASS, "click Dashboard");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='8']")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click job button");
		driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[12]")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Enter job name");
		driver.findElement(By.xpath("//android.widget.EditText[@text='New Job Title']")).sendKeys("Security testing ");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "How will you use your skill");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Fulltime']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Employment");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Employed']")).click();
		
		WebElement Panel = driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']"));
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.PASS, "Select job type");
		driver.findElement(By.xpath("//android.widget.Spinner[@index='1']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "select limited or unlimited");
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Limited']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "select from date");
		driver.findElement(By.xpath("//android.widget.TextView[@text='From Date']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click the date");
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"16 May 2022\"]")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click ok");
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "select end date");
		driver.findElement(By.xpath("//android.widget.TextView[@text='End Date']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click end date");
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"31 May 2022\"]")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click ok");
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "select Experience");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='4']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Search place");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search Place']")).sendKeys("chennai ");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "choose place");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chennai, Tamil Nadu, India']")).click();
		
		SwipeScreen(Panel,driver);
		
		SwipeScreen(Panel,driver);
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click Add skills");
		driver.findElement(By.xpath("//android.widget.TextView[@text='+Add Skills']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Enter skills");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Skills']")).sendKeys("3");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "choose skill");
		driver.findElement(By.xpath("//android.widget.TextView[@text='3-axis milling']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click next");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Rate your skill");
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click Finish");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click add skills");
		driver.findElement(By.xpath("//android.widget.TextView[@text='+Add Skills']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "enter skills");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Skills']")).sendKeys("3");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "choose skill");
		driver.findElement(By.xpath("//android.widget.TextView[@text='3D laser scanning']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click next");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "rate your skill");
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
	   Thread.sleep(20000);
	   test.log(Status.INFO, "click finish");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click add skills");
		driver.findElement(By.xpath("//android.widget.TextView[@text='+Add Skills']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "enter skill");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Skills']")).sendKeys("3");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "choose skill");
		driver.findElement(By.xpath("//android.widget.TextView[@text='3D simulation']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click next button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "rate your skill");
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click finish");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click salary");
		driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "choose salary ");
		driver.findElement(By.xpath("//android.widget.SeekBar[@index='2']")).click();
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.INFO, "select salary type");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Monthly']")).click();
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Add education");
		driver.findElement(By.xpath("//android.widget.TextView[@text='+Add Education']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "enter education");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Education']")).sendKeys("b");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "enter degree");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bachelor Degree']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click next button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "rate your skill");
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click finish");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Add language");
		driver.findElement(By.xpath("//android.widget.TextView[@text='+Add Language']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Enter language");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Language']")).sendKeys("english");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "choose language");
		driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click next button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "rate your language");
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click finish");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		SwipeScreen(Panel,driver);
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click branch");
		driver.findElement(By.xpath("//android.widget.TextView[@text='+Branch']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "Enter branch and industry");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Branch & Industry']")).sendKeys("computer");
		
		Thread.sleep(20000);
		test.log(Status.INFO, "select industry type");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Computer, Computer Science, IT']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click next");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
		Thread.sleep(20000);
		test.log(Status.FAIL, "rate your branch and industry");
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
		Thread.sleep(20000);
		test.log(Status.INFO, "click finish");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		SwipeScreen(Panel,driver);
		
		//Thread.sleep(20000);

		//driver.findElement(By.xpath("//android.widget.TextView[@text='+Profession']")).click();
		
		//Thread.sleep(20000);

		//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Branch & Industry']")).sendKeys("Coating");
		
		//Thread.sleep(20000);

		//driver.findElement(By.xpath("//android.widget.TextView[@text='Coating Technology']")).click();
		
		//Thread.sleep(20000);

		//driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
	//	Thread.sleep(20000);

	//	driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		
		//Thread.sleep(20000);

		//driver.findElement(By.xpath("//android.widget.TextView[@text='Finish']")).click();
		
		SwipeScreen(Panel,driver);
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[6]")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click Matched button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Matched']")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click listed jobs");
		driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[7]")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click company info");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Company Information']")).click();

	//	Thread.sleep(20000);
	//	test.log(Status.INFO, "enter branch");
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Branch']")).sendKeys("chennai");

	//	Thread.sleep(20000);
	//	test.log(Status.INFO, "enter mobile number");
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile Number']")).sendKeys("123456789");

	//	Thread.sleep(20000);
	//	test.log(Status.INFO, "enter website");
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='WebSite']")).sendKeys("https://spotjo.com/");

	//	Thread.sleep(20000);
	//	test.log(Status.INFO, "enter address");
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Address']")).sendKeys("Near busstand");

		Thread.sleep(20000);
		test.log(Status.SKIP, "click next");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']")).click();

		Thread.sleep(20000);
		test.log(Status.SKIP, "click next");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']")).click();

		Thread.sleep(20000);
		test.log(Status.PASS, "click user management");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='11']")).click();

		Thread.sleep(20000);
		test.log(Status.PASS, "click role image");
		driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();

		Thread.sleep(20000);
		test.log(Status.INFO, "click first name");
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).click();

		Thread.sleep(20000);
		test.log(Status.INFO, "enter first name");
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("VIJAY");

		Thread.sleep(20000);
		test.log(Status.INFO, "enter last name");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Last Name']")).sendKeys("KUMAR");

		Thread.sleep(20000);
		test.log(Status.INFO, "enter email");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email Address']")).sendKeys("vijay@gmail.com");

		Thread.sleep(20000);
		test.log(Status.INFO, "enter password");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Vijay@123");

		Thread.sleep(20000);
		test.log(Status.INFO, "confirm password");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password']")).sendKeys("Vijay@123");

		Thread.sleep(20000);
		test.log(Status.INFO, "select role");
		driver.findElement(By.xpath("//android.widget.Spinner[@index='0']")).click();

		Thread.sleep(20000);
		test.log(Status.INFO, "click admin or staff");
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='2']")).click();

	//	Thread.sleep(20000);
	//	test.log(Status.INFO, "create user");
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Create User']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click resource profile");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Resource Profiles']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click resume upload");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Resume Upload']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='5']")).click();
		
		Thread.sleep(20000);
		test.log(Status.PASS, "click my profile");
		driver.findElement(By.xpath("//android.widget.TextView[@text='My Profile']")).click();
		
		Thread.sleep(20000);
		test.log(Status.SKIP, "click back");
		driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		
		

         driver.quit();
	}
	
	
	public static void SwipeScreen(WebElement el, WebDriver driver) {
	WebElement Panel = el;
	
	Dimension dimension = Panel.getSize();
	 
	int Anchor = Panel.getSize().getHeight()/2;
	
	Double ScreenWidthStart = dimension.getWidth() * 0.8;
	int scrollStart = ScreenWidthStart.intValue();
	
	Double ScreenWidthEnd = dimension.getWidth() * 0.2;
	int scrollEnd = ScreenWidthEnd.intValue(); 
	
	
	
	   new TouchAction((PerformsTouchActions)driver)
	   .press(PointOption.point(scrollStart,Anchor))
	   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	   .moveTo(PointOption.point(scrollEnd, Anchor))
	   .release().perform();
	   
	   
	   
	
	    
	


}


}





	


