package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Work2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Youtube ana sayfasina gidelim https://www.youtube.com

        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);

        // Amazon sayfasina gidelim https://www.amazon.com

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        //Tekrar youtube sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi refresh (yenile) yapalim

        driver.navigate().refresh();
        Thread.sleep(2000);

        //sayfayi kapatalim

        driver.close();

    }
}
