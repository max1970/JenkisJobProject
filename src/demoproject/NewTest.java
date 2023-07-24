/**
 * This is the test used for Jenkins Job demo.
 */
package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


/**
 * @author Kundana
 *
 */
public class NewTest {

	/**
	 * @param none presently
	 */
	@Test
	public void testJenkinsJob(){
		
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\"+"geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get("https://www.gmail.com");
		    driver.close();
		    System.out.println("Jenkins Job");
		    System.out.println("Jenkins Job");
		    System.out.println("Jenkins Job");
		}

	}


