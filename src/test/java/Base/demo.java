package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws IOException {
		Properties prop =new Properties();
		FileInputStream fs=new FileInputStream ("C:/Users/KamranKhan/eclipse-workspace/com.hrportal/configuraton/config.Properties");
		prop.load(fs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println(prop.getProperty("URL"));
		driver.get("http://streamshrapplication-env.eba-srcdj8aw.us-east-1.elasticbeanstalk.com/");

	}

}
