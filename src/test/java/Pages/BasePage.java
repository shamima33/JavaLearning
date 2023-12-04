package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage {public static WebDriver driver;
    public void open_chrome_browser(){
        String Chromedriver_path="C:\\workspace 4\\JavaLearning\\chromedriver.exe";
        String  Chromedriver="WebDriver.chrome.driver";

        String url="https://qa.iqrashoppingdemo.xyz/";
        System.setProperty(
               Chromedriver,Chromedriver_path);

        // Instantiate a ChromeDriver class.driver = new ChromeDriver();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");

        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        System.out.println("I am on the Registration page");
    }


}


