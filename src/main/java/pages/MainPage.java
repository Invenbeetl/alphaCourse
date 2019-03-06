package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    private static final String URL = "http://magento-demo.lexiconn.com/";
    @FindBy(xpath = ".//li[contains(@class, 'level0')]/a[contains(@href, '/men.html')]")
    private WebElement menPageLinkElement;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public MainPage openPage() {
        driver.get(URL);
        return this;
    }

    public MenPage goToMenPage() {
        menPageLinkElement.click();
        return new MenPage(driver);
    }
}
