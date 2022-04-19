package Myfirstautomationcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("togglePassword")).click();
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Isolation Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
