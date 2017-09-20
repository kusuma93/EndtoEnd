package apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Kiwi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SeleniumDrivers\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.navigate().to("https://www.facebook.com/");
		 
		 driver.findElement(By.className("inputtext")).sendKeys("kxr76360@ucmo.edu");
		 driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("12324");
		 driver.findElement(By.xpath(".//*[@id='u_0_2']")).submit();
		 
		 System.out.println(driver.getTitle());
		 
		 Assert.assertEquals("Log into Facebook | Facebook",driver.getTitle());
		
		 //driver.close();
	}

}
