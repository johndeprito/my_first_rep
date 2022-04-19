package javalearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bankbazaar {
	@Test
	public void bankbazarIEbrowserlaunch() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver = new EdgeDriver();
		// Launch Bankbazaar in Edge browser
		driver.get(" https://www.bankbazaar.com/personal-loan.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Select as salaried person
		driver.findElement(By.xpath(
				"(//div[contains(@class,'ui fitted radio checkbox dontshowMobile dontshowMobile semantic-ui-radio')])[1]"))
				.click();
		// Type the INFOSYS
		driver.findElement(By.xpath("//input[contains(@placeholder,'Start typing here....')]")).sendKeys("Infosys");
		// Select Second one INFOSYS LTD
		driver.findElement(By.id("792")).click();
		
		//Select the range of salaries
		driver.findElement(By.xpath("//input[contains(@name,'netMonthlyIncome')]")).sendKeys("60000");
		driver.findElement(By.linkText("Continue")).click();
		
		//Send to pincode
		driver.findElement(By.xpath("//input[contains(@placeholder,'PIN Code')]")).sendKeys("600001");
		driver.findElement(By.linkText("Continue")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'mobileNumber')]")).sendKeys("9087654321");
		Thread.sleep(50000);
		String Ph_no = driver.findElement(By.xpath("//input[contains(@name,'mobileNumber')]")).getText();
		System.out.print(Ph_no);
		System.out.println("success");
		
		//driver.findElement(By.linkText("Submit")).click();
		
		//driver.findElement(By.xpath("//div[contains(@class,'ui slider')][1]")).getAttribute(null);
	}

}
