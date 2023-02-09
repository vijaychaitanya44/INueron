package switchToCommandDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/**
		 * Alert -Info
		 * 
		 * alert("Hello")
		 * 
		 * Confirm - accept / dismiss
		 * 
		 * Prompt - input/enter details
		 * 
		 * 
		 * 
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		Thread.sleep(5000);
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		

	WebElement ele =	driver.findElement(By.xpath("//button[text()='Click to see after 5s']"));
	
	jse.executeScript("arguments[0].scrollIntoView()", ele);
	
	Thread.sleep(3000);
	ele.click();

		// Alert alt = driver.switchTo().alert();
		for (int i = 0; i < 10; i++) {

			try {
				Alert alt = driver.switchTo().alert();
				String ss= alt.getText();
				if (ss.contains("code")) {
					
					System.out.println("Pass");
					alt.accept();
					break;
				}
				
				else {
					System.out.println("no text present");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Thread.sleep(1000);
				System.out.println("Waiting for alert to disapper");
			}

		}
		
		System.out.println("Done");
	}

}
