package tests.UI.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.UI.base.BaseTest;


public class SearchProduct extends BaseTest {


    @Test
    public void testSearchProduct() {
        WebDriver driver = new ChromeDriver();

//        WebElement acceptCookies = driver.findElement(By.xpath("//button[.//text()='Accept Cookies']"));
//        acceptCookies.click();



        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Vyhledat']"));
        searchBox.click();
        //searchBox.clear();
        searchBox.sendKeys("aaa");




//        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Я шукаю...']"));
//        searchBox.sendKeys("aaa");



//        String expected = "https://open.spotify.com/search";
//
//        String actualURL = "https://open.spotify.com/search";
//
//        Assert.assertEquals(expected, actualURL);
//
//        WebElement searchInput = driver.findElement(By.xpath(" //input[@data-testid=\"search-input\"] "));
//        searchInput.sendKeys("Justin Bieber");
//        searchInput.getText();






        //Assert.assertTrue(searchInput.contains("Justin Bieber"));
        //Assert.assertTrue(driver.getPageSource().contains("Justin Bieber");
        //assertEquals(searchInput.getText(), "Justin Bieber");
        //


    }
}

