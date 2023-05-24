package vtigerapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Campaigns {

	public static void main(String[] args) 
	
{
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Campaigns&view=Edit&app=MARKETING");
		  driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		  driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("dregw");
		  
		  WebElement la = driver.findElement(By.name("assigned_user_id"));
			Select l1=new Select(la);
		    l1.selectByValue("1");
		
		    WebElement la1 = driver.findElement(By.name("campaignstatus"));
			Select l11=new Select(la1);
		    l11.selectByValue("Planning");
		  
		    WebElement la2 = driver.findElement(By.name("campaigntype"));
			Select l12=new Select(la2);
		    l12.selectByValue("Trade Show");
		    
		   driver.findElement(By.id("Campaigns_editView_fieldName_product_id_create")).click();
		   driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("abcd");
		   driver.findElement(By.name("saveButton")).click();
		   
		  driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("dwe4t");
		  driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("11-2-2022");
		  driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys(",fjdfn");
		  driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("90000");
		  driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("958680");
		  driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("843795");
		  driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("5667");
		  
		   WebElement la4 = driver.findElement(By.name("expectedresponse"));
			Select l14=new Select(la4);
		    l14.selectByValue("Good");
		    
		  driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("435688799090");
		  driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("34456678978090");
		  driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("3245456767");
		  driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("36543748989930");
		  driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("5687879980");
		  driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("561323245454");
		  driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("35577");
		  driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("bcnthcjmzd,kgtyoijiyuf;ltyoy/rpy/");
		 
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		
		
		
		
		
	}

}
