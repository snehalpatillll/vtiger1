package vtigerapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Organisation 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
	    WebElement ele=	driver.findElement(By.xpath("//span[text()=' MARKETING']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
		
		     driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		     driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("abcdefg");
		     driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("https://sp.com/");
		     driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9876543210");
		     driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("sp3616");
		     driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("@sp*");
		     
		     driver.findElement(By.id("Accounts_editView_fieldName_account_id_select")).click();
		     driver.findElement(By.xpath("//a[text()='abcdefgvgt']")).click();
		     
	
		     
		     
		     driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("1234567890");
		     
		     driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("100");
		     
		     driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("sp@123gmail.com");
		     
		     driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("spb@gmail.com");
		     
		     driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("abcdef");
		     
		     WebElement country = driver.findElement(By.name("industry"));
				Select sl=new Select(country);
			    sl.selectByValue("Banking");
			    WebElement sp= driver.findElement(By.name("rating"));
				Select sp1=new Select(sp);
			    sp1.selectByValue("Market Failed");
			    WebElement type= driver.findElement(By.name("accounttype"));
				Select sp2=new Select(type);
			    sp2.selectByValue("Integrator");
			    WebElement type1= driver.findElement(By.name("assigned_user_id"));
				Select sp3=new Select(type1);
			    sp3.selectByValue("2");
		     
			 driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("1234");
	         driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		     driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		     driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("20000000");
		     driver.findElement(By.name("bill_street")).sendKeys("syrdtsg");
		     driver.findElement(By.name("ship_street")).sendKeys("yu5dglo87diou");
		     driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("25457679");
		     driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("dgyriyw445ikmf");
		     driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("pune");
		     driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("kolhapur");
		     driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("maharashtra");
		     driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("maharashtra");
		     driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("4161110");
		     driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("416111");
		     driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("india");
		     driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("india");
		     driver.findElement(By.name("description")).sendKeys("krly3nelxjehgfma,wd3uc,njmf,rhk");
		     driver.findElement(By.xpath("//div[@id='s2id_autogen1']"));
		
		     driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
