
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.BrowserDriver;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class BrowserStepDef {
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String gidilecekUrl) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(gidilecekUrl));

    }
    @Then("urun arama kutusunun oldugunu dogrular")
    public void urun_arama_kutusunun_oldugunu_dogrular() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(BrowserDriver.getBrowserDriver().findElement(By.xpath("//*[@class='searchBoxMobile-HLBEklMWSf7vqDf20K1w']")).isDisplayed());

    }
    @Then("App indir butonuna tiklar")
    public void app_indir_butonuna_tiklar() {
        ReusableMethods.bekle(3);
        BrowserDriver.getBrowserDriver().findElement(By.xpath("//*[@class='sf-DownloadAppIcon-HqDeeweXhmgtqbV9yykK']")).click();

    }
}
