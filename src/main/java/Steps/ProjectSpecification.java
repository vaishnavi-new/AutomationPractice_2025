package Steps;

import io.cucumber.java.Before;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ProjectSpecification
{

    public static WebDriver driver ;
    @Before
    public void launchDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/Utils/Global.properties");
         prop.load(fis);
         String browser = prop.getProperty("Driver");
        String url=prop.getProperty("URL");
        if(browser.equalsIgnoreCase("CHROME"))
        {
                driver=new ChromeDriver();
                driver.get(url);

        }
        driver.manage().window().maximize();
    }

}
