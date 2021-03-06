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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat
import org.openqa.selenium.Keys as Keys
import java.text.NumberFormat as NumberFormat
import org.junit.After as After
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File itempriceTmp = tmpDir.resolve('itemprice.txt').toFile()

File qtyTmp = tmpDir.resolve('qty.txt').toFile()

File fsubtotalTmp = tmpDir.resolve('fsubtotal.txt').toFile()

File itemnameTmp = tmpDir.resolve('itemname.txt').toFile()

File chargeTmp = tmpDir.resolve('charge.txt').toFile()

File discountTmp = tmpDir.resolve('fsubtotal.txt').toFile()

File deliveryTmp = tmpDir.resolve('delivery.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File total2Tmp = tmpDir.resolve('total2.txt').toFile()

File admincostTmp = tmpDir.resolve('admincost.txt').toFile()

File totalcostTmp = tmpDir.resolve('totalcost.txt').toFile()

WebUI.delay(0)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/textlabelValue_InvoiceID'))

WebUI.delay(0)

WebUI.verifyTextPresent(fsubtotalTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent(chargeTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent(discountTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent(admincostTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent(totalcostTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

