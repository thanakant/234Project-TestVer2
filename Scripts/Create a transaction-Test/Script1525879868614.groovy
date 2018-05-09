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

WebUI.setText(findTestObject('For test case create a transaction/Page_ProjectBackend/input_username'), 'user')

WebUI.setText(findTestObject('For test case create a transaction/Page_ProjectBackend/input_password'), 'user')

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_Login'))

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/h5_Garden'), gardenName)

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_add to cart'))

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/h5_Banana'), bananaName)

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_add to cart'))

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/h5_Orange'), orangeName)

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_add to cart'))

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/h5_Papaya'), papayaName)

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_add to cart'))

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/h5_Rambutan'), rambutanName)

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/a_Carts            5'))

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_Garden'), gardenName)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_20000 THB'), gardenPrice)

WebUI.setText(findTestObject('For test case create a transaction/Page_ProjectBackend/input_amount'), garden)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_Banana'), bananaName)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_150 THB'), bananaPrice)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_Orange'), orangeName)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_280 THB'), orangePrice)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_Papaya'), papayaName)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_12 THB'), papayaPrice)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_Rambutan'), rambutanName)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/td_20 THB'), rambutanPrice)

WebUI.verifyElementText(findTestObject('For test case create a transaction/Page_ProjectBackend/p_Total price  60462 THB'), total)

WebUI.click(findTestObject('For test case create a transaction/Page_ProjectBackend/button_confirm'))

WebUI.closeBrowser()

