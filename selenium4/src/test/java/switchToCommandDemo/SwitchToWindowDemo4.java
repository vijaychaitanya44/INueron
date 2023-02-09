package switchToCommandDemo;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String parent = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://ineuron-courses.vercel.app/signup");

		System.out.println("New Tab title" + driver.getTitle()+ "-" + driver.getCurrentUrl());

		driver.switchTo().window(parent);
		System.out.println("Parent tab title" + driver.getTitle() + "-" + driver.getCurrentUrl());
		
		

	}

}
