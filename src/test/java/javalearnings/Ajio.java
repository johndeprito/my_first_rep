package javalearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	@Test
	void ajiotestscript() {

		WebDriverManager.chromedriver().setup();
		//RemoteWebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement mouseovertowomen = driver.findElement(By.xpath("//a[text()='WOMEN']"));
		Actions hover = new Actions(driver);
		hover.moveToElement(mouseovertowomen).build().perform();
//
//		WebElement brandsmouseover = driver.findElement(By.xpath("(//a[text()='BRANDS'])[1]"));
//		Actions over2 = new Actions(driver);
//		over2.moveToElement(brandsmouseover).build().perform();

	}

}
