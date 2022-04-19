package javalearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMRS {
	/*
	 * @Test public void login() { WebDriverManager.chromedriver().setup();
	 * RemoteWebDriver driver = new ChromeDriver();
	 * driver.get("https://demo.openmrs.org/openmrs/login.htm");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 * driver.findElement(By.id("username")).sendKeys("Admin");
	 * driver.findElement(By.id("togglePassword")).click();
	 * driver.findElement(By.id("password")).sendKeys("Admin123");
	 * driver.findElement(By.id("Isolation Ward")).click();
	 * driver.findElement(By.id("loginButton")).click();
	 * 
	 * boolean value = driver.findElement(By.linkText("Logout")).isDisplayed();
	 * String textValue = driver.findElement(By.linkText("Logout")).getText();
	 * textValue.equalsIgnoreCase(""); if(value == true)
	 * System.out.println("Text find"); else System.out.println("Failed to find");
	 * //driver.findElement(By.linkText("Logout")).click(); }
	 */

	/*
	 * @Test void Registerpatien() { WebDriverManager.chromedriver().setup();
	 * RemoteWebDriver driver = new ChromeDriver();
	 * driver.get("https://demo.openmrs.org/openmrs/login.htm");
	 * driver.manage().window().maximize();
	 * driver.findElement(By.id("username")).sendKeys("Admin");
	 * driver.findElement(By.id("password")).sendKeys("Admin123");
	 * driver.findElement(By.id("Isolation Ward")).click();
	 * driver.findElement(By.id("loginButton")).click();
	 * driver.findElement(By.linkText("Registrar un paciente")).click();
	 * driver.findElement(By.xpath("//input[@name = 'givenName']")).sendKeys("John")
	 * ;
	 * driver.findElement(By.xpath("//input[@name = 'middleName']")).sendKeys("De");
	 * driver.findElement(By.xpath("//input[@name = 'familyName']")).sendKeys(
	 * "Prito"); driver.findElement(By.id("next-button")).click(); }
	 
	@Test
	void Gender() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Isolation Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Registrar un paciente")).click();
		driver.findElement(By.xpath("//input[@name = 'givenName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name = 'middleName']")).sendKeys("De");
		driver.findElement(By.xpath("//input[@name = 'familyName']")).sendKeys("Prito");
		driver.findElement(By.id("next-button")).click();

		// dropdown select
		WebElement genders = driver.findElement(By.id("gender-field"));
		Select genderSelection = new Select(genders);
		genderSelection.selectByValue("M");
		driver.findElement(By.id("next-button")).click();
	}
*/
	@Test
	void RegisterPatient() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Isolation Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		
		//
		driver.findElement(By.linkText("Register a patient")).click();
		driver.findElement(By.xpath("//input[@name = 'givenName']")).sendKeys("Deebika");
		driver.findElement(By.xpath("//input[@name = 'middleName']")).sendKeys("bee");
		driver.findElement(By.xpath("//input[@name = 'familyName']")).sendKeys("John De Prito");
		driver.findElement(By.id("next-button")).click();

		// dropdown select
		WebElement genders = driver.findElement(By.id("gender-field"));
		Select genderSelection = new Select(genders);
		genderSelection.selectByValue("F");
		driver.findElement(By.id("next-button")).click();

		// Birth day select
		driver.findElement(By.id("birthdateDay-field")).sendKeys("27");
		// Birth month select
		WebElement months = driver.findElement(By.name("birthdateMonth"));
		Select monthsSelection = new Select(months);
		monthsSelection.selectByVisibleText("October");
		// Birth date year send
		driver.findElement(By.id("birthdateYear-field")).sendKeys("2005");
		driver.findElement(By.id("next-button")).click();

		// address
		driver.findElement(By.id("address1")).sendKeys(" Karamanikuppam");
		driver.findElement(By.id("address2")).sendKeys("1234");
		driver.findElement(By.id("cityVillage")).sendKeys("Washington");
		driver.findElement(By.id("stateProvince")).sendKeys("New York");
		driver.findElement(By.id("country")).sendKeys("US");
		driver.findElement(By.id("postalCode")).sendKeys("605004");
		driver.findElement(By.id("next-button")).click();

		// phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("819094480");
		driver.findElement(By.id("next-button")).click();

		// Relationship type
		WebElement relation = driver.findElement(By.id("relationship_type"));
		Select relationSelection = new Select(relation);
		relationSelection.selectByVisibleText("Parent");
		driver.findElement(By.xpath("//input[contains(@class,'person-typeahead')]")).sendKeys("hai");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("SubmitCreate")).click();
		
	}

}
