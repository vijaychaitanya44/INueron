package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ChromeDriver driv = new ChromeDriver();
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.marketo.com");
		
		Options opt = driver.manage();
		
		Window win =opt.window();
		
		win.maximize();
		
		Thread.sleep(5000);
		win.minimize();
		Thread.sleep(5000);

		
		win.maximize();
		win.fullscreen();
		Thread.sleep(5000);

		driver.quit();
		
	}
}
