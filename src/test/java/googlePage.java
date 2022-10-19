import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googlePage {

    @Test
    public void searchForTesting(){
          System.out.println("search for testing");
    }
    @BeforeMethod
    public void openPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
        System.out.println("open google page");
        
    }

}
