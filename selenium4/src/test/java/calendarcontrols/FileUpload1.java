package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\vijay\\Downloads\\illustration.png");
		
		driver.findElement(By.xpath("//input[@value='Upload']")).click();
		
		
		String result =driver.findElement(By.tagName("h3")).getText();
		
		if(result.contentEquals("File Uploaded!")) {
			System.out.println("File Uploaded! Successfully");
		}
		else {
			System.out.println("File Uploaded! Failed");
		}
		
	}

}
