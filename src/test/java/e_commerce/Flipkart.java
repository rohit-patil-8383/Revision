package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void FlipcartTest() {
	  Reporter.log("opening Flipcart", true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.quit();
  }
}
