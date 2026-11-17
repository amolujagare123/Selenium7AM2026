import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://amolujagare.com/stockmaster/");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnSignin = driver.findElement(By.className("btn-login"));

        btnSignin.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.partialLinkText("Customers")).click();

        driver.findElement(By.linkText("+ Add Customer")).click();

        WebElement txtFullName = driver.findElement(By.id("f_name"));
        txtFullName.sendKeys("Rohan Deshmukh");

        WebElement txtEmail = driver.findElement(By.id("f_email"));
        txtEmail.sendKeys("rohan.deshmukh@tatatech.in");

        WebElement txtPhone = driver.findElement(By.id("f_phone"));
        txtPhone.sendKeys("+91 98220 45678");

        WebElement txtCompany = driver.findElement(By.id("f_company"));
        txtCompany.sendKeys("Tata Technologies Ltd");

        WebElement txtCreditLimit = driver.findElement(By.id("f_credit"));
        txtCreditLimit.clear();               // field already contains "0"
       // txtCreditLimit.sendKeys("50000");

        WebElement txtCity = driver.findElement(By.name("city"));
        txtCity.sendKeys("Pune");

        WebElement txtCountry = driver.findElement(By.name("country"));
        txtCountry.sendKeys("India");

      /*  WebElement ddStatus = driver.findElement(By.name("status"));
        Select selectStatus = new Select(ddStatus);
        selectStatus.selectByVisibleText("Active");*/

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("Flat 302, Shivneri Apartments, FC Road, Shivajinagar");

        WebElement txtNotes = driver.findElement(By.name("notes"));
        txtNotes.sendKeys("Corporate client. Interested in bulk orders. Contact after 11 AM.");

        WebElement btnAddCustomer = driver.findElement(By.xpath("//button[@type='submit']"));
       // btnAddCustomer.click();

       // Thread.sleep(3000);   // only so you can see the result before the browser closes
      //  driver.quit();



    }
}
