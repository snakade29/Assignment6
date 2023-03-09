package problem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		 
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//username xpath
		
	    driver.findElement(By.xpath("//input[@name='username']"));
	    driver.findElement(By.xpath("//input[@placeholder='Username' and @name='username']"));
	    driver.findElement(By.xpath("//input[contains(@name,'user')]"));
		
		
	   //username CSS selector
		  driver.findElement(By.cssSelector("input[name=username]")).sendKeys("hello");
		  driver.findElement(By.cssSelector("input[name='username'][placeholder='Username']"));
	      driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("hello");
		
		
		
		
		//password xpath
	      
		driver.findElement(By.xpath("//*[text()='Password']//following::input[1]"));
		driver.findElement(By.xpath(" //*[text()='Username']//following::input[2]"));
		driver.findElement(By.xpath(" //*[@type='password']"));
		
		
		//password CSS selector
		
		driver.findElement(By.cssSelector("input[type='password']")) ;
		driver.findElement(By.cssSelector("input[type^='pass']")) ;
		driver.findElement(By.cssSelector("input[type$='word']")) ;
		
		
		//login xpath
		driver.findElement(By.xpath(" //*[text()='Login']//following::button[1]"));
		driver.findElement(By.xpath(" //*[@type='submit']"));
		driver.findElement(By.xpath(" //*[@type='password']//following::button[1]"));
		 
		
		
		
		//login CSS selector
		
		driver.findElement(By.cssSelector("button[type$='mit']")) ;
		driver.findElement(By.cssSelector("button[type='submit']"));
	    driver.findElement(By.cssSelector("button[type^='sub']")) ;
		
		
		

	}

}
