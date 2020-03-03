import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/weight'), '.25')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/textfield1'), 'Text1')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/textfield2'), 'Text2')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/p'), 'TextEDITOR')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/hyperlink'), 'arcadier.com')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/email'), 'arcadierteam@gmail.com')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/percentage'), '69')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/number'), '66')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/number2'), '96')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/checkbox1.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/checkbox1.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/checkbox1.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/checkbox2.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/checkbox2.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/checkbox2.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/dd_1'), 'SP_Drop Down_M1DD5', 
    false)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/dd_2'), 'SP_Drop Down_M2DD5', 
    false)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/location'), 'Makati City')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/date1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/time1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/date2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/time2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/video'), '<iframe width="640" height="480" src="https://www.youtube.com/embed/GsbOwc_hWcM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>')

WebUI.uploadFile(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/pdf1'), 'C:\\Users\\April\\git\\Trillia\\Images\\PDF\\1mb.pdf')

