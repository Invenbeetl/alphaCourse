package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage extends BasePage{

    public static final String URL = "http://magento-demo.lexiconn.com/men.html";
    @FindBy(xpath = ".//img[@alt='New Arrivals']")
    private WebElement newArrivalsElement;

    public MenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public MenPage openPage() {
        driver.get(URL);
        return this;
    }

    public MenNewArrivalsPage goToNewArrivalsPage() {
        newArrivalsElement.click();
        return new MenNewArrivalsPage(driver);
    }
}
