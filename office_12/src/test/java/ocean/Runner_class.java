package ocean;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Runner_class extends Base_class
{
	@Test(dataProvider ="auto")
	public void test1(String ln,String csv) throws AWTException, InterruptedException 
	{
		Robot rbt = new Robot();
		driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer'][1]")).click();
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("casecheck.co");
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='google']")).click();
		driver.findElement(By.name("last_name")).sendKeys(ln);
		test.log(LogStatus.PASS, "pass");
		driver.findElement(By.name("csv_name")).sendKeys(csv);
		test.log(LogStatus.PASS, "pass");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		driver.findElement(By.id("searchBtn")).click();
		//Thread.sleep(5000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

		 
	} 
	
	@Test(dataProvider ="auto")
	public void test2 (String ln,String csv) throws AWTException, InterruptedException 
	{
		Robot rbt = new Robot();
		driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer'][1]")).click();
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("scamsearch.io");
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='google']")).click();
		driver.findElement(By.name("last_name")).sendKeys(ln);
		test.log(LogStatus.PASS, "pass");
		driver.findElement(By.name("csv_name")).sendKeys(csv);
		test.log(LogStatus.PASS, "pass");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		driver.findElement(By.id("searchBtn")).click();
		//Thread.sleep(5000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	

		 
	} 
	

}
