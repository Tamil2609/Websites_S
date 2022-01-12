package selenium.websites;


    import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

public class listvalidate {
    static WebDriver driver;
        public static void main(String[] args)
        {

            System.setProperty("webdriver.chrome.driver", "D:\\Browserdrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://demoqa.com/alerts");

            WebElement checkBoxSelected = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            boolean isChecked = checkBoxSelected.isSelected();

            // click operation if element is not selected
            if(isChecked== false)
            {
               // checkBoxSelected.click();
                System.out.println("False");
            }
            else
            {
                System.out.println("True");
            }
        }

    }

