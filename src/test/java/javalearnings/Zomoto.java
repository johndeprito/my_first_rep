package javalearnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomoto {
	@Test
	public void A2B() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Click the Search editor box and type the A2B using mouse over action
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant, cuisine or a dish')]")).sendKeys("A2B");
		WebElement Atob = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant, cuisine or a dish')]"));
		Actions action = new Actions(driver);
		action.moveToElement(Atob).click().build().perform();
		
		//Click the A2B restaurant
		WebElement Select = driver.findElement(By.xpath("(//div[contains(@class,'sc-bIqbHp cgObbN')])[2]"));
		Actions selects = new Actions(driver);
		selects.moveToElement(Select).click().build().perform();
		
		//Print restaurant is available or not
		String Avlble = driver.findElement(By.xpath("//section[contains(@class,'sc-btzYZH gHFUNV')]/..")).getText();
		System.out.println(Avlble);
		
		//Print the No of Must try foods
		List<WebElement> Msttry = driver.findElements(By.xpath("//div[text()='MUST TRY']"));
		int noofmsttry = Msttry.size();
		System.out.println("No of Must try is:"+noofmsttry);
		Thread.sleep(3000);
		
		driver.findElement(By.id("TabLink__1")).click();
		
		//List <WebElement> flvrs = driver.findElements(By.xpath("//section[contains(@class,'sc-gKGeJo gauTGU')]/*]"));
		//int Noofflvrs = flvrs.size();
		//System.out.print(Noofflvrs);
		
		driver.findElement(By.xpath("//section[contains(@class,'sc-gKGeJo gauTGU')]/*[3]")).click();
		List<WebElement> Sweet = driver.findElements(By.xpath("//div[text()='MUST TRY']"));
		int swtmsttry = Sweet.size();
		System.out.println("No of Must try is:"+swtmsttry);
		
		
		
		
	}
}
