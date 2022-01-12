package selenium.websites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class duplicatelink {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "D:\\Browserdrivers\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://facebook.com/");

            //Storing the links in a list and traversing through the links
            List<WebElement> links = driver.findElements(By.tagName("a"));

            // This line will print the number of links and the count of links.
            System.out.println("No of links are "+ links.size());
            for(int i=0;i<links.size();i++)
            {
                System.out.println(links.get(i).getAttribute("href"));
                System.out.println(links.get(i).getText());
            }
            System.out.println("Checking the link is broken or not");
            //checking the links fetched.
            for(int i=0;i<links.size();i++)
            {
                WebElement E1= links.get(i);
                String url= E1.getAttribute("href");
                verifyLinks(url);
            }

            driver.quit();
        }


       public static void verifyLinks(String linkUrl)
        {
            try
            {
                URL url = new URL(linkUrl);
                HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
                httpURLConnect.setConnectTimeout(5000);
                httpURLConnect.connect();

                if(httpURLConnect.getResponseCode()>=400)
                {
                    System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
                }
                else{
                    System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
                }
            }catch (Exception e) {
            }
        }
    }
