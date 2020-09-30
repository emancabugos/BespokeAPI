import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textarea_Item Description'), 0)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textarea_Item Description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam erat velit. Nunc consequat interdum varius sit. Mi sit amet mauris commodo quis imperdiet. Eu feugiat pretium nibh ipsum. Lacus vestibulum sed arcu non odio. Nam at lectus urna duis convallis convallis tellus id interdum. Lorem sed risus ultricies tristique. Volutpat consequat mauris nunc congue. Nulla facilisi cras fermentum odio eu feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam erat velit. Nunc consequat interdum varius sit. Mi sit amet mauris commodo quis imperdiet. Eu feugiat pretium nibh ipsum. Lacus vestibulum sed arcu non odio. Nam at lectus urna duis convallis convallis tellus id interdum. Lorem sed risus ultricies tristique. Volutpat consequat mauris nunc congue. Nulla facilisi cras fermentum odio eu feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam erat velit. Nunc consequat interdum varius sit. Mi sit amet mauris commodo quis imperdiet. Eu feugiat pretium nibh ipsum. Lacus vestibulum sed arcu non odio. Nam at lectus urna duis convallis convallis tellus id interdum. Lorem sed risus ultricies tristique. Volutpat consequat mauris nunc congue. Nulla facilisi cras fermentum odio eu feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam erat velit. Nunc consequat interdum varius sit. Mi sit amet mauris commodo quis imperdiet. Eu feugiat pretium nibh ipsum. Lacus vestibulum sed arcu non odio. Nam at lectus urna duis convallis convallis tellus id interdum. Lorem sed risus ultricies tristique. Volutpat consequat mauris nunc congue. Nulla facilisi cras fermentum odio eu feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit volutpat maecenas volutpat blandit aliquam etiam erat velit. Nunc consequat interdum varius sit. Mi sit amet mauris commodo quis imperdiet. Eu feugiat pretium nibh ipsum. Lacus vestibulum sed arcu non odio. Nam at lectus urna duis convallis convallis tellus id interdum. Lorem sed risus ultricies tristique. Volutpat consequat mauris nunc congue. Nulla facilisi cras fermentum odio eu feugiat.')

WebUI.getText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textarea_Item Description'))

