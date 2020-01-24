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

WebUI.comment('Bulk Pricing')

if (varBulkPricing == 'yes') {
    if (varDiscount == 'allcountries') {
        WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_editMY'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlabel_EDIT BULK PRICING'), 
            0)

        if (varRange == 'Percentage_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Percentage_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Price_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Price_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Combination_1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Combination_1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPrice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards2') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards2'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPRice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPRice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        }
    } else if (varDiscount == 'multiplecountries') {
        WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_editPH'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlabel_EDIT BULK PRICING'), 
            0)

        if (varRange == 'Percentage_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Percentage_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Price_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Price_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Combination_1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Combination_1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPrice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards2') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards2'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPRice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPRice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        }
        
        WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_editSG'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlabel_EDIT BULK PRICING'), 
            0)

        if (varRange == 'Percentage_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Percentage_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Price_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Price_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Combination_1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Combination_1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPrice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards2') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards2'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPRice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPRice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        }
        
        WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_editMY'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlabel_EDIT BULK PRICING'), 
            0)

        if (varRange == 'Percentage_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Percentage_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Price_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Price_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Combination_1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Combination_1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPrice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards2') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards2'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPRice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPRice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        }
    } else if (varDiscount == 'singlecountry') {
        WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_edit'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlabel_EDIT BULK PRICING'), 
            0)

        if (varRange == 'Percentage_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Percentage_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Price_range1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Price_range1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'Combination_1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/Combination_1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'OnwardsPrice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/OnwardsPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards1') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwards2') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwards2'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPercent') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPercent'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } else if (varRange == 'CombiOnwardsPRice') {
            WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Bulk Pricing/CombiOnwardsPRice'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        }
    }
} else if (varBulkPricing == 'no') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_edit'), 0)
}

