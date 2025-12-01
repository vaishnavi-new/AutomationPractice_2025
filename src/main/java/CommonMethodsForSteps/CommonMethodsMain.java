package CommonMethodsForSteps;

import CommonInterface.CommonMethods;
import Steps.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonMethodsMain  extends ProjectSpecification implements CommonMethods
{

    @Override
    public void click()
    {

    }

    @Override
    public void click(String xpath)
    {
        driver.findElement(By.xpath(xpath)).click();
    }

    @Override
    public void click(WebElement webElement)
    {

    }

    @Override
    public void Scroll(int x, int y) {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+");");
    }
}
