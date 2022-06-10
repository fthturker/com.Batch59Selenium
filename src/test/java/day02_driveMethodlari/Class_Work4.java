package day02_driveMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Work4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Amazon sayfasina gidelim https://www.amazon.com
        driver.get("https://www.amazon.com");

        //sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu : " + driver.manage().window().getPosition());
        System.out.println("sayfanin boyutu : " + driver.manage().window().getSize());

        // sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(15, 15));
        System.out.println("sayfanin yeni konumu : " + driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(900, 600));
        System.out.println("sayfanin yeni boyutu : " + driver.manage().window().getSize());

        //sayfanin sizin konum ve boyuta geldigini test edin
        System.out.println("en son konum : " + driver.manage().window().getPosition());
        System.out.println("en son boyut : " + driver.manage().window().getSize());

        //sayfayi kapatin
        driver.close();


    }

}
