package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public static Properties prop = new Properties();
	public static WebDriver driver;
	public static Logger log;
	
	public BaseClass() {
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\n\\eclipse-workspace\\Amazon_CA\\src\\test\\java\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void initiantion() throws InterruptedException {
	String br = prop.getProperty("browser");
		if (br.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver(options);
		} else if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			 
			driver = new ChromeDriver(options);
		}

		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	    driver.navigate().refresh();
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);
        
	    log=Logger.getLogger("Amazon");
	}
	
	public static void screenshot(String Filename) {
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,
					new File("C:\\Users\\n\\eclipse-workspace\\Amazon_CA\\Screenshort\\Passed\\"
							+ Filename + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Failed ScreenShot
	public static void Failed_screenshot(String TestMethodName) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,
					new File("C:\\Users\\n\\eclipse-workspace\\Amazon_CA\\Screenshort\\Failed\\" + TestMethodName + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
