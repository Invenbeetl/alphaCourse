import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SecondTest extends Fixtures {

    @Test
    public void newShortTest() {
        String actualText = navigate.toMainPage().goToMenPage().goToNewArrivalsPage().getMessageText();
        String expectedText = "There are no products matching the selection.";
        assertEquals(actualText, expectedText, "Messages are not equal");
    }


}
