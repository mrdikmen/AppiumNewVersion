Feature: PttAVM Mobil Uygulama Testi

  @ptt
  Scenario: Kullanici uygulamayi acar ve ana ekrani goruntuler
    Given Kullanici uygulamayi acar
    When hesabim bolumune gider
    Then Kullanici "Giris Yap" butonunun gorundugunu dogrular
    When Kullanıcı ana sayfaya geri doner
    And "Kategoriler" bolumune tiklar
    When "Beyaz Eşya" bolumunu secer
    And "Kurutma Makineleri" secenegine gider
    And Urunleri "Azalan Fiyat" a gore siralar
    Then fiyatlarin azalan duzende oldugunu dogrular