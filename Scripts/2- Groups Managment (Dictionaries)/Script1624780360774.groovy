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

'Maximze Window'
WebUI.maximizeWindow()

'Enter UserName'
WebUI.setText(findTestObject('Object Repository/Groups Managment/Page_Login Page/input_English_TextBoxUserName'), 'administrator')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Groups Managment/Page_Login Page/input_English_TextBoxPassword'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

'Click on Login Button'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Login Page/input_Please type your email address_ButtonSignIn'))

'Click on Dictionaries'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Home/span_Dictionaries'))

'Click on Groups Managment'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Home/span_Groups Management'))

'Click on New Icon'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_New'))

'Enter Scenario Nsme'
WebUI.setText(findTestObject('Object Repository/Groups Managment/Page_Groups Management/input__ctl00ContentPlaceHolderMasterContent_e695d1'), 
    'test')

'Enter Scenario Description'
WebUI.setText(findTestObject('Object Repository/Groups Managment/Page_Groups Management/input_Scenario description_ctl00ContentPlac_46918a'), 
    'test')

'Click on Save and Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/input_Deal Flag_ctl00ContentPlaceHolderMast_4d6e09'))

'Check from Confirmation Popup'
WebUI.verifyElementVisible(findTestObject('Object Repository/Groups Managment/Page_Groups Management/span_Completed Successfully'), 
    FailureHandling.STOP_ON_FAILURE)

'Choose Group'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/td_13000063'))

'Click on Edit Icon'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_Edit'))

'Click on Save and Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/input_Deal Flag_ctl00ContentPlaceHolderMast_4d6e09'))

'CHoose Group\r\n'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/td_13000063'))

'Click on Details'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_Details'))

'Click on Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_Close'))

'Click on Assign Account'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_Assign Accounts'))

'Click on Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/img_The process is successfully completed_d_9cf05f'))

'Click on View Account'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_View Accounts'))

'Click on Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/img_The process is successfully completed_d_9cf05f'))

'Click on Implementation'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_Implementation'))

'Click on Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/img_The process is successfully completed_d_9cf05f'))

'Click on Hierarchies'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/a_Hierarchies'))

'Click on Close'
WebUI.click(findTestObject('Object Repository/Groups Managment/Page_Groups Management/img_The process is successfully completed_d_9cf05f'))

'Close the Browser'
WebUI.closeBrowser()

