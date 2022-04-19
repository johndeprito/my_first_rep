package javalearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractiace {
	@Test
	void signin() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("9087goku@gmail.com");
		driver.findElement(By.xpath("//button[contains(@name,'SubmitCreate')]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Prito");
		driver.findElement(By.id("customer_lastname")).sendKeys("R");
		driver.findElement(By.id("passwd")).sendKeys("Helloworld123");
		WebElement day = driver.findElement(By.id("days"));
		Select daysSelection = new Select(day);
		daysSelection.selectByValue("14");
		WebElement months = driver.findElement(By.id("months"));
		Select monthSelection = new Select(months);
		monthSelection.selectByVisibleText("October ");
		WebElement years = driver.findElement(By.name("years"));
		Select yearselect = new Select(years);
		yearselect.selectByValue("2000");
		driver.findElement(By.id("firstname")).sendKeys("John");
		driver.findElement(By.id("lastname")).sendKeys("R");
		driver.findElement(By.id("address1")).sendKeys("Nellithop, periyar nagar");
		driver.findElement(By.id("city")).sendKeys("Puducherry");
		WebElement state = driver.findElement(By.name("id_state"));
		Select stateselect = new Select (state);
		stateselect.selectByVisibleText("Indiana");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		WebElement country = driver.findElement(By.id("id_country"));
	    Select Countrys = new Select (country);
	    Countrys.selectByVisibleText("United States");
	    driver.findElement(By.id("other")).sendKeys("welcome");
	    driver.findElement(By.id("phone_mobile")).sendKeys("9280173452");
	    driver.findElement(By.id("alias")).sendKeys("89775857");
	    driver.findElement(By.xpath("//button[@id = 'submitAccount']")).click();
	}

}
