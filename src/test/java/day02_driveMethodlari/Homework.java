package day02_driveMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // facebook sayfasina gidin ve sayfa basliginin (title) ""facebook" oldugunu dogrulayin (verify),
        //degilse dogru basligi yazdirin

        driver.get("https://www.facebook.com");

        String actualTitle= driver.getTitle();
        String arananKelime="facebook";

        if (actualTitle.equals(arananKelime)){
            System.out.println("sayfa basligi testi PASSED");
        }else {
            System.out.println(driver.getTitle());
        }

        //sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="facebook";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println(driver.getCurrentUrl());
        }

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //sayfa basliginin "Walmart.com" icerdigini dogrulayin
        String actualTitle1= driver.getTitle();
        String arananKelime1="Walmart.com";

        if (actualTitle1.contains(arananKelime1)){
            System.out.println("sayfa basligi testi PASSED");
        }else {
            System.out.println(driver.getTitle());
        }

        //tekrar "facebook" sayfasina donun

        driver.navigate().back();
        Thread.sleep(2000);

        // sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        //sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //browser'i kapatin
        driver.close();


    }
}
