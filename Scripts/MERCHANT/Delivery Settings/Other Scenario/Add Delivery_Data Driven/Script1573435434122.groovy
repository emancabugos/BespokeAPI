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

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/button_Add Delivery Option'), 
    0)

if (varDelMethod == 'deliver') {
    WebUI.click(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/button_Add Delivery Option'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Add  Edit Delivery option'), 
        0)

    WebUI.comment('Deliver Option Name')

    WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivery option name'), varDeliveryName)

    WebUI.comment('Delivers to')

    if (varDeliverysTo == 'allcountries') {
        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/a_Select all'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/a_Select all'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliverysTo == 'multiplecountries') {
        WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 'Myanmar')

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_MY'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_MY'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 'Philippines')

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_PH'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_PH'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 'Singapore')

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_SG'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_SG'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliverysTo == 'PH') {
        WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 'Philippines')

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_PH'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_PH'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliverysTo == 'MY') {
        WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 'Myanmar')

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_MY'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_MY'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliverysTo == 'SG') {
        WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 'Singapore')

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_SG'), 0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/checkbox_SG'), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.comment('Min Lead Time')

    WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_minimum_time'), varMinLeadTime)

    WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivering_from'), 'SINGAPORE')

    WebUI.comment('Unit')

    if (varUnit == 'weight') {
        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Change Unit/label_Weight (kg)'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varUnit == 'price') {
        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Change Unit/label_Price'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Change Unit/textlabel_Warning This will change how'), 
            0)

        WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Change Unit/button_okay'), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.comment('Add Delivery Rate')

    if (varDeliveryName == 'Merchant Delivery A') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_AC'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery B') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_BD'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery C') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_AC'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery D') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_BD'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery E') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_E'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery F') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_F'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery G') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_G'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery H') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_H'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery I') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_IK'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery J') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_JLMAX'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery K') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_IK'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery L') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_JLMAX'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    } else if (varDeliveryName == 'Merchant Delivery Maximum Ch@racters2!#') {
        WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Other Scenario/Delivery Rate Range/DeliveryRate_JLMAX'), 
            [(varDeliveryName) : varDeliveryName], FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.comment('Pickup')
} else if (varDelMethod == 'pickup') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/textbox_pickup'), 
        0)

    WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/textbox_pickup'), varDeliveryName)

    WebUI.click(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/button_Add Pick-up Option'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
}

