package selenium.webdriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/**
 * @author Fil Lost
 * @since 17.09.2021
 */
public class WebDriverSettings {

	public WebDriver chromeDriver;

	@BeforeEach
	private void setupChromeDriver(){

		System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().setSize(new Dimension(1280,900));
		chromeDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		chromeDriver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterEach
	private void closeTest(){
		chromeDriver.quit();
		System.out.println("End Test.");
	}

}
