package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        WebDriver chr;
        chr = new ChromeDriver();
        chr.manage().window().maximize();
        return chr;
    }
}
