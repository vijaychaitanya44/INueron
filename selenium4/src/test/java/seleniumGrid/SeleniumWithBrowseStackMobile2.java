package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWithBrowseStackMobile2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("osVersion", "16");
		cap.setCapability("deviceName", "iPhone 14");
		//cap.setCapability("local", "false");
		//cap.setCapability("browserVersion", "108.0");
		
		URL seleniumGrid = new URL("http://vijaychaitanya_ZBvepY:LTZECkgAiTLzuwzdTxWm@hub.browserstack.com/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(seleniumGrid, cap);
		
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		System.out.println("Title is : "+driver.getTitle());
		
		driver.quit();
		
		
		

	}

}
