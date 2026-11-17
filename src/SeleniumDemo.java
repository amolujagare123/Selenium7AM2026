import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
       // WebDriver driver = new EdgeDriver();

        //driver.manage().window().maximize();
        driver.get("http://facebook.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");

        Thread.sleep(4000);

      //  driver.close(); // closes the current window only
       driver.quit(); // closes all the windows opened by the driver
    }
}
