package selenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver1 = new ChromeDriver();
		
		Thread.sleep(300);
		
		System.out.println("Chrome done");
		FirefoxDriver driver2 = new FirefoxDriver();
		Thread.sleep(300);
		
		System.out.println("FF done");
		SafariDriver driver3 = new SafariDriver();
		Thread.sleep(300);
		
		System.out.println("Safari done");
		

	}

}
