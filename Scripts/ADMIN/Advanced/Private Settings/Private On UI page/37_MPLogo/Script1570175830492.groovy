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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.verifyElementPresent(findTestObject('ADMIN/Private Settings/Private Off UI/sidemenu_Private Settings'), 0)

if (true) {
    WebUI.verifyElementPresent(findTestObject('ADMIN/Private Settings/Private On UI/textlabel_AllGuestUsers'), 0)

    WebUI.click(findTestObject('ADMIN/Private Settings/toggle_on off'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Private Settings/Private On UI/button_Save'))

    WebUI.delay(0)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Private On/a_View Buyer List'), 0)

    WebUI.verifyElementVisible(findTestObject('ADMIN/Private Settings/Private On/a_View Buyer List'))
}

Else(false, { 
        WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Private Settings On UI/img_private settings'), 
            0)
    })

