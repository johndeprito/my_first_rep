package javalearnings;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingExceldata extends BaseTest {
public String excelFileName = ("./testdata/sampleTestData.xlsx");	

@DataProvider(name = "nametobecalled")
public Object[][] sendData() throws IOException{
	
	return FetchDataFromExcel.excelRead(excelFileName);
}
@Test(dataProvider = "nametobecalled")
public void gettingData(String name, String mobile, String message) throws InterruptedException {
	launcurlApplication();
	driver.get("https://oceanacademy.in/");
	driver.findElement(By.xpath("(//a[contains(@class,'me')])[3]")).click();
	driver.findElement(By.id("Name")).sendKeys(name);
	driver.findElement(By.id("Email")).sendKeys(mobile);
	driver.findElement(By.id("mes")).sendKeys(message);
	
}
}