package findElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.foundit.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));
		List<String> linksList = new ArrayList<>();
		for (WebElement ele : allLinks) {

			System.out.println(ele.getText());

			System.out.println(ele.getAttribute("href"));

			if (ele.getAttribute("href").startsWith("https")) {
				linksList.add(ele.getAttribute("href"));
			}
		}
		for(String link:linksList) {
			System.out.println(link);
		}
	}
}

