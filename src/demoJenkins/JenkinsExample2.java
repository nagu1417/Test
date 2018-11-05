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

public class JenkinsExample2 {
  @Test
  public void f() {
	  System.out.println("Welcome to Jenkins");
	  System.out.println("This is my Second Jenkins script");
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  System.out.println("Chrome driver has been set");
  }
  /*@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }*/

}
