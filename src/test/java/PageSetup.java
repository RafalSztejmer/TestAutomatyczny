import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {


        // typy zmiennych proste i obiektowe
        String projectLocation = System.getProperty("user.dir");
        ChromeDriver driver;

        @BeforeEach
        public void setup() {


            System.setProperty("webdriver.chrome.driver", projectLocation + "/zasoby/chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

        }

       // @AfterEach
        //public void teardown() {
            //driver.quit();
        //}

    }
