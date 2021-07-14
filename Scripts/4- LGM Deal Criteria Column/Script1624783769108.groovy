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

'Maximise Window'
WebUI.maximizeWindow()

'Enter UserName'
WebUI.setText(findTestObject('Object Repository/LGM Criteria/Page_Login Page/input_English_TextBoxUserName'), 'administrator')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/LGM Criteria/Page_Login Page/input_English_TextBoxPassword'), '/5S6MFFLcE4mlsixtc6/Tg==')

'Click on Login'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_Login Page/input_Please type your email address_ButtonSignIn'))

'Click on Dictionaries'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_Home/span_Dictionaries'))

'Click on LGM Deal Criteria '
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_Home/span_LGM Deal Criteria Column'))

'Click on New'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/a_New'))

'Enter Column Name'
WebUI.setText(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/input__ctl00ContentPlaceHolderMasterContent_b0dd16'), 
    '100')

'Enter Column Description'
WebUI.setText(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/input__ctl00ContentPlaceHolderMasterContent_f1ad1e'), 
    'Test')

'Click on Save and CLose'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/input_Using Non Numeric Flag_ctl00ContentPl_78cd14'))

'Check the Confirmation Popup'
WebUI.verifyElementVisible(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/span_Completed Successfully'))

'Choose Column Name'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/td_02'))

'Click on Edit'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/a_Edit'))

'Click on Save and Close'
WebUI.click(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/input_Using Non Numeric Flag_ctl00ContentPl_78cd14'))

'Check the Confirmation Popup'
WebUI.verifyElementVisible(findTestObject('Object Repository/LGM Criteria/Page_LGM Deal Criteria Column/span_Completed Successfully'))

'Choose Column Code'
WebUI.click(findTestObject('Object Repository/Page_LGM Deal Criteria Column/td_100'))

'Click on Delete'
WebUI.click(findTestObject('Object Repository/Page_LGM Deal Criteria Column/a_Delete'))

'Click on Yes'
WebUI.click(findTestObject('Object Repository/Page_LGM Deal Criteria Column/input_Are you sure that you want to delete _19c7dc'))

'Check the Confirmation Popup'
WebUI.click(findTestObject('Object Repository/Page_LGM Deal Criteria Column/span_Completed Successfully'))

'Close Browser'
WebUI.closeBrowser()

