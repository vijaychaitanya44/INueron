package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.ignoring(WebDriverException.class);

		wait.pollingEvery(Duration.ofSeconds(1));

		wait.withTimeout(Duration.ofSeconds(5));

		wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver wd) {
				WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));
				String text = ele.getText();

				if (text.contains("WebDri33ver")) {
					System.out.println("Element found");
					return ele;
				} else {
					System.out.println("Ele not found " + text);
					return null;
				}
			}

		});
	}
}
