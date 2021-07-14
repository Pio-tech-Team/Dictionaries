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
import org.openqa.selenium.Keys as Keys

'Open Browser'
WebUI.openBrowser('')

'Navigate to Bank-Bi Oracle\r\n'
WebUI.navigateToUrl('http://bor4dev/Deployment/UI/Default.aspx')

'Maximise Window'
WebUI.maximizeWindow()

'Enter UserName'
WebUI.setText(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Login Page/input_English_TextBoxUserName'), 
    'administrator')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Login Page/input_English_TextBoxPassword'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

'Click on Login Button'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Login Page/input_Please type your email address_ButtonSignIn'))

'Click on Dictionaries'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Home/span_Dictionaries'))

'Click on Ledger Trasnaction Grouping'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Home/span_Ledger Transaction Grouping'))

'Click on New Icon'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/a_New'))

'Enter English Description'
WebUI.setText(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/input__ctl00ContentPlaceHolderMasterContent_446310'), 
    'test')

'Enter Native Description'
WebUI.setText(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/input_Native description_ctl00ContentPlaceH_1bbcda'), 
    'ef')

'Click on Save and Close'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/input_Is Dummy_ctl00ContentPlaceHolderMaste_18f547'))

'Check the Confirmation Popup'
WebUI.verifyElementVisible(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/span_Completed Successfully'))

'Choose Transaction Ledger'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/td_All deposit transaction types'))

'Click on Edit'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/a_Edit'))

'Click on Save and Close'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/input_Is Dummy_ctl00ContentPlaceHolderMaste_18f547'))

'Choose Transaction Ledger'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/td_All deposit transaction types'))

'Click on Details'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/a_Details'))

'Close Details'
WebUI.click(findTestObject('Object Repository/Ledger Transaction Grouping/Page_Ledger Transaction Grouping/a_Close_1'))

'CLose the Browser'
WebUI.closeBrowser()

