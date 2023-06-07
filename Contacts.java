package vtigerapp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contacts {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub

		 WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Contacts&view=Edit&app=MARKETING");
		  driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		  WebElement country = driver.findElement(By.name("salutationtype"));
			Select sl=new Select(country);
		    sl.selectByValue("Ms.");
		      driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("abcdefg");
			  driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("asdfg");
			  driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("123445669");
			  driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("9876543211");
			  driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("4657809");
			  driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("esrtrh");
			  driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("64647869");
			  
		  driver.findElement(By.xpath("(//span[@class='input-group-addon createReferenceRecord cursorPointer clearfix'])[1]")).click();
		  driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("utyshjghyj");
		  driver.findElement(By.name("saveButton")).click();
		  driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();

			  
			  
			  driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("maths");
			  driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("gerfvh");
			  driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("sp123@gmail.com");
			  driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("nxnmert");
			  driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("4532382902");
			  driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("as123@gmail.com");
			  
			  driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();
			  driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();
			  driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();
			  driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
			
			  driver.findElement(By.id("Contacts_editView_fieldName_birthday")).sendKeys("11-10-1999");
			  driver.findElement(By.name("mailingstreet")).sendKeys("jygygtyj");
			  
			  //driver.findElement(By.xpath("(//span[@class='input-group-addon createReferenceRecord cursorPointer clearfix'])[2]")).click();
			  driver.findElement(By.id("contact_id_display")).sendKeys("afgfnjkhsg");
			  
			  
//			  driver.findElement(By.name("portal")).click();
//			  driver.findElement(By.id("Contacts_editView_fieldName_support_start_date")).sendKeys("01-08-2021");
//			  driver.findElement(By.id("Contacts_editView_fieldName_support_end_date")).sendKeys("15-11-2022");
			  
			  driver.findElement(By.name("otherstreet")).sendKeys("awrert4t");
			  driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("mailbox");
			  driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("Otherbox");
			  driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("pune");
			  driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("pune");
			  driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("maharastra");
			  driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("maharastra");
			  driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("hjsd");
			  driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("kldljkud");
			  driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("india");
			  driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("india");
			  driver.findElement(By.name("description")).sendKeys("nmtreffr/yl;t,p;.e");
			  
			  JavascriptExecutor Js=(JavascriptExecutor)driver;
			  Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class='fileUploadBtn btn btn-primary']")).click();
			  Runtime.getRuntime().exec("C:\\Users\\Magdu\\AUFile.exe");
			 
			  driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
	   
		
		
	}

}
