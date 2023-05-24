package vtigerapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub


		WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Leads&view=Edit&app=MARKETING");
		  driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		  WebElement country = driver.findElement(By.name("salutationtype"));
			Select sl=new Select(country);
		    sl.selectByValue("Ms.");
          driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("abcdefg");
		  driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("asdfg");
		  driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("123445669");
		  driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("9876543211");
		  driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("adsbcd");
		  driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("esrtrh");
		  driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("ahdih");
		  WebElement la = driver.findElement(By.name("leadstatus"));
			Select l1=new Select(la);
		    l1.selectByValue("Cold");
		  driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("asd123@gmail.com");
		  driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("https://aghs.com");
		  driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("2345267");
		  driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("10000");
		  driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("adf12@gmail.com");
		  driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		  driver.findElement(By.id("Leads_editView_fieldName_lane")).sendKeys("hjst");
		  driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("kkel");
		  driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("q34g");
		  driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("pune");
		  driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("india");
		  driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("maharstra");
		  driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("ncgxsmdnshdjwyjehm7yh"); 
		   WebElement la1= driver.findElement(By.name("rating"));
			Select sl2=new Select(la1);
		    sl2.selectByValue("Market Failed");
		    WebElement la2= driver.findElement(By.name("industry"));
			Select sl3=new Select(la2);
		    sl3.selectByValue("Banking");
		    WebElement la3= driver.findElement(By.name("leadsource"));
			Select sl4=new Select(la3);
		    sl4.selectByValue("Partner");
	      driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
		  
		
		
		
		
	}

}
