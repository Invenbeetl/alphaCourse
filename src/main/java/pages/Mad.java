package pages;

import org.openqa.selenium.WebDriver;

public class Mad {

    public WebDriver driver;
    public MainPage mainPage;
    public MenNewArrivalsPage menNewArrivalsPage;
    public MenPage menPage;

    public Mad(WebDriver driver) {
        this.driver = driver;
        mainPage = new MainPage(driver);
        menNewArrivalsPage = new MenNewArrivalsPage(driver);
        menPage = new MenPage(driver);
    }
}
