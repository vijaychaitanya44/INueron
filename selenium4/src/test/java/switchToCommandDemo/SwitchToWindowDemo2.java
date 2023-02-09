package switchToCommandDemo;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		String parentWind = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {

			String child = itr.next();
			if (!parentWind.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());

				driver.close();

			}
		}
		driver.switchTo().window(parentWind);
		System.out.println(driver.getTitle());
	}

}
