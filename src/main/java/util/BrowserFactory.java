package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;
	static String browser;
	static String url;

	public static void readConfig() throws IOException {

		try {
			InputStream input = new FileInputStream("src\\main\\java\\configFile1");
			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty(browser);
			url = prop.getProperty(url);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static WebDriver init() {
		
		try {
			readConfig();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "driver\\chromedrivernew.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}

}
