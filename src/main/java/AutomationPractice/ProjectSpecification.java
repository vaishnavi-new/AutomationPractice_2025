package AutomationPractice;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Properties;

public class ProjectSpecification
{
    public void launchDriver()

    public static WebDriver driver ;
     {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/Utils/Global.properties");
    }
    catch()
    {
        throw new  FileNotFoundException;
    }
    {
        if(prop.get(Driver).equalsIgnorecase("Chrome"))
        {

        }
    }
}
