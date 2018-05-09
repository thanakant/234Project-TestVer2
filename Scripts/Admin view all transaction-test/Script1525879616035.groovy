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

WebUI.setText(findTestObject('For admin-test/Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('For admin-test/Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('For admin-test/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('For admin-test/Page_ProjectBackend/a_Total Transaction'))

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_1'), row1)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Papaya'), pname1)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_20120 THB'), amount1)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_2'), row2)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Banana Garden Banana Rambut'), pname2)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_60570 THB'), amount2)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_3'), row3)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname3)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_21288 THB'), amount3)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_4'), row4)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname4)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_21288 THB'), amount4)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_5'), row5)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname5)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_41750 THB'), amount5)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_6'), row6)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname6)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_41288 THB'), amount6)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_7'), row7)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname7)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_20462 THB'), amount7)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_8'), row8)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname8)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_20462 THB'), amount8)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_9'), row9)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_Garden Banana Orange Papaya'), pname9)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/td_60462 THB'), amount9)

WebUI.verifyElementText(findTestObject('For admin-test/Page_ProjectBackend/p_Total price  307690 THB'), total)

WebUI.closeBrowser()

