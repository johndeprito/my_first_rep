package javalearnings;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jwellery {
	@Test
	public void firefoxbrowser() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver = new FirefoxDriver();
		
		driver.get("https://thejewelleryroom.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.findElement(By.linkText("Bracelets")).click();
		
		WebElement bangle = driver.findElement(By.xpath("(//a[contains(@class,'Heading u-h6')])[7]"));
		Actions click = new Actions(driver);
		click.moveToElement(bangle).click().build().perform();
		Thread.sleep(14000);
		
		WebElement namefill = driver.findElement(By.xpath("//input[contains(@name,'input-3')]"));
		Actions nameclick = new Actions(driver);
		nameclick.moveToElement(namefill).click().sendKeys("hello");
		
		//WebElement close = driver.findElement(By.xpath("//div[contains(text()='Element196')]/.."));
		//Actions ignore = new Actions(driver);
		//ignore.moveToElement(close).click().build().perform();
		//Thread.sleep(14000);
	}

}
