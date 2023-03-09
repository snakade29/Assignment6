package problem;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
	
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		
		 
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	 
	 
		

		 //username
		 driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Admin");
		 //password	
		 driver.findElement(By.xpath("//*[text()='Password']//following::input[1]")).sendKeys("admin123");
	     //Login
		 driver.findElement(By.xpath("//*[@type='password']//following::button[1]")).click();
		 //Admin 
		 driver.findElement(By.xpath("//span[(text()='Admin')]")).click();
		 // Add button
		 driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		 
		   
		 
	 
		 
		 
		 
 
		 
		 
		 
		
	}
	
	
	
	
	
	 

}
