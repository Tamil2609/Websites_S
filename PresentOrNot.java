package selenium.websites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PresentOrNot {
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Browserdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        element2.click();
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='CheckboxFilter-module__checkboxLabel_21MUk0e7QdlZKH5Xcwap-F']"));
        int count = elements.size();
        System.out.println("count is " + count);
        for (int i = 0; i <= elements.size(); i++)
        {
            List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]//div/label/span"));
            String s = elements.get(i).getText();
            System.out.println(s);
        }
    }
}