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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.223.223.31:8091/')

WebUI.setText(findTestObject('For test case 4/Page_ProjectBackend/input_username'), 'admin')

WebUI.setText(findTestObject('For test case 4/Page_ProjectBackend/input_password'), 'admin')

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/a_Total Transaction'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_1'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_20120 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_2'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Banana Garden Banana Rambut'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_60570 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_3'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_21288 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_4'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_21288 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_5'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_41750 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_6'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_41288 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_7'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_20462 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_8'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_20462 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_9'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/td_60462 THB'))

WebUI.click(findTestObject('For test case 4/Page_ProjectBackend/p_Total price  307690 THB'))

WebUI.closeBrowser()

