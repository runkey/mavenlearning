package sampletests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GeckoDriver

{
 
  WebDriver driver;
  
  @BeforeClass
  public void beforeClass() 
  {
 
	 System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe");  
     driver=new FirefoxDriver();
  }
  
  @Test
  public void testCase()
  
  {
	  
	  driver.get("http://automationpractice.com/");
	  
  }
  @AfterClass
  public void afterClass() 
  {
	  
	driver.quit();
  }

}
