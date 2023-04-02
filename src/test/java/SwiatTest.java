import SwiatPop.MainPage;
import org.testng.annotations.Test;

import static SwiatPop.BaseSwiat.*;
import static org.testng.AssertJUnit.assertEquals;

public class SwiatTest extends BaseTest {

    @Test
    public void verifyBasketCounts() {
        //Open main page https://www.swiatroweru.com.pl/
        MainPage.open();

        mainPage.closeCookies();
        // Select a product
        mainPage.clickProducktByName("Fathom E+ 1 2023");
        productPage.clickAddToBasket();
        goHome();

        mainPage.clickProducktByName("Bagażnik tylny alu z mocowaniem pompki");
        productPage.clickAddToBasket();
        goHome();

        mainPage.clickProducktByName("Smar Allround");
        productPage.clickAddToBasket();
        goToBasket();
        basketPage.getBasketItem("Bagażnik tylny alu z mocowaniem pompki").changeQty(5);
        basketPage.clickPrzelicz();
        assertEquals(basketPage.getTotalQty(), 7);

    }
}
