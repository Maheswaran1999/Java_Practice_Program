package seleniumRecall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.leafground.com/input.xhtml;jsessionid=node0ery73s4l1gk218va2101aq5qf148054.node0");

		// write a name in particular textBox(sendKeys())
		WebElement element = webDriver.findElement(By.id("j_idt88:name"));
		element.sendKeys("Maheswaran");

		// Append the text
		WebElement append = webDriver.findElement(By.id("j_idt88:j_idt91"));
		append.sendKeys(" super kings");

		// Check disabled or not(isDisplayed())
		WebElement disabled = webDriver.findElement(By.id("j_idt88:j_idt93"));
		Boolean result = disabled.isDisplayed();
		System.out.println(result);

		if (result.equals(true)) {
			System.out.println("The Text box is Disabled");
		} else {
			System.out.println("The Box is visible");
		}

		// clear the text(clear())
		WebElement clrTxt = webDriver.findElement(By.id("j_idt88:j_idt95"));
		clrTxt.clear();

		// get the data(getText())
		WebElement getData = webDriver.findElement(By.id("j_idt88:j_idt97"));
		String retrieve = getData.getAttribute("value");
		System.out.println(retrieve);

	}
}
