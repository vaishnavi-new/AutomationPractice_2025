package CommonInterface;

import org.openqa.selenium.WebElement;

public interface CommonMethods
{
    public void click();

    public void click(String xpath);

    public void click(WebElement webElement);

    public void Scroll(int x, int y);

}
