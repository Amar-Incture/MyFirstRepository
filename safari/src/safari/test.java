package safari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.get("http://google.com");
	}

}
