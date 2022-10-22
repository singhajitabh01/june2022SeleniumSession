package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	/**
	 * Here webdriver is not static because static run one thread at one time
	 * Static not allow prallel eecution
	 */
	private WebDriver driver;
	
	public WebDriver LaunchBrowser(String Browser) {
		System.out.println("browser name is :"+Browser);
		switch (Browser.toLowerCase()) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\AjitabhS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Open in :"+Browser);
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\AjitabhS\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();//add dependency for webdriver manager
			driver = new FirefoxDriver();
			System.out.println("Open in :"+Browser);
			break;		
		default:
			System.out.println("Please enter valid user :"+Browser);
			break;
		}
		return driver;
	}
	/**
	 * In this we throw error bcz if url is wrong step not go further
	 * @param url
	 * @throws Exception
	 */
	public void launchUrl(String url) throws Exception {
		if(url == null) {
			System.out.println("url is blank");
			throw new Exception ("URLNULL");
		}
		
		if(url.length() == 0) {
			throw new Exception ("URLBLANKEXCEPITON");
		}	
		
        if(url.indexOf("http")!=0 || url.indexOf("https")!=0) {
			System.out.println("http(s) is miSSing in url");
			throw new Exception("Http(s)MISSINGEXCEPTION");
		}
		
		driver.get(url);
		
	}
	
	/**
	 * Not throw error bcz without title also we able to execute the step further
	 * @return
	 */
	public String getPageTitle() {
		String title= driver.getTitle();
		if(title!=(null)) {
			System.out.println("Current page url is :"+title);
			return title;
		}else {
			System.out.println("Getting Null Title...");
			return null;
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getPageURL() {
		 String url = driver.getCurrentUrl();
		if(url!=null) {
			System.out.println("Getting Page url as :"+url);
			return url;
		}else {
			System.out.println("Please add Valid url  :"+url);
			return null;
		}
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
			System.out.println("Browser is closed....");
		}
	}
	
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
			System.out.println("Browser is Quit . . .");
		}
	}
	
}
