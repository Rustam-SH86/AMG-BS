import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractPageTest {

   static WebDriver driver;

  @BeforeAll
    public static void SetUp() {
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--incignito");
      options.addArguments("start-maximized");
      driver = new ChromeDriver(options);
      options.setPageLoadTimeout(Duration.ofSeconds(10));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));





  }
  @AfterAll
    static void endSession () {
      if (driver != null) {
          driver.quit();
      }
  }




}
