package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertWithWebDriverWait2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert ale = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(ale.getText());

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		ale.accept();
		driver.quit();

	}

}
