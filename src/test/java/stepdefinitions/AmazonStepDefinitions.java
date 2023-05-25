package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfaya gider")
    public void kullanici_amazon_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
       amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = "Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("Java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+Keys.ENTER);
    }
    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = "Java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @When("Samsung icin arama yapar")
    public void samsungIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Samsung"+Keys.ENTER);
    }

    @Then("Arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = "Samsung";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @Then("Title'in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedIcerik = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
    }
}