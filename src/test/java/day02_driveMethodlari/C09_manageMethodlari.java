package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://amazon.com");
        /*
        ileride wait konusunu daha genis olarak ele alacagiz
        bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM sureyi belirleme olanagi tanir
         */

        driver.close();

    }

}
