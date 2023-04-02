package SwiatPop;

import org.openqa.selenium.By;

public class MainPage extends BaseSwiat {


    public static void open() {
        driver.get("https://www.swiatroweru.com.pl/");
        mainPage = new MainPage();
    }

    public void closeCookies() {
        driver.findElement(By.id("coockies_close")).click();
    }

    public void clickProducktByName(String name) {
        driver.findElement(By.linkText(name)).click();
        productPage = new ProductPage();

    }
}
