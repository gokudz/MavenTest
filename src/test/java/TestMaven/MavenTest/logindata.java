package TestMaven.MavenTest;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logindata {
	WebDriver driver = null;
	Properties prop = new Properties();
	InputStream input = null;
	
	@BeforeTest
	public void log() throws InterruptedException{
		try {
			input = new FileInputStream("src\\config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverLocation"));
		driver = new ChromeDriver();
		driver.get("https://www.build.com/");
			//driver.manage().window().maximize();
			
		}
	
	
	
	@Test
	public void login() throws InterruptedException{
		
		
			
//HOME PAGE	
		HomePage R = new HomePage(driver);
			R.clicktoclose().click();
			R.frstiteam().sendKeys("Suede Kohler K-6626-6U ");
			
			R.clicktoenter().click();
			R.addtocart().click();
			
		 
//adding items 
		AddingItems r = new AddingItems(driver);

			 r.seconditeam().sendKeys("Cashmere Kohler K-6626-6U");
			 r.clicktoenter().click();
			 r.addtocart().click();
			 
			 //third iteam
			 
			 r.thirditeam().sendKeys("Kohler K-5180-ST");
			 r.clicktoenter().click();
			 
			 
			 
			 Actions action = new Actions(driver);
			 WebElement element= r.extn();
					 
			 
			 //Double click
			 action.doubleClick(element).perform();
			 r.addtocart().click();
					 
			 
			 // cart
			 r.aclick().click();
			 r.bclick().click();
			 			 
			 
//billing page
			 Billingpage b = new Billingpage(driver);
			
			 b.cname().sendKeys("tharun");
			 b.clastname().sendKeys("tharun");
			 
			 b.cstreet().sendKeys("2108 E South Blvd");
			 b.czip().sendKeys("94536");
			 b.ccity().sendKeys("fremont");
			 
			//to select state in dropdown box
			 Select s = new Select(b.cstate());
			 s.selectByValue("AL");
			 
			 b.cphone().sendKeys("8166593950");
			 b.cemail().sendKeys("tharun1387@gmail.com");
			 //credit card details
			 b.ccreditcard().sendKeys("4111111111111111");
			 
			//to select state in dropdown box
			 Select s1 = new Select(b.creditcardmonth());
			 s1.selectByValue("08");
			 
			 Select s2 = new Select(b.creditcardyear());
			 s2.selectByValue("18");
			
			 
			 b.nameonCreditcard().sendKeys("tharun");
			 b.creditcardCvv().sendKeys("111");
			 b.creditcardClick().click();
			
			 
		/*	
			 String Actualtext= b.catax().getText(); 
			 String expected ="$169.43";
			 assertThat(expected).isEqualTo(Actualtext);
			 System.out.print("CA Tax is correct");
			 
			 
			 String Actualtext1=b.fprice().getText();
			 String expected1 ="$$2,506.43";
			 assertThat(expected1).isEqualTo(Actualtext1);
			 System.out.print("total amount  is correct");
	*/
	}

	
	@AfterTest 
	public void logoff(){
		driver.quit();
	}
	
}
