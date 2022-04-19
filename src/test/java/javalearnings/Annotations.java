/*package javalearnings;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotations {
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("I'm Before method");		
	}
	@Test
	public void ActuallMetod() {
		System.out.println("I'm actual method");
	}
	@AfterTest
	public void AfterMethod() {
		System.out.println("I'm after method");
	}

}*/

package javalearnings;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class Annotations {
	@BeforeMethod
	public void searching() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notification");
		//WebDriver driver = new ChromeDriver(options);
		//maximize the window
		driver.manage().window().maximize();
		//waiting for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Searching of Products
		@Test
		 void Testcase(){
		driver.findElement(By.xpath("//input[contains(@class,'desktop')]")).sendKeys("Sunglasses",Keys.ENTER);
		//filter the brand
		driver.findElement(By.xpath("(//span[contains(@class,'myntraweb-sprite filter-search-iconSearch sprites-search')])[1]")).click();
		//Choose the favorite brand
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Brand')]")).sendKeys("Polaroid",Keys.ENTER);
		//check the brand
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[3]")).click();
	    //print the no.of glasses
		List<WebElement>countofglass = driver.findElements(By.xpath("//h4[contains(text(),'Rectangle')]"));
		int noofglass = countofglass.size();
        System.out.println(noofglass);
        //mouseover action
        WebElement viewsimilar = driver.findElement(By.xpath("(//span[contains(text(),'VIEW SIMILAR')])[7]/parent::div"));
        Actions action = new Actions(driver);
        action.moveToElement(viewsimilar).click().build().perform();
		}
      //  @AfterTest
        
       
        
	}

	private void Testcase() {
		// TODO Auto-generated method stub
		
	}
}


