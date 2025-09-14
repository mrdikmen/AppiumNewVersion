Feature: Mobil cihazda browser testi
  @browser
  Scenario: Kullanici ilgili browserda testleri yapar
    Given Kullanici "url" adresine gider
    Then urun arama kutusunun oldugunu dogrular
    Then App indir butonuna tiklar