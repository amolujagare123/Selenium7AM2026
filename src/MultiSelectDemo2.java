import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the element
        WebElement location = driver.findElement(By.id("source_118"));

        // 2. create the object of Select Class
        Select selText = new Select(location);

       // Thread.sleep(4000);

        // 3. select the option

        selText.selectByIndex(1);
        selText.selectByIndex(2);
        selText.selectByIndex(3);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

      //  Thread.sleep(4000);
     /*   selText.deselectByIndex(3);
        selText.deselectByIndex(4);*/


        WebElement location2 = driver.findElement(By.id("fld_118"));

        Select selLocation2 = new Select(location2);

        selLocation2.selectByIndex(1);
        selLocation2.selectByIndex(2);

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();

    }
}
