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
import com.thoughtworks.selenium.webdriven.commands.GetText as GetText

DoExecute()

def DoExecute()
{
	
	WebUI.openBrowser('')
	WebUI.navigateToUrl(GlobalVariable.seedURL)
	
	boolean flagButton = false
	
	flagButton = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'), 20)
	
	if(flagButton){
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))
		WebUI.closeBrowser()
	}
	
	else{
		println("Error, link not found!")
	}
			
}