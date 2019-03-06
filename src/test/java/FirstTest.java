import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.MenNewArrivalsPage;
import pages.MenPage;

import static org.testng.Assert.assertEquals;

public class FirstTest extends Fixtures {

    @Test(enabled = false)
    public void firstTest() throws InterruptedException {
        String locator = ".//li[contains(@class, 'level0')]/a[contains(@href, '/men.html')]";
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
        driver.findElement(By.xpath(".//img[@alt='New Arrivals']")).click();
        String actualText = driver.findElement(By.cssSelector(".note-msg  ")).getText().toLowerCase();
        String expectedText = "There are no products matching the selection.".toLowerCase();
        assertEquals(actualText, expectedText, "Messages are not equal");
    }


    @Test (enabled = false)
    public void firstRefactoredTest() throws InterruptedException {
        String locator = ".//li[contains(@class, 'level0')]/a[contains(@href, '/men.html')]";
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
        driver.findElement(By.xpath(".//img[@alt='New Arrivals']")).click();
        String actualText = driver.findElement(By.cssSelector(".note-msg  ")).getText();
        String expectedText = "There are no products matching the selection.";
        assertEquals(actualText, expectedText, "Messages are not equal");
    }

    @Test(enabled = false)
    public void oneMoreTest() {
        MainPage mainPage = new MainPage(driver);
        MenPage menPage = new MenPage(driver);
        MenNewArrivalsPage menNewArrivalsPage = new MenNewArrivalsPage(driver);
        mainPage.goToMenPage();
        menPage.goToNewArrivalsPage();
        String actualText = menNewArrivalsPage.getMessageText();
        String expectedText = "There are no products matching the seletion.";
        assertEquals(actualText, expectedText, "Messages are not equal");
    }

//    @Test
//    public void oneMoreRefactoredTest() {
//        madison.mainPage.goToMenPage();
//        madison.menPage.goToNewArrivalsPage();
//        String actualText = madison.menNewArrivalsPage.getMessageText();
//        String expectedText = "There are no products matching the selection.";
//        assertEquals(actualText, expectedText, "Messages are not equal");
//    }


    @Test
    public void veryShortTest() {
        String actualText = navigate.toMainPage().goToMenPage().goToNewArrivalsPage().getMessageText();
        String expectedText = "There are no products matching the selection.";
        assertEquals(actualText, expectedText, "Messages are not equal");
    }

}




