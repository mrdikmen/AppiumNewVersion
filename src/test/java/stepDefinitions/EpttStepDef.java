package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EpttPage;
import utilities.Driver;

public class EpttStepDef {
    EpttPage page=new EpttPage();

    @Given("Kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();

    }
    @When("hesabim bolumune gider")
    public void hesabim_bolumune_gider() {
        page.AccountButton.click();

    }
    @Then("Kullanici {string} butonunun gorundugunu dogrular")
    public void kullanici_butonunun_gorundugunu_dogrular(String string) throws InterruptedException {

        Assert.assertTrue(page.AccountButton.isDisplayed());
    }

    @When("Kullanıcı ana sayfaya geri doner")
    public void kullanıcı_ana_sayfaya_geri_doner() {

    }
    @When("{string} bolumune tiklar")
    public void bolumune_tiklar(String string) {

    }
    @When("{string} bolumunu secer")
    public void bolumunu_secer(String string) {

    }
    @When("{string} secenegine gider")
    public void secenegine_gider(String string) {

    }
    @When("Urunleri {string} a gore siralar")
    public void urunleri_a_gore_siralar(String string) {

    }
    @Then("fiyatlarin azalan duzende oldugunu dogrular")
    public void fiyatlarin_azalan_duzende_oldugunu_dogrular() {

    }
}