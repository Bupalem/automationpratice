package sampletestcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
  
  @Test
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver",
					"F:\\Selenium BrowseDrivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	  String title=driver.getTitle();
	  Assert.assertTrue(title.contains("Login"));
	  
	  driver.findElement(By.xpath("//input[@id='email_create']/../input")).sendKeys("pava1.bhupalam@gmail.com");
	  driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
	  //mr selected
	  driver.findElement(By.xpath("//div[@id='uniform-id_gender1']/span/input")).click();
	  //firstname added
	  driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Pavan");
	//lastname added
	  driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("bupalem");
	  //password added
	  driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pavan@3103");
	  //dATE OF BIRTH SELECTION
	  Select day= new Select(driver.findElement(By.xpath("//select[@id='days']")));
	  day.selectByValue("31");
	//month selection
	  Select month= new Select(driver.findElement(By.xpath("//select[@id='months']")));
	  month.selectByVisibleText("March ");
	//year selection  
	  Select year= new Select(driver.findElement(By.xpath("//select[@id='years']")));
	  year.selectByVisibleText("1994  ");
	  // company updated
	  driver.findElement(By.xpath("//input[@id='company']")).sendKeys("MAIT");
	  
	  driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("MAIT solutions");
	  
	  driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("pvt ltd");
	  
	  driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyerabad");
	  
	  Select state= new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
	  state.selectByVisibleText("Indiana");
	  
	  driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("99501");
	  driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8686868702");
	  driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
  
  
  }
  

}
