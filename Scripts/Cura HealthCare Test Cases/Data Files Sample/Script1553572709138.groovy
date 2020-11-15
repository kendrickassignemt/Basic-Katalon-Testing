import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

int rows

String username

String password

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

TestData accounts = findTestData('Data Files/Cura Data Files/New Excel Data')

//rows = accounts.getRowNumbers()
//username = accounts.getObjectValue(2, 1)
//password = accounts.getObjectValue(3, 1)
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), accounts.getObjectValue(2, 1))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), accounts.getObjectValue(3, 1))

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.waitForPageLoad(45)

