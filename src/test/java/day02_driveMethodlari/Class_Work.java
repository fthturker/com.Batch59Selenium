package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Work {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //sayfa basligini (title) yazdirin
        System.out.println("actual title :" +driver.getTitle());

        //sayfa basliginin "Amazon" icerdigini test edin

        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.equals(arananKelime)){
            System.out.println("actual Test PASSED");
        }else {
            System.out.println("actual test FAILED");
        }

        //sayfa adresini (url) yazdirin

        System.out.println(driver.getCurrentUrl());

        //sayfa url'nin "amazon icerdigini test edin

        String sayfaKaynakKodlari=driver.getPageSource();
        String ArananKelime = "amazon";

        if (sayfaKaynakKodlari.contains(ArananKelime)){
            System.out.println("Kaynak kodu testi PASSED");
        }else{
            System.out.println("Kaynak kodu testi FAILED");
        }
        // sayfa handle degerini yaziniz

        System.out.println(driver.getWindowHandle());

        driver.close();

    }
}
