import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Navigation;
import utils.PropertyLoader;
import utils.WebDriverFactory;

public class Fixtures {

    WebDriver driver;
    Navigation navigate;

    @BeforeTest
    public void setUp() {
        driver = WebDriverFactory.initDriver(PropertyLoader.loadProperty("browser"));
        navigate = new Navigation(driver);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
