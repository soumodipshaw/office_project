package ocean;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element 
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://codexapp.terrogence-global.com/latest");
		String path="C:\\Users\\Shaw\\Desktop\\Ocean_Auto\\ocean_data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String un = cell.toString();
		Thread.sleep(2000);
		System.out.println(un);
		//driver.findElement(By.xpath("//input[@id=\"emailLoginInput\"]")).sendKeys(un);
		
	}
}
