package seleniumRecall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.leafground.com/select.xhtml");
	  //For Maximize Size
	  driver.manage().window().maximize();
	  
	  //Select the Particular value from drop-down
	  WebElement element = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
	  element.click();
      Select select=new Select(element);
      select.selectByIndex(1);
      
      //Select the value from different drop-down
      WebElement diffval = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
      diffval.click();
      Select drop =new Select(diffval);
      drop.wait(5000);
      
      WebElement parVal = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/ul"));
      Select par=new Select(parVal);
      par.selectByIndex(5);
      
	  
	}
}
