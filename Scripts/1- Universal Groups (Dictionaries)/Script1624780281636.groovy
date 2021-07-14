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

'Navigate to Bank-Bi Oracle'
WebUI.navigateToUrl('http://bor4dev/Deployment/UI/Default.aspx')

'Maximize Window'
WebUI.maximizeWindow()

'Enter UserName'
WebUI.setText(findTestObject('Object Repository/Universal Groups/Page_Login Page/input_English_TextBoxUserName'), 'administrator')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Universal Groups/Page_Login Page/input_English_TextBoxPassword'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

'Click on Login Button'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Login Page/input_Please type your email address_ButtonSignIn'))

'Click on Dictionaries'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Home/span_Dictionaries'))

'Click on Universal Group'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Home/span_Universal Groups'))

'Choose Group'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/span_testD03'))

'Click on Edit Icon'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/a_Edit'))

'Click on Save and Close Button'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/input_Risk Weight_ctl00ContentPlaceHolderMa_644b96'))

'Choose Group '
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/span_testD03'))

'Click on Details'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/a_Details'))

'Click on Close'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/a_Close'))

'Click on Implementation'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/a_Implementation'))

'Choose Group'
WebUI.click(findTestObject('Page_Universal Groups/span_testD03'))

'choose Ledger Code'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/input_items inpages_TabMasterRadGridObjects_446658'))

'Confitmation Popup'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/input_Risk weight required numbers not stri_be2de2'))

'Confitmation Popup'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/input_The process is successfully completed_9e7d2c'))

'Click on Ok'
WebUI.click(findTestObject('Object Repository/Universal Groups/Page_Universal Groups/img_Custom_dxWeb_pcCloseButton_Office2010Blue'))

'Close the Browser'
WebUI.closeBrowser()

