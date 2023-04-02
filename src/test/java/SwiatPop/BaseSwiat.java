package SwiatPop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseSwiat {
    public static WebDriver driver;
    public static MainPage mainPage;
    public static BasketPage basketPage;
    public static ProductPage productPage;

    static public void goHome() {
        driver.findElement(By.cssSelector("#navtopdefault li:first-of-type")).click();
        mainPage = new MainPage();

    }

    static public void goToBasket() {
        driver.findElement(By.cssSelector("#top_menu_basket")).click();
        basketPage = new BasketPage();
    }
}
