
package Script_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mock_letcode {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("email")).sendKeys("patilsnehal3616@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sp@123");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		JavascriptExecutor Js=(JavascriptExecutor)driver;
	     Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		driver.findElement(By.linkText("Explore Workspace")).click();   //linktext("Explore Workspace").click();
		driver.findElement(By.linkText("Drop-Down")).click();
//		driver.findElement(By.xpath("//option[text()='JavaScript']")).click();
		 WebElement ele= driver.findElement(By.id("lang"));
		Select sl=new Select(ele);
	    sl.selectByValue("java");
		  Thread.sleep(2000);
	    driver.navigate().back();
	    driver.findElement(By.linkText("Dialog")).click();
//	    driver.findElement(By.linkText("Confirm Alert")).click();
	    driver.findElement(By.id("confirm")).click();
	    driver.switchTo().alert().accept();   //popup handle this line
	   
//	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("//a[text()='Toggle']")).click();
	    driver.findElement(By.id("yes")).click();
	    driver.findElement(By.id("one")).click();
	    driver.findElement(By.id("nobug")).click();
	    driver.findElement(By.id("foo")).click();
	    driver.findElement(By.id("going")).click();
//	    driver.findElement(By.id(" Remember me ")).click();
//	    driver.findElement(By.id("yes")).click();
//	    driver.findElement(By.id("yes")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	    driver.findElement(By.linkText("Sign out")).click();
		
		
		
		
		
		
	}

}
