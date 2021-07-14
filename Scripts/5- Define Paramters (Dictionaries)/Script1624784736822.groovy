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
WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_English_TextBoxUserName'), 'administrator')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_English_TextBoxPassword'), '/5S6MFFLcE4mlsixtc6/Tg==')

'Click on Login'
WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Please type your email address_ButtonSignIn'))

'Click on Dictionaries'
WebUI.click(findTestObject('Object Repository/Page_Home/span_Dictionaries'))

'Click on Define Parameters'
WebUI.click(findTestObject('Object Repository/Page_Home/span_Define Parameters'))

'Click on New'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/a_New'))

'Enter Parameter'
WebUI.setText(findTestObject('Object Repository/Page_Define Parameters/input__TextBoxParameterElement'), 'fff')

'Choose Column Name'
WebUI.selectOptionByIndex(findTestObject('New Folder (1)/Page_Define Parameters/DropDownListColumnName'), '3')

'Click on Close and Save Button'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/input__ButtonSaveObjectsAndClose'))

'Choose Parameter Code'
WebUI.click(findTestObject('New Folder (2)/Page_Define Parameters/td_17'))

'Click on Edit'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/a_Edit'))

'Click on Save and Close'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/input__ButtonSaveObjectsAndClose'))

'Choose Parameter Code'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/td_37'))

'Click on Delete'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/a_Delete'))

'Click on Yes Button'
WebUI.click(findTestObject('Object Repository/Page_Define Parameters/input_Are you sure that you want to delete _b516f0'))

'Check he Confirmaiton Message'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Define Parameters/span_Completed Successfully'))

'Close Browser'
WebUI.closeBrowser()

