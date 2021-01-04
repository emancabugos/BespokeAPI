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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Inventory'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Inventory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), 0)

WebUI.click(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textlabel_Listing Name'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Listing Name'), (varListingName + ' ') + 
    GlobalVariable.CustomMerchant)

WebUI.comment('Categories')

if (varCategory == 'allcategory') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/linktext_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/linktext_Select all'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 0%') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category0percent'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category0percent'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 1%') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category1percent'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category1percent'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 99%') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category99percent'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category99percent'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 100%') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category100percent'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category100percent'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category Name mAx 021!!@#$%^&!') {
    WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Category(s)'), varCategory)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/maxcat'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Item Service')

if (varItemService == 'both') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), 
        0)

    WebUI.delay(1)

    WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varItemService == 'nego') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Spot Purchase_check-indicator'), 
        0)

    WebUI.delay(1)

    WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Spot Purchase_check-indicator'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1)

    WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varItemService == 'spot') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Spot Purchase_check-indicator'), 
        0)
}

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), varImage)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Item Description'), varDescription)

WebUI.comment('Custom Fields')

WebUI.delay(2)

if (varCategory == 'allcategory') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_allcategory'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 0%') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 1%') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 99%') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 100%') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category Name mAx 021!!@#$%^&!') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Price'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Price'), varPrice)

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_SKU'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_SKU'), varSKU)

WebUI.comment('Variants')

if (varVariants == 'yes') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('Variant Options')

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 0)

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 'Color')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices1'), 'Blue,')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option2'), 'Size')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices2'), 'Small,Medium,')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option3'), 'Material')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices3'), 'Glass,Plastic,')

    WebDriver driver = DriverFactory.getWebDriver()

    'To locate table'
    WebElement Table = driver.findElement(By.xpath('//table/tbody'))

    'To locate rows of table it will Capture all the rows available in the table'
    List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

    'To calculate no of rows In table'
    int rows_count = rows_table.size()

    for (int pos = 1; pos <= rows_count; pos++) {
        TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[1]/div[3]/div/div[5]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
            pos) + ']/td[6]/input')

        WebUI.setText(element, 'VARSKU' + pos)
    }
    
    WebUI.comment('Surcharge')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge1'), '10.5')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge2'), '1541.51')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge3'), '100.5')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge4'), '0.5')

    WebUI.comment('Stock')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock1'), '100')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock2'), '5')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock3'), '0')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock4'), '1000')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock5'), '10')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock6'), '5')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock7'), '0')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock8'), '1000')
} else if (varVariants == 'no') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield__item-quantity'), 
        0)

    if (varLimit == 'unlimited') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield__item-quantity'), 
            0)

        WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/toggle_unlimited'), FailureHandling.STOP_ON_FAILURE)
    } else if (varLimit == 'limited') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield__item-quantity'), 
            0)

        WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield__item-quantity'), varStock)
    }
}

WebUI.comment('Delivery Method')

if (varDeliveryMethod == 'deliver') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), FailureHandling.STOP_ON_FAILURE)
} else if (varDeliveryMethod == 'pickup') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_pickup all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_pickup all'), FailureHandling.STOP_ON_FAILURE)
} else if (varDeliveryMethod == 'both') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_pickup all'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('Save')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), 0)

