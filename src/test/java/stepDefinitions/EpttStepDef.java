package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EpttPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class EpttStepDef {
    EpttPage page=new EpttPage();

    @Given("Kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();

    }
    @When("hesabim bolumune gider")
    public void hesabim_bolumune_gider() {
        ReusableMethods.bekle(2);
        page.AccountButton.click();

    }
    @Then("Kullanıcı {string} butonunun göründüğünü doğrular")
    public void kullanıcı_butonunun_göründüğünü_doğrular(String girisYap) {
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.GirisYapButton.isDisplayed());
    }

    @When("Kullanıcı ana sayfaya geri doner")
    public void kullanıcı_ana_sayfaya_geri_doner() {
        ReusableMethods.bekle(3);
        page.geriOkButton.click();

    }
    @When("{string} bolumune tiklar")
    public void bolumune_tiklar(String kategoriler) {
        ReusableMethods.bekle(3);
        page.kategorilerButton.click();
        //ReusableMethods.scrollWithUiScrollableAndClick(kategoriler);
    }
    @When("{string} bolumunu secer")
    public void bolumunu_secer(String secilecekBolum) {
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(secilecekBolum);

    }
    @When("{string} secenegine gider")
    public void secenegine_gider(String secilecekUrun) {
        ReusableMethods.bekle(3);
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.70,0.30,0.50,80);
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(secilecekUrun);
    }
    @When("Urunleri {string} a gore siralar")
    public void urunleri_a_gore_siralar(String azalanFiyat) {
        ReusableMethods.bekle(4);
        page.siralaButton.click();
        ReusableMethods.bekle(4);
        page.AzalanFiyatText.click();
    }
    @Then("fiyatlarin azalan duzende oldugunu dogrular")
    public void fiyatlarin_azalan_duzende_oldugunu_dogrular() {
        String yeniAzalanYuksekFiyat=page.AzalanEnYuksekFiyat.getText();
        yeniAzalanYuksekFiyat=yeniAzalanYuksekFiyat.replaceAll("\\D","");
        System.out.println(yeniAzalanYuksekFiyat);

        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,70);

        String yeniAzalanDusukFiyat =page.AzalanDusukFiyat.getText();
        yeniAzalanDusukFiyat=yeniAzalanDusukFiyat.replaceAll("\\D","");
        System.out.println(yeniAzalanDusukFiyat);

        Assert.assertTrue(Integer.parseInt(yeniAzalanYuksekFiyat)>Integer.parseInt(yeniAzalanDusukFiyat));
    }
}