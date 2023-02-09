package switchToCommandDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		System.out.println("2nd Linked in opend");
		String pWindow = driver.getWindowHandle();
		driver.switchTo().window(pWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		System.out.println("3rd Youtube in opend");
		Thread.sleep(3000);
		driver.switchTo().window(pWindow);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'faceb')]")).click();
		System.out.println("4rt fb in opend");

		driver.switchTo().window(pWindow);
		// String pWindow = driver.getWindowHandle();

		System.out.println(pWindow);

		Set<String> handles = driver.getWindowHandles();

		List<String> handlesList = new ArrayList<>(handles);

		driver.switchTo().window(handlesList.get(1)).close();
System.out.println("Linked closed");
		driver.switchTo().window(pWindow);

		driver.switchTo().window(handlesList.get(3)).close();
		System.out.println("fb closed");
		driver.switchTo().window(pWindow);

		// driver.close();
//	driver.switchTo().window(handlesList.get(0));
//	Thread.sleep(3000);
//	
//	driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//	driver.close();
//	Thread.sleep(5000);
//	driver.close();
//	driver.switchTo().window(handlesList.get(0));

	}

}
