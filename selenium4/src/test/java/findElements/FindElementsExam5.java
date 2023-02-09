package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		List<WebElement> aTags = driver.findElements(By.tagName("a"));

		System.out.println(aTags.size());

		for (WebElement ele : aTags) {

			System.out.println("Link text is "+ele.getText());
		}
		System.out.println("**********************************************************");

		for (WebElement ele : aTags) {

			System.out.println("Link text is "+ele.getAttribute("innerHTML"));
		}
		System.out.println("**********************************************************");
		
		for (WebElement ele : aTags) {

			System.out.println("Link text is "+ele.getAttribute("outerHTML"));
		}
		
		System.out.println("**********************************************************");
		for (WebElement ele : aTags) {

			System.out.println("Link href is "+ele.getAttribute("href"));
		}
	}

}
