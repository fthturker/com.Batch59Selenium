package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Work3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // amazon sayfasina gidelim https://www.amazon.com

        driver.get("https://www.amazon.com");

        // sayfanin konumunu ve boyutlarini yazdirin

        //konum
        System.out.println("sayfanin konumu : " +driver.manage().window().getPosition());

        //boyut

        System.out.println("sayfanin boyutu : " +driver.manage().window().getSize());

        //sayfayi simge durumuna getirin

        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //sayfanin konumunu ve boyutlarini maximize durumunda yazdirin

        System.out.println("sayfanin max. konumu : " +driver.manage().window().getPosition());
        System.out.println("sayfanin max. boyutu : " +driver.manage().window().getSize());

        //sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin

        System.out.println("fullscreen konumu : " +driver.manage().window().getPosition());
        System.out.println("fullscreen boyutu : " +driver.manage().window().getSize());

        // sayfayi kapatin

        driver.close();
    }
}
