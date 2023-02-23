package customUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	public static WebDriver startBrowser(String browser, String URL) {
		
		
		
		return null;
		
	}

	public static void clickElement(WebDriver driver, By locator) {

		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			try {
				System.out.println("clicking using actions class");
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(locator)).click().build().perform();
			} catch (Exception e2) {
				System.out.println("clicking using actions Javascript executor");

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click", driver.findElement(locator));
			}
		}
	}

	public static WebElement highLightElement(WebDriver driver, WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].setAttribute('style','background: lime; border: 2px solid red;')", element);

		Utility.waitForSeconds(2);

		jse.executeScript("arguments[0].setAttribute('style','background; border;')", element);
		return element;

	}

	public static WebElement highLightElement(WebDriver driver, By locator) {

		WebElement element = driver.findElement(locator);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].setAttribute('style','background: lime; border: 2px solid red;')", element);

		Utility.waitForSeconds(2);

		jse.executeScript("arguments[0].setAttribute('style','background; border;')", element);
		return element;

	}

	public static Alert waitForAlert(WebDriver driver) {

		Alert ale = null;
		for (int i = 0; i < 15; i++) {
			try {
				ale = driver.switchTo().alert();
				break;
			} catch (NoAlertPresentException e) {
				System.out.println("waiting for alert " + (i + 1) + " Second");
				waitForSeconds(1);
			}
		}
		return ale;
	}

	public static Alert waitForAlert(WebDriver driver, int time) {

		Alert ale = null;
		for (int i = 0; i < time; i++) {
			try {
				ale = driver.switchTo().alert();
				break;
			} catch (NoAlertPresentException e) {
				System.out.println("waiting for alert " + (i + 1) + " Second");
				waitForSeconds(1);
			}
		}
		return ale;
	}

	public static void waitForSeconds(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void captureScreenShot(WebDriver driver) {

		try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File("./src/screenshots/screenshot" + getCurrentDate() + ".png"));
			// FileHandler.copy(((TakesScreenshot)
			// driver).getScreenshotAs(OutputType.FILE),new
			// File("./src/screenshots/Set2.png"));
		} catch (IOException e) {
			System.out.println("Something Went Wrong " + e.getMessage());
		}

	}

	public static String getCurrentDate() {

		String cDate = (new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy")).format(new Date());

		return cDate;
	}
}
