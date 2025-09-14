
Feature: PttAVM Mobil Uygulama Testi

  @eptt
  Scenario: Kullanıcı uygulamayı açar ve ana ekranı görüntüler
    Given Kullanici uygulamayi acar
    When hesabim bolumune gider
    Then Kullanıcı "Giriş Yap" butonunun göründüğünü doğrular
    When Kullanıcı ana sayfaya geri doner
    And "Kategoriler" bolumune tiklar
    When "Beyaz Eşya" bolumunu secer
    And "Kurutma Makineleri" secenegine gider
    And Urunleri "Azalan Fiyat" a gore siralar
    Then fiyatlarin azalan duzende oldugunu dogrular
