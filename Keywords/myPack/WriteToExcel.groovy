package myPack
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteToExcel {
  
  
  @Keyword
  public void demoKey1(itemName) throws IOException{
	FileInputStream fis = new FileInputStream("C:\\Katalon\\Excel Files\\checkoutData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	 
	XSSFSheet sheet = workbook.getSheet("Checkout_1");
	int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	//Item Name
	Row row1 = sheet.createRow(rowCount+1);
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
	  Row row1 = sheet.createRow(rowCount+1);
	  Cell cell1 = row1.createCell(2);
	  cell1.setCellValue(itemQuantity);
	  
	  FileOutputStream fos = new FileOutputStream("C:\\Katalon\\Excel Files\\checkoutData.xlsx");
	  workbook.write(fos);
	  fos.close();
	  
	}
  
  
  
  
  
  
}
