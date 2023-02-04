package tests.UI.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;



public class BaseTest {


    @BeforeMethod(alwaysRun = true)
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // maximize window
        driver.manage().deleteAllCookies(); // delete all the cookies


        String baseUrl = "https://pid.cz/metro/";

        driver.get(baseUrl);

    }
}

