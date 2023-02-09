package webdriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBack2Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		int radioButtons =driver.findElements(By.xpath("//input[@type='radio']")).size();
		
		int selectCount = driver.findElements(By.tagName("select")).size();
		
		int selectCC = driver.findElements(By.xpath("//select")).size();
		
		
		System.out.println(radioButtons);
		System.out.println(selectCount);
		System.out.println(selectCC);
	}

}
