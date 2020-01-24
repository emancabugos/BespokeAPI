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

WebUI.comment('Categories')

if (varCategory == 'allcategories') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'multiplecategories') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category2.1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 2.1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category3.1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 3.1.1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category Name mAx 021!!@#$%^&!') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)
}

