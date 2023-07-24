package Gpack;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
    @Test
	public void googleautomation() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create an account")).click();
			
		driver.findElement(By.id("firstName")).sendKeys("John");
		
		driver.findElement(By.id("lastName")).sendKeys("Dev");
		Thread.sleep(3000);
			
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		select.selectByValue("3");
		select.selectByVisibleText("March");
		select.selectByIndex(3);
		
		WebElement Gender = driver.findElement(By.id("gender"));
		Select a = new Select(Gender);
		a.selectByValue("1");
        a.selectByVisibleText("Male");
		a.selectByIndex(2);
		
		driver.findElement(By.id("day")).sendKeys("25");
	    driver.findElement(By.id("year")).sendKeys("1985");
	    driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	    
		driver.findElement(By.xpath("//div[@id='selectionc0']")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("abc123@01");
		driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("abc123@01");
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	    
	}

}
