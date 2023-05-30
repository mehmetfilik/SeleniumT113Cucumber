Feature: US1010 Kullanici yanlis email ile sisteme giris yapmaz
@ae
  Scenario: TC16 eksik email ile sisteme giris yapilamaz

    Given Kullanici "aeUrl" sayfaya gider
    And user sign up linkine tiklar
    And Login to your account bolumunde email kutusuna @isareti olmayan email adresi yazar
    And password kutusuna sifre yazar ve enter’a tiklar
    And sisteme giris yapilamadigini test eder
    And Sayfayi kapatir
