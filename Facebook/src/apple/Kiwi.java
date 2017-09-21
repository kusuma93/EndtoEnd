package apple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Kiwi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SeleniumDrivers\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.navigate().to("https://www.southwest.com/");
		 
		 driver.findElement(By.id("trip-type-one-way")).click();
		 driver.findElement(By.xpath(".//*[@id='air-city-departure']")).sendKeys("MEM");
		  Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[@id='air-city-arrival']")).sendKeys("OKC");
		 driver.findElement(By.xpath(".//*[@id='air-date-departure']")).click();
		 
		 driver.findElement(By.id("air-date-departure")).clear();
		 driver.findElement(By.id("air-date-departure")).sendKeys("09/29");
		 driver.findElement(By.xpath(".//*[@id='air-pax-count-adults']")).click();
		 driver.findElement(By.id("jb-number-selector-more")).click();
		 driver.findElement(By.xpath(".//*[@id='jb-booking-form-submit-button']")).submit();
		 
		  
		 driver.findElement(By.xpath(".//*[@id='Out2C']")).click();
		 driver.findElement(By.xpath(".//*[@id='priceItinerarySubmit']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='priceSubmitButton']")).submit();
		 driver.findElement(By.xpath(".//*[@id='firstName0']")).sendKeys("ram");
		 driver.findElement(By.xpath(".//*[@id='firstName0']")).sendKeys("run");
		Thread.sleep(4000);
		 WebElement web=driver.findElement(By.xpath(".//*[@id='suffix0']"));
           Select s= new Select(web);
           s.selectByValue("CEO");
           
           
           WebElement x=driver.findElement(By.xpath(".//*[@id='dobMonth0']"));
           Select a= new Select(x);
           a.selectByValue("1");
           
           WebElement y=driver.findElement(By.xpath(".//*[@id='dobDay0']"));
           Select b= new Select(y);
           b.selectByValue("20");
           
           WebElement z=driver.findElement(By.xpath(".//*[@id='dobYear0']"));
           Select c= new Select(z);
           c.selectByValue("1994");
           
           driver.findElement(By.xpath(".//*[@id='firstName1']")).sendKeys("sam");
  		 driver.findElement(By.xpath(".//*[@id='lastName1']")).sendKeys("run");
  		Thread.sleep(4000);
  		 WebElement suf=driver.findElement(By.xpath(".//*[@id='suffix1']"));
             Select su= new Select(suf);
             su.selectByValue("CEO");
             
             
             WebElement month=driver.findElement(By.xpath(".//*[@id='dobMonth1']"));
             Select mo= new Select(month);
             mo.selectByValue("1");
             
             WebElement date=driver.findElement(By.xpath(".//*[@id='dobDay1']"));
             Select da= new Select(date);
             da.selectByValue("1");
             
             WebElement year=driver.findElement(By.xpath(".//*[@id='dobYear1']"));
             Select ye= new Select(year);
             ye.selectByValue("1995");
             
           
           driver.findElement(By.xpath(".//*[@id='gender1']")).sendKeys("Male");
          driver.findElement(By.xpath(".//*[@id='visibleSubmitButton']")).click();
          

		 
		 Assert.assertEquals("Southwest Airlines - Payment Information",driver.getTitle());
		
		 driver.close();
	}

}
