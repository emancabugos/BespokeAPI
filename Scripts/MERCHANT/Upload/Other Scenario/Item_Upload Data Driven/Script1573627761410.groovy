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

WebUI.delay(2)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), varDescription)

WebUI.comment('Custom Fields')

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

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

WebUI.comment('Country')

WebUI.delay(2)

if (varDeliversTo == 'allcountries') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'multiplecountries') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/PH'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/PH'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/SG'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/SG'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/MY'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/MY'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'MY') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/MY'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/MY'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'PH') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/PH'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/PH'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'SG') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/SG'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/SG'), FailureHandling.CONTINUE_ON_FAILURE)
}

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

WebUI.comment('MOQ')

WebUI.delay(2)

if (varMOQCount == 'allcountries') {
    WebUI.delay(1)
} else if (varMOQCount == 'multiplecountries') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/MOQ Field/PH'), '100')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/MOQ Field/SG'), '30')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/MOQ Field/MY'), '25')
} else if (varMOQCount == 'SingleCountry') {
    for (int pos = 1; pos <= rows_count; pos++) {
        TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div/table/tbody/tr[' + 
            pos) + ']/td[3]/input')

        WebUI.setText(element, varMOQ)
    }
}

WebUI.comment('Stock')

WebUI.delay(1)

if (varStock == 'unlimited') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_unlimited'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_unlimited'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varStock == 'multiplecountries') {
    for (int pos = 1; pos <= rows_count; pos++) {
        TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div/table/tbody/tr[' + 
            pos) + ']/td[4]/input')

        WebUI.setText(element, varStock)
    }
} else if (varStock == '1000') {
    for (int pos = 1; pos <= rows_count; pos++) {
        TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div/table/tbody/tr[' + 
            pos) + ']/td[4]/input')

        WebUI.setText(element, varStock)
    }
} else if (varStock == '0') {
    for (int pos = 1; pos <= rows_count; pos++) {
        TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div/table/tbody/tr[' + 
            pos) + ']/td[4]/input')

        WebUI.setText(element, varStock)
    }
}

WebUI.comment('Bulk Pricing')

WebUI.delay(2)

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
        WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

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
        
        WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

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
        
        WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

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

WebUI.comment('Price')

WebUI.delay(2)

if (varDeliversTo == 'allcountries') {
    WebUI.delay(2)

    for (int pos = 1; pos <= rows_count; pos++) {
        TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[2]/div/div/div[5]/div[2]/div/div/div/table/tbody/tr[' + 
            pos) + ']/td[2]/input')

        WebUI.setText(element, varPrice)
    }
} else if (varDeliversTo == 'multiplecountries') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Price/PH'), '14.25')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Price/SG'), '15')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Price/MY'), '17')
} else if (varDeliversTo == 'PH') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/textbox_pricing'), varPrice)
} else if (varDeliversTo == 'SG') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/textbox_pricing'), varPrice)
} else if (varDeliversTo == 'MY') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/textbox_pricing'), varPrice)
}

WebUI.comment('Delivery Method')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Pickup')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Click Upload Button')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inventory Page/button_ Upload Item'), 0)

