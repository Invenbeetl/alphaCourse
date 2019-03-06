package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenNewArrivalsPage extends BasePage{

    public static final String URL = "http://magento-demo.lexiconn.com/men/new-arrivals.html";
    @FindBy(css = ".note-msg")
    private WebElement msgElement;

    public MenNewArrivalsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public MenNewArrivalsPage openPage() {
        driver.get(URL);
        return this;
    }

    public String getMessageText() {
        return msgElement.getText();
    }
}
