package Script_mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Final_Mock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Services&view=List&app=SALES");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("Services_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_servicename")).sendKeys("snehal");

		  WebElement s1 = driver.findElement(By.name("service_usageunit"));
			Select sl1=new Select(s1);
		    sl1.selectByValue("Hours");	 
		driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("35677878998");
		driver.findElement(By.id("Services_editView_fieldName_website")).sendKeys("www.hjuy.com/");
		
		WebElement s12 = driver.findElement(By.name("servicecategory"));
		Select sl2=new Select(s12);
	    sl2.selectByValue("Support");
	    
		WebElement s14 = driver.findElement(By.name("assigned_user_id"));
		Select sl3=new Select(s14);
	    sl3.selectByValue("1");
	    JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(900,0)");
	    
		driver.findElement(By.id("Services_editView_fieldName_sales_start_date")).sendKeys("03-6-2023");
		driver.findElement(By.id("Services_editView_fieldName_start_date")).sendKeys("03-6-2023");
		driver.findElement(By.id("Services_editView_fieldName_sales_end_date")).sendKeys("03-6-2023");
		driver.findElement(By.id("Services_editView_fieldName_expiry_date")).sendKeys("03-6-2023");
		driver.findElement(By.id("Services-editview-fieldname-unit_price")).sendKeys("342678789");
		driver.findElement(By.id("Services_editView_fieldName_commissionrate")).sendKeys("54632546657");
		driver.findElement(By.id("tax1_check")).click();
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("tax3_check")).click();
		driver.findElement(By.id("Services_editView_fieldName_purchase_cost")).sendKeys("4356287903809");
		driver.findElement(By.id("Services_editView_fieldName_description")).sendKeys("jhrbvt4r ackr8ewkfn eurhweijjeh");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
	}

}
