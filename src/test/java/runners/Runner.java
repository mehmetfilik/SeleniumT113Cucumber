package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ss", // work in process
        // veya coklu taglar icin "@grup1 and @grup2"
        // veya "@grup1 or @grup2"
        dryRun = false // SADECE eksik adim var mi diye bakmak istedigimizde true olmali
)

public class Runner {
    /*
        Cucumber'da Runner Class'i istedigimiz testleri calistirmak
        ve he calisitirilan test icin rapor hazirlamak amaciyla kullanilir

        Runner Class'i bos bir class'tir

        Belirtilen bu isleri
        class icerisindeki kodlar degil
        class deklerasyonunda kullanacagimiz Notasyonlar halleder

        @RunWith notasyonu framwork'umuze JUnit yuklememizin sebebidir
            ve Runner Class'inin cucumber ile calismasini saglar

        @CucumberOptions ise framework'umuzde gerekli ayarlari yapar

        features : feature dosyalarimizin bulundugu konumu gosterir
                    dikkat edilirse tek tek feature dosyalarini degil
                    tum feature dosyalarini iceren klasorun yolunu yaziyoruz
        glue : featur dosyalari ile bagli olan
                Java method'larinin yerini gosterir
                Burada da tek tek class'lari degil
                tumclass'lari iceren package'in adresini yazariz
                boylece ilgili step hangi class altinda olursa olsun
                cucmber bulup calistirir
       tags : calistirilacak Feature veya Scenerio(lari) isaretlemek icin kullanilir
                Cucumber Runner class'i calistirildiginda
                tum feature dosyalarini gozden gecirir ve
                Runner clas'inda belirtilen tag'a sahip
                TUM Feature ve Scenerio(lari) calistirir

                Eger birden fazla tag'i kontrol ederek calistirmasini istersek
                "@grup1 and @grup2" veya "@grup1 or @grup2" olarak yazabiliriz

       dryRun : Bir feature dosyasini ilk defa yazdigimizda
                step'lerden bazilari daha once var oldugundan BEYAZ
                bazilari ise ilk defa kullanacagimiz icin SARI olur

                Bu feature dosyasini direkt calistirmak istersek
                Bastan baslayarak beyaz olan adimlari calistirir
                Ilk sari adima geldiginde exception firlatip
                calistirmayi denedigi ilk sari satir ve
                geriye kalan sari satirlarin eksik stepllerini bize yazdirir

                Amacimiz Feature dosyasini calistirmak degil
                sadece eksik steplere ait kodlari olusturmak ise
                Runner class'inda dryRun = true yapip
                Runner class'ini calistiririz

                dryRun = true dedigimizde
                Cucumber testleri calistirmaz, sadece eksik adim var mi diye kontrol eder
                eksik adim yoksa Test PASSED yazar

                dryRun = flase default degerdir
                ve Testleri normal olarak calistirmamizi saglar

     */


}
