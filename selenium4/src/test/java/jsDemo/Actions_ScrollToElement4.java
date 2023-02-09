package jsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import customUtility.Utility;

public class Actions_ScrollToElement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement ele = driver.findElement(By.tagName("textarea"));

		Actions as = new Actions(driver);

		as.scrollToElement(ele).perform();
		;

		ele.clear();

		ele.sendKeys("Mango");

	}

}
