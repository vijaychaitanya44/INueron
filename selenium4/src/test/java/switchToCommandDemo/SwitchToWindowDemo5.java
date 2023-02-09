package switchToCommandDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String pWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		System.out.println("opened LinkedIn");

		Thread.sleep(2000);

		driver.switchTo().window(pWindow);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		System.out.println("opened Youtube");

		Thread.sleep(2000);

		driver.switchTo().window(pWindow);

		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		System.out.println("opened Facebook");

		Thread.sleep(2000);

		driver.switchTo().window(pWindow);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		System.out.println("opened Twitter");

		Thread.sleep(2000);

		driver.switchTo().window(pWindow);

		Set<String> handles = driver.getWindowHandles();

		List<String> handlesList = new ArrayList<>(handles);

		for (String tab : handlesList) {

			if (driver.switchTo().window(tab).getCurrentUrl().contains("facebook")) {

				System.out.println("Facebook da");
				driver.close();
				driver.switchTo().window(pWindow);
				break;
			} 
		}

	}

}
