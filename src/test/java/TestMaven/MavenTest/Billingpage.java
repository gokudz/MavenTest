package TestMaven.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Billingpage {
WebDriver driver;
	
	public Billingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By name = By.xpath(".//*[@id='shippingfirstname']");
	By lastname = By.xpath("..//*[@id='shippinglastname']");
	By street = By.xpath(".//*[@id='shippingaddress1']");
	By zip = By.xpath(".//*[@id='shippingpostalcode']");
	By city = By.xpath(".//*[@id='shippingcity']");
	By state =By.xpath(".//*[@id='shippingstate_1']");
	By phone = By.xpath(".//*[@id='shippingphonenumber']");
	By email = By.xpath(".//*[@id='emailAddress']");
	
	
	
	public WebElement cname()
	{
		return driver.findElement(name);
	}
	
	public WebElement clastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement cstreet()
	{
		return driver.findElement(street);
	}
	
	public WebElement czip()
	{
		return driver.findElement(zip);
	}
	public WebElement ccity()
	{
		return driver.findElement(city);
	}
	
	public WebElement cstate()
	{
		return driver.findElement(state);
	}
	public WebElement cphone()
	{
		return driver.findElement(phone);
	}
	public WebElement cemail()
	{
		return driver.findElement(email);
	}
	
	//credit card details 
	
	 
	 	
		By creditcard = By.xpath(".//*[@id='creditCardNumber']");	
		public WebElement ccreditcard()
		{
			return driver.findElement(creditcard);
		}
		
		By cmonth = By.xpath(".//*[@id='creditCardMonth']");
		public WebElement creditcardmonth()
		{
			return driver.findElement(cmonth);
		}
		
		By cyear = By.xpath(".//*[@id='creditCardYear']");
		public WebElement creditcardyear()
		{
			return driver.findElement(cyear);
		}
		By cname = By.xpath(".//*[@id='creditcardname']");
		public WebElement nameonCreditcard()
		{
			return driver.findElement(cname);
		}
			
		By cvv = By.xpath(".//*[@id='creditCardCVV2']");
		public WebElement creditcardCvv()
		{
			return driver.findElement(cvv);
		}
		
		By creditc = By.xpath(".//*[@id='creditcard']/div[3]/input");
		public WebElement creditcardClick()
		{
			return driver.findElement(creditc);
		}	
		By tax =By.xpath(".//*[@id='taxAmount']");
		
		public WebElement catax()
		{
			return driver.findElement(tax);
		}
		By price =By.xpath(".//*[@id='grandtotalamount']");
		public WebElement fprice()
		{
			return driver.findElement(price);
		}
		
		
}
