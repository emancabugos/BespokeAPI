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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), varListingName)

WebUI.comment('Categories')

if (varCategory == 'allcategory') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'multiplecategory') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category1') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category2.1') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/Category 2.1'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 2.1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category3.1') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/Category 3.1.1'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 3.1.1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category Name mAx 021!!@#$%^&!') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/maxcat'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), varImage)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_price'), 0)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_price'), varPrice)

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_SKU'), 0)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_SKU'), varSKU)

WebUI.comment('Variants')

if (varVariants == 'yes') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('Variant Options')

    if (varVariantOption == 'option1') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 0)

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 'Color')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices1'), 'Green,Blue,Black,Pink,')

        WebDriver driver = DriverFactory.getWebDriver()

        'To locate table'
        WebElement Table = driver.findElement(By.xpath('//table/tbody'))

        'To locate rows of table it will Capture all the rows available in the table'
        List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

        'To calculate no of rows In table'
        int rows_count = rows_table.size()

        if (varStock == 'unlimited') {
            WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_unlimited all'), FailureHandling.STOP_ON_FAILURE)
        } else if (varStock == '1000') {
            for (int pos = 1; pos <= rows_count; pos++) {
                TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                    pos) + ']/td[7]/input')

                WebUI.setText(element, '1000')
            }
        } else if (varStock == '0') {
            for (int pos = 1; pos <= rows_count; pos++) {
                TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                    pos) + ']/td[7]/input')

                WebUI.setText(element, '0')
            }
        }
        
        for (int pos = 1; pos <= rows_count; pos++) {
            TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                pos) + ']/td[4]/input')

            WebUI.setText(element, 'VARSKU' + pos)
        }
        
        for (int pos = 1; pos <= rows_count; pos++) {
            TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                pos) + ']/td[5]/input')

            WebUI.setText(element, '.75')
        }
    } else if (varVariantOption == 'option2') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 0)

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 'Color')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices1'), 'Green,Blue,Black,Pink,')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option2'), 'Size')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices2'), 'Small,Medium,Large,XXL,')

        WebDriver driver = DriverFactory.getWebDriver()

        'To locate table'
        WebElement Table = driver.findElement(By.xpath('//table/tbody'))

        'To locate rows of table it will Capture all the rows available in the table'
        List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

        'To calculate no of rows In table'
        int rows_count = rows_table.size()

        if (varStock == 'unlimited') {
            WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_unlimited all'), FailureHandling.STOP_ON_FAILURE)
        } else if (varStock == '1000') {
            for (int pos = 1; pos <= rows_count; pos++) {
                TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                    pos) + ']/td[8]/input')

                WebUI.setText(element, '1000')
            }
        } else if (varStock == '0') {
            for (int pos = 1; pos <= rows_count; pos++) {
                TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                    pos) + ']/td[8]/input')

                WebUI.setText(element, '0')
            }
        }
        
        for (int pos = 1; pos <= rows_count; pos++) {
            TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                pos) + ']/td[5]/input')

            WebUI.setText(element, 'VARSKU' + pos)
        }
        
        for (int pos = 1; pos <= rows_count; pos++) {
            TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                pos) + ']/td[6]/input')

            WebUI.setText(element, '.75')
        }
    } else if (varVariantOption == 'option3') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 0)

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 'Color')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices1'), 'Green,Blue,Black,Pink,')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option2'), 'Size')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices2'), 'Small,Medium,Large,XXL,')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option3'), 'Design')

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices3'), 'Stripes,Dotted,Plain,')

        WebDriver driver = DriverFactory.getWebDriver()

        'To locate table'
        WebElement Table = driver.findElement(By.xpath('//table/tbody'))

        'To locate rows of table it will Capture all the rows available in the table'
        List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

        'To calculate no of rows In table'
        int rows_count = rows_table.size()

        if (varStock == 'unlimited') {
            WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_unlimited all'), FailureHandling.STOP_ON_FAILURE)
        } else if (varStock == '1000') {
            for (int pos = 1; pos <= rows_count; pos++) {
                TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                    pos) + ']/td[9]/input')

                WebUI.setText(element, '1000')
            }
        } else if (varStock == '0') {
            for (int pos = 1; pos <= rows_count; pos++) {
                TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                    pos) + ']/td[9]/input')

                WebUI.setText(element, '0')
            }
        }
        
        for (int pos = 1; pos <= rows_count; pos++) {
            TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                pos) + ']/td[6]/input')

            WebUI.setText(element, 'VARSKU' + pos)
        }
        
        for (int pos = 1; pos <= rows_count; pos++) {
            TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
                pos) + ']/td[7]/input')

            WebUI.setText(element, '.75')
        }
    }
} else if (varVariants == 'no') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), 0)

    if (varStock == 'unlimited') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_qty'), 0)

        WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_unlimited'), FailureHandling.STOP_ON_FAILURE)
    } else if (varStock == '1000') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_qty'), 0)

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_qty'), '1000')
    } else if (varStock == '0') {
        WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_qty'), 0)

        WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_qty'), '0')
    }
}

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), varDescription)

WebUI.comment('Custom Fields')

WebUI.delay(2)

if (varCategory == 'allcategory') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_allcategory'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'multiplecategory') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_allcategory'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category1') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_Category1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category2.1') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_category2.1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category3.1') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_3.1.1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category Name mAx 021!!@#$%^&!') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)
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

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inventory Page/button_ Upload Item'), 0)

