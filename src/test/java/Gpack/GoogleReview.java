package Gpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleReview {
    @Test
	public void login() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("searchboxinput")).sendKeys("burrito guyz beamsville");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		driver.findElement(By.xpath("//div[@class='Gpq6kf fontTitleSmall'][normalize-space()='Reviews']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Write a review']//span[contains(@class,'DVeyrd')]")).click();
		
		
	}

}
