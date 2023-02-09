package switchToCommandDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToIframeDemo
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Practise']")).click();
		Thread.sleep(5000);
		WebElement iFrame = driver.findElement(By.xpath("//iframe[contains(@src,'ineuron')]"));
		
		driver.switchTo().frame(iFrame);
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		System.out.println("Clicked");
	}

}
