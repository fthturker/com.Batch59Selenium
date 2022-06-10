package day03_locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // youtube web sayfasina gidin ve sayfa basliginin "youtube" olup olmadigini dogrulayin
        // eger degilse dogru basligi (Actual Title) konsolda yazdirin
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
            System.out.println(actualTitle);
        }
        //sayfa Url'sinin "youtube" icerip icermedigini (contains) dogrulayin,
        //icermiyorsa dogru Url'yi yazdirin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "youtube";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
            System.out.println(actualUrl);
        }
        //amazon sayfasina gidin
        driver.navigate().to("https://www.amazon.com");

        //youtube sayfasina geri donun
        driver.navigate().to("https://www.yotube.com");

        //sayfayi yenileyin
        driver.navigate().refresh();

        //amazon sayfasina donun
        driver.navigate().to("https://www.amazon.com");

        //sayfayi tam sayfa yapin
        driver.manage().window().maximize();

        // sayfa basliginin "Amazon" icerip icermedigini (contains) dogrulayin,
        //yoksa dogru basligi yazin
        String actualTitle1 = driver.getCurrentUrl();
        String expectedTitle1 = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
            System.out.println(actualUrl);
        }
        System.out.println(actualTitle);

        //sayfa Url'sinin https://amazon.com/ olup olmadigini dogrulayin,
        //degilse dogru Url'yi yazdirin

        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 = "https://amazon.com/";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
            System.out.println(actualUrl);

            //sayfayi kapatin
            driver.close();
        }
    }
}