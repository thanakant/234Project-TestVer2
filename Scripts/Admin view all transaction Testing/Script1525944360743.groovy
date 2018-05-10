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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.223.223.31:8091/')

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/a_Total Transaction'))

WebUI.verifyElementText(findTestObject('For admin test case/Page_ProjectBackend/h2_Transaction List'), transactionText)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/Total before add'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement total = driver.findElement(By.xpath('//*[@id="add-row"]/div/div[2]/div/p'))

def adminBeforeAdd = total.getText()

adminBeforeAdd = adminBeforeAdd.replaceAll('Total price: ', '')

adminBeforeAdd = adminBeforeAdd.replaceAll(' THB', '')

adminBeforeAdd = adminBeforeAdd.replaceAll(',', '')

int adminBeforeAdd2 = Integer.parseInt(adminBeforeAdd)

println('Total before user add a transaction = ' + adminBeforeAdd2)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_Logout'))

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_username'), username2)

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_password'), password2)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_Login'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('For admin test case/Page_ProjectBackend/h5_Garden'), garden)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_add to cart'))

WebUI.verifyElementText(findTestObject('For admin test case/Page_ProjectBackend/h5_Banana'), banana)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/a_Carts            2'))

WebUI.verifyElementText(findTestObject('For admin test case/Page_ProjectBackend/td_Garden'), garden)

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_amount'), gardenNum)

WebUI.verifyElementText(findTestObject('For admin test case/Page_ProjectBackend/td_Banana'), banana)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/Total user add'))

WebDriver driver2 = DriverFactory.getWebDriver()

WebElement total2 = driver2.findElement(By.xpath('//*[@id="add-row"]/div/div[2]/div/p'))

def userTransaction = total2.getText()

userTransaction = userTransaction.replaceAll('Total price: ', '')

userTransaction = userTransaction.replaceAll(' THB', '')

userTransaction = userTransaction.replaceAll(',', '')

int userTransaction2 = Integer.parseInt(userTransaction)

println('Total of user add a transaction = ' + userTransaction2)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_Logout'))

WebUI.delay(2)

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_username'), 'admin')

WebUI.setText(findTestObject('For admin test case/Page_ProjectBackend/input_password'), 'admin')

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/a_Total Transaction'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('For admin test case/Page_ProjectBackend/h2_Transaction List'), transactionText)

WebUI.click(findTestObject('For admin test case/Page_ProjectBackend/Total after add'))

WebDriver driver3 = DriverFactory.getWebDriver()

WebElement total3 = driver3.findElement(By.xpath('//*[@id="add-row"]/div/div[2]/div/p'))

def adminAfterAdd = total3.getText()

adminAfterAdd = adminAfterAdd.replaceAll('Total price: ', '')

adminAfterAdd = adminAfterAdd.replaceAll(' THB', '')

adminAfterAdd = adminAfterAdd.replaceAll(',', '')

int adminAfterAdd2 = Integer.parseInt(adminAfterAdd)

println('Total after user add a transaction = ' + adminAfterAdd2)

int compare = userTransaction2 + adminBeforeAdd2

WebUI.verifyEqual(adminAfterAdd2, compare)

WebUI.closeBrowser()

