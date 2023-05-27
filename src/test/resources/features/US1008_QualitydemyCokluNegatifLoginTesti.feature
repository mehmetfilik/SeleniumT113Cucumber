Feature: US1008 Toplu kullanici listesi ile negatif login testi

  Scenario Outline: TC14 Kullanici listedeki kullanici bilgileri ile giris yapilamadigini test eder

    Given Kullanici "qdUrl" sayfaya gider
    Then ilk login linkine click yapar
    And user email olarak "<email>" girer
    And password olarak "<password>" girer
    When login butonuna basar
    Then giris yapilamadigini test eder
    And Sayfayi kapatir

    Examples:
      | email | password |
      | abc@gmail.com | 12345 |
      | def@gmail.com | 23456 |
      | ghi@gmail.com | 34567 |

