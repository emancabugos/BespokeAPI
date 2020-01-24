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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/logo_Marketplace'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ComparisonList'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation List/table_LIST NAME'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation List/button_Add New List'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/textlabel_List Name'), 0)

evallist1 = WebUI.setText(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/textbox_name'), evallist)

//WebUI.click(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/button_Save'))

//if (WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/2_Pagination',0))({ 
     //   WebUI.verifyTextPresent(findTestData('CONSUMER/Evaluation List').getValue(1, 1), false)
   // })) {
///} else {
  //  WebUI.click(findTestObject('CONSUMER/Evaluation List/2_Pagination'))
	//WebUI.verifyTextPresent(findTestData('CONSUMER/Evaluation List').getValue(1, 1), false)
	
//}

