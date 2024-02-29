package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	 
	 public static void initDriver() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	 }

	 public void takeScreenshot(WebDriver driver) {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy_HHmmss");
		 Date date = new Date();
		 String lable = formatter.format(date);
		 
		 try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshots/"
					 + lable + ".png" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
