package problem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) {
	
	
	
	

	WebDriver driver = new ChromeDriver();
	
	 
	 
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	
	/* Elements 
	 * Admin
	 * driver.findElement(By.xpath("//span[(text()='Admin')]"));
	 * PIM
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[1]"));
	 * Leave
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[2]"));
	 * Time
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[3]"));
	 * Recruitment
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[4]"));
	 * My Info
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[5]"));
	 * Performance
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[6]"));
	 * Dashboard
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[7]"));
	 * Directory
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[8]"));
	 * Maintenance
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[9]"));
	 * Buzz
	 * driver.findElement(By.xpath("//span[(text()='Admin')]//following::span[10]"));
	 * 
	 */
	
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
	 
	 
	 
	 
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
	 //suggestion
	 driver.findElement(By.xpath("//div[@role='option']//following::div//following::span[1]"));
	 driver.findElement(By.xpath("//div[@role='option']//following::div//following::span[2]"));
	 driver.findElement(By.xpath("//div[@role='option']//following::div//following::span[3]"));
	 driver.findElement(By.xpath("//div[@role='option']//following::div//following::span[4]")); 
	 driver.findElement(By.xpath("//div[@role='option']//following::div//following::span[5]"));
	 
	 
	 
	 
	 /* 
	  * Elements
	  * 
	  * User role 
	  * 
	  * driver.findElement(By.xpath("//div[contains(text(),'Admin')]"));
	  * driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//preceding::div[4]"));
	  * driver.findElement(By.xpath(" //div[ text()='-- Select --']//preceding::div[11]"));
	  * 
	  * Employee Name
	  * driver.findElement(By.xpath("//div[contains(text(),'Admin')]//following::input[1]"));
	  * driver.findElement(By.xpath(" //div[ text()='-- Select --']//preceding::input[1]"));
	  * driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	  * 
	  * Status
	  * driver.findElement(By.xpath("//*[text()='Username']//preceding::div[3] "));
	  * driver.findElement(By.xpath(" //*[text()='Password']//preceding::div[7]"));
	  * driver.findElement(By.xpath("//*[text()='Employee Name']//following::div[11] "));
	  * 
	  * Username
	  * driver.findElement(By.xpath("//*[text()='Username']//following::input[1]"));
	  * driver.findElement(By.xpath("//*[text()='Password']//preceding::input[1]"));
	  * driver.findElement(By.xpath("//*[text()='Employee Name']//following::input[2]"));
	  * 
	  * Password  
	  * driver.findElement(By.xpath("//input[@type='password']"));
	  * driver.findElement(By.xpath("//*[text()='Password']//following::input[1]"));
	  * driver.findElement(By.xpath("//*[text()='Employee Name']//following::input[3]"));
	  * 
	  * Confirm Password
	  * driver.findElement(By.xpath("//*[text()='Employee Name']//following::input[4]"));
	  * driver.findElement(By.xpath("//*[text()='Confirm Password']//following::input[1]"));
	  * driver.findElement(By.xpath("//*[text()='Password']//following::input[2]"));
	  */



}     
}
