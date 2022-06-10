import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class C00_denemeler {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
           driver.get("https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin");

            //2- Add Element butonuna basin
            WebElement addButonElementi=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
                    addButonElementi.click();

            //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
            //driver.findElement(By.xpath("//button[text()='Add Element']")).click();

            //3- Delete butonu’nun gorunur oldugunu test edin
            WebElement deleteButonuElementi=driver.findElement(By.xpath("//button[@class='added-manually']"));
            if (deleteButonuElementi.isDisplayed()){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
            deleteButonuElementi.click();

            //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin


    }
}
