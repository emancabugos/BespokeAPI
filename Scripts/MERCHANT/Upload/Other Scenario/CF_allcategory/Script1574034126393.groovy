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

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/text1'), 'Text1')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/text2'), 'Text2')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/p'), 'TextEDITOR')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/hyperlink1'), 'arcadier.com')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/email1'), 'arcadierteam@gmail.com')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/percentage1'), '69.9')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/number1'), '66')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/number2'), '99')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb1.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb1.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb1.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb2.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb2.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb2.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/dd1'), 'SP_Drop Down_M1DD5', false)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/dd2'), 'SP_Drop Down_M2DD5', false)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/location1'), 'Makati City')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/date1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/time1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/date2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/time2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/video1'), '<iframe width="640" height="480" src="https://www.youtube.com/embed/GsbOwc_hWcM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>')

WebUI.uploadFile(findTestObject('MERCHANT/Upload Item Page/Custom Fields/category1/pdf1'), 'C:\\Users\\Arcadier\\git\\Trillia\\Images\\PDF\\1mb.pdf')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb3.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb3.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb3.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb4.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb4.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb4.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/dd3'), 'SPC_Drop Down_M1DD6', false)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/dd4'), 'SPC_Drop Down_M2DD6', false)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb5.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb5.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb5.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb6.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb6.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/cb6.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/dd5'), 'SPG_Drop Down_M1DD7', false)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/dd6'), 'SPG_Drop Down_M2DD7', false)

