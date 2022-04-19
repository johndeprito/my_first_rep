package javalearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandling extends Gettingdriver {

	/*
	 * void frameaccess() { //launch the url using chrombrowser
	 * 
	 * }
	 */
	@Test
	@AfterTest
	void annotationtest0() {
		Distrubutedriver();
		driver.get("https://demoqa.com/frames");
		WebElement print = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(print);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Frame 1:"+text);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	@BeforeTest
	void annotationtest() {
		Distrubutedriver();
		driver.get("https://demoqa.com/frames");
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		String printsecond = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Frame 2:"+printsecond);

	}
}
