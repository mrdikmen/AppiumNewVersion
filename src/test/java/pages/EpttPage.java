
package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EpttPage {
    public EpttPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);}

    @FindBy(id="com.pttem.epttavm:id/buttonOpenAccountPage")
    public WebElement AccountButton;

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public WebElement GirisYapButton;


}
