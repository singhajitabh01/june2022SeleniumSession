package seleniumSession;

public class BlueEnv {	
	public static void main(String[] args) throws Exception {
		String browser = "chrome";
		
		BrowserUtil brutil = new BrowserUtil();
		brutil.LaunchBrowser(browser);
		brutil.launchUrl("https://blue-slc.bsdspeclink.com/#/");
		Thread.sleep(9000);
		brutil.getPageURL();
		brutil.getPageTitle();
		brutil.closeBrowser();
		
	}

}
