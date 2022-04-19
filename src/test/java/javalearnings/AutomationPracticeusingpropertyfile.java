package javalearnings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationPracticeusingpropertyfile extends BaseTest {
	public AutomationPracticeusingpropertyfile() throws FileNotFoundException, IOException{
		prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
		}
	@Test
	public void Testcase() {
		launcurlApplication();
		driver.get(prop.getProperty("URL"));
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys(prop.getProperty("USERNAME"));
		driver.findElement(By.xpath("//button[contains(@name,'SubmitCreate')]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(By.id("customer_lastname")).sendKeys(prop.getProperty("LastName"));
		driver.findElement(By.id("passwd")).sendKeys("Passcode");
		
		WebElement day = driver.findElement(By.id("days"));
		Select daysSelection = new Select(day);
		daysSelection.selectByValue("14");
		
		WebElement months = driver.findElement(By.id("months"));
		Select monthSelection = new Select(months);
		monthSelection.selectByVisibleText("October ");
		
		WebElement years = driver.findElement(By.name("years"));
		Select yearselect = new Select(years);
		yearselect.selectByValue("2000");
		
		driver.findElement(By.id("firstname")).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.id("lastname")).sendKeys(prop.getProperty("LastName"));
		driver.findElement(By.id("address1")).sendKeys(prop.getProperty("Address1"));
		driver.findElement(By.id("city")).sendKeys(prop.getProperty("MyCity"));
		WebElement state = driver.findElement(By.name("id_state"));
		Select stateselect = new Select (state);
		stateselect.selectByVisibleText("Indiana");
		driver.findElement(By.id("postcode")).sendKeys(prop.getProperty("PostCode"));
		WebElement country = driver.findElement(By.id("id_country"));
	    Select Countrys = new Select (country);
	    Countrys.selectByVisibleText("United States");
	    driver.findElement(By.id("other")).sendKeys(prop.getProperty("Others"));
	    driver.findElement(By.id("phone_mobile")).sendKeys(prop.getProperty("MobileNum"));
	    driver.findElement(By.id("alias")).sendKeys(prop.getProperty("SomeNum"));
	    driver.findElement(By.xpath("//button[@id = 'submitAccount']")).click();
	}
	

}
