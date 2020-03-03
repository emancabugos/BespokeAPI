package myPack
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.FileOutputStream as FileOutputStream
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle as XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook


public class WriteToExcel {


	@Keyword



	public void demoKey1(itemName) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Katalon\\Excel Files\\checkoutData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Checkout_1");
		int rowCount = sheet.getLastRowNum()+sheet.getFirstRowNum();
		//Item Name
		Row row1 = sheet.createRow(rowCount+0);
		Cell cell1 = row1.createCell(1);
		cell1.setCellValue(itemName);

		FileOutputStream fos = new FileOutputStream("C:\\Katalon\\Excel Files\\checkoutData.xlsx");
		workbook.write(fos);
		fos.close();

	}

	public void demoKey2(itemQuantity) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Katalon\\Excel Files\\checkoutData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Checkout_1");
		int rowCount = sheet.getLastRowNum();

		//Item Quantity
		Row row1 = sheet.createRow(rowCount+0);
		Cell cell1 = row1.createCell(2);
		cell1.setCellValue(itemQuantity);


		FileOutputStream fos = new FileOutputStream("C:\\Katalon\\Excel Files\\checkoutData.xlsx");
		workbook.write(fos);
		fos.close();

	}
}
