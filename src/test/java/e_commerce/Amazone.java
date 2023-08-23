package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazone {
  @Test
  public void amazoneTest() {
	  
	  Reporter.log("opening amazone", true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.quit();
	  
  }
}
