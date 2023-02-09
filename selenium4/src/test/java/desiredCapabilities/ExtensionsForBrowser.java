package desiredCapabilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionsForBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		
		File src = new File("./plugins/SelectorsHub.crx");
		opt.addExtensions(src);
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		

	}

}
