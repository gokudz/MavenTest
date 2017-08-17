package TestMaven.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By close = By.xpath("//button[@class='close external-close']");	
	By click = By.xpath(".//*[@id='site-search']/div/button");	
	By iteam1 = By.xpath(".//*[@id='search_txt']");
	By add = By.xpath(".//*[@id='configure-product-wrap']/button");
	
	
	
	
	public WebElement clicktoenter()
	{
		return driver.findElement(click);
	}
	public WebElement clicktoclose()
	{
		return driver.findElement(close);
	}
	public WebElement frstiteam()
	{
		return driver.findElement(iteam1);
	}
	
	public WebElement addtocart()
	{
		return driver.findElement(add);
	}
	
	
	
}
