package findElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefernceException
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait( 3000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement element = driver.findElement(By.xpath("//input[@name='password']//preceding::input[1]"));

		element.sendKeys("Admin");

		driver.navigate().refresh();

		element.clear();
		element.sendKeys("Admin");
	}
}
