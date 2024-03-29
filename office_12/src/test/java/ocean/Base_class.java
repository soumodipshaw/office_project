package ocean;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class implements Base_constant
{
	public ExtentReports report;
	public ExtentTest test;
	@BeforeClass
	public void report()
	{
		report=new ExtentReports("./Reports/defect.html");
		test=report.startTest("Runner_class");
	}
	WebDriver driver;
	@DataProvider (name="auto")
	public Object[][] data()
	{
		return new Object[][]
		    {
			{"jackson","abc"}
			
				
	        };
	}
	@BeforeMethod
	public void open_app()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
	@AfterMethod
	public void close_app() 
	{
		driver.close();
	}
	@AfterClass
	public void close()
	{
		report.endTest(test);
		report.flush();
	} 
}
