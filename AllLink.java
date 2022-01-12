package selenium.websites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import java.text.ParseException;
public class AllLink
{

    public static void main(String[] args) throws  ParseException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Browserdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://facebook.com/");
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println("Total tags are:"+list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getAttribute("href"));
            System.out.println(list.get(i).getText());
        }
    }
}


