package selenium.websites;


    import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlist
{
        public static void main(String[] args)
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Browserdrivers\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://demoqa.com/alerts");

            // Find elements using tag name
            List<WebElement> allInputElements = driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
            System.out.println("no of items "+allInputElements.size());

            if(allInputElements.size() != 0)
            {
                System.out.println(allInputElements.size() + " Elements found by TagName as input \n");

                for(WebElement inputElement : allInputElements)
                {
                    for (int i = 0; i < allInputElements.size(); i++)
                    {
                       // System.out.println(inputElement.getAttribute("class"));
                        System.out.println(allInputElements.get(i).getText());
                    }
                }
            }
        }
    }

