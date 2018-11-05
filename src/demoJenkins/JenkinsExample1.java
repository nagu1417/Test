package demoJenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class JenkinsExample1 {
  @Test
  public void f() {
	  System.out.println("Welcome to Jenkins");
	  System.out.println("This is my First Jenkins script");System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	  System.out.println("Page title:"+driver.getTitle());
	  WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
	  Select s=new Select(day);
	  s.selectByValue("8");
	  System.out.println("Selected day:"+s.getFirstSelectedOption().getText());
	  
	  
	  driver.close();
  }
  /*@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }*/

}
