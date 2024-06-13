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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Benua Lawas', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Bintang Ara', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Haruai', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Jaro', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Kelua', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Muara Harus', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Murung Pudak', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Muara Uya', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Pugaan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Tanta', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Tanjung', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Sekolah Kabupaten Tabalong/select_Pilih Kecamatan                     _684349'), 
    'Upau', true)

WebUI.closeBrowser()

