package TestMaven.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddingItems {

	WebDriver driver;
	
	public AddingItems(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By iteam2 = By.xpath(".//*[@id='search_txt']");
	By click = By.xpath(".//*[@id='site-search']/div/button");	
	By add = By.xpath(".//*[@id='add-to-cart-wrap']/button");
	By iteam3 = By.xpath(".//*[@id='search_txt']");
	By ext = By.xpath(".//*[@id='main-product-quantity']/div/input");
	By doub = By.xpath(".//*[@id='add-to-cart-wrap']/button");
	By a = By.xpath(".//*[@id='header']/section[2]/div/div/div/a[2]/button");
	By b = By.xpath(".//*[@id='page-content']/div[1]/div[1]/div/section[2]/div/div[2]/div[2]/div[3]/div/a");
	
	public WebElement clicktoenter()
	{
		return driver.findElement(click);
	}
	public WebElement seconditeam()
	{
		return driver.findElement(iteam2);
	}
	public WebElement addtocart()
	{
		return driver.findElement(add);
	}
	
	public WebElement thirditeam()
	{
		return driver.findElement(iteam3);
	}
	public WebElement extn()
	{
		return driver.findElement(ext);
	}
	public WebElement doubleclick()
	{
		return driver.findElement(doub);
	}
	public WebElement aclick()
	{
		return driver.findElement(a);
	}
	public WebElement bclick()
	{
		return driver.findElement(b);
	}
	
}
