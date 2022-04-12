package Environment;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    // blocks of code that runs before OR after each scenario
    // hooks are Listeners like in TestNG
    // Can define hooks by using annotations @Before @After

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void browserSetup(){

        System.out.println("Setting up Chrome Browser driver...");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void browserTeardown(){
        driver.close();
        driver.quit();
    }

}
