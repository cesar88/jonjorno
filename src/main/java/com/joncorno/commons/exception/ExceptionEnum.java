package com.joncorno.commons.exception;

/**
 * Kktc meb exception enum enum sınıfı.
 *
 * @author  Fatih Goken 
 */
public enum ExceptionEnum {
    /**
     * Islem basariyla gerceklestirildi kktc meb exception enum.
     */
    ISLEM_BASARIYLA_GERCEKLESTIRILDI("100", "islemBasariylaGerceklestirildi.info.message"),
    /**
     * Kayit basariyla gerceklestirildi kktc meb exception enum.
     */
    KAYIT_BASARIYLA_GERCEKLESTIRILDI("101", "kayitBasariylaGerceklestirildi.info.message"),
    /**
     * Guncelleme basariyla gerceklestirildi kktc meb exception enum.
     */
    GUNCELLEME_BASARIYLA_GERCEKLESTIRILDI("102", "updatemeBasariylaGerceklestirildi.info.message"),
    /**
     * Silme basariyla gerceklestirildi kktc meb exception enum.
     */
    SILME_BASARIYLA_GERCEKLESTIRILDI("103", "silmeInfo.validation.growl.message"),

    /**
     * Erisim engellendi kktc meb exception enum.
     */
    ERISIM_ENGELLENDI("403", "erisimEngellendi.error.message"),
    /**
     * Servis hatasi kktc meb exception enum.
     */
    SERVIS_HATASI("50000", "servisHatasi.error.message"),
    /**
     * Bir sorunla karsilasildi kktc meb exception enum.
     */
    BIR_SORUNLA_KARSILASILDI("500", "birSorunlaKarsilasildi.error.message"),
    /**
     * Ders service unavailable kktc meb exception enum.
     */
    DERS_SERVICE_UNAVAILABLE("510", "dersServisiUygunDegil.text"),
    /**
     * Ders bilgi service unavailable kktc meb exception enum.
     */
    DERS_BILGI_SERVICE_UNAVAILABLE("511", "dersBilgiServisiUygunDegil.text"),
    /**
     * Donem service unavailable kktc meb exception enum.
     */
    DONEM_SERVICE_UNAVAILABLE("512", "donemServisiUygunDegil.text"),
    /**
     * Ogrenci service unavailable kktc meb exception enum.
     */
    OGRENCI_SERVICE_UNAVAILABLE("513", "ogrenciServisiUygunDegil.text"),
    /**
     * Ogrenci kayit bilgi service unavailable kktc meb exception enum.
     */
    OGRENCI_KAYIT_BILGI_SERVICE_UNAVAILABLE("514", "ogrenciKayitBilgiServisiUygunDegil.text"),
    /**
     * Okul service unavailable kktc meb exception enum.
     */
    OKUL_SERVICE_UNAVAILABLE("515", "okulServisiUygunDegil.text"),
    /**
     * Okul turu service unavailable kktc meb exception enum.
     */
    OKUL_TURU_SERVICE_UNAVAILABLE("516", "okulTuruServisiUygunDegil.text"),
    /**
     * Sinif duzeyi service unavailable kktc meb exception enum.
     */
    SINIF_DUZEYI_SERVICE_UNAVAILABLE("517", "sinifDuzeyiServisiUygunDegil.text"),
    /**
     * Sinif sube service unavailable kktc meb exception enum.
     */
    SINIF_SUBE_SERVICE_UNAVAILABLE("518", "sinifSubeServisiUygunDegil.text"),
    /**
     * Duyuru service unavailable kktc meb exception enum.
     */
    DUYURU_SERVICE_UNAVAILABLE("519", "duyuruServisiUygunDegil.text"),
    /**
     * Personel service unavailable kktc meb exception enum.
     */
    PERSONEL_SERVICE_UNAVAILABLE("520", "personelServisiUygunDegil.text"),
    /**
     * Kisi not found exception kktc meb exception enum.
     */
    KISI_NOT_FOUND_EXCEPTION("1000", "kisiKaydiBulunamadi.text"),
    /**
     * Kisi alreadyexists exception kktc meb exception enum.
     */
    KISI_ALREADYEXISTS_EXCEPTION("1001", "kisiAlreadyExists.text"),
    /**
     * Ogrenim bilgileri bulunamadi exception kktc meb exception enum.
     */
    OGRENIM_BILGILERI_BULUNAMADI_EXCEPTION("1002", "ogrenimBilgileriBulunamadi.text"),
    /**
     * Askerlik bilgileri bulunamadi exception kktc meb exception enum.
     */
    ASKERLIK_BILGILERI_BULUNAMADI_EXCEPTION("1003", "askerlikBilgileriBulunamadi.text"),
    /**
     * Personel etkinlik not found exception kktc meb exception enum.
     */
    PERSONEL_ETKINLIK_NOT_FOUND_EXCEPTION("1005", "personelEtkinlikKaydiBulunumadi.text"),
    /**
     * Personel gorev not found exception kktc meb exception enum.
     */
    PERSONEL_GOREV_NOT_FOUND_EXCEPTION("1006", "personelGorevKaydiBulunumadi.text"),
    /**
     * Ders kaydedilemedi exception kktc meb exception enum.
     */
    DERS_KAYDEDILEMEDI_EXCEPTION("2000", "dersKayitEdilemedi.text"),
    /**
     * Ders alreadyexists exception kktc meb exception enum.
     */
    DERS_ALREADYEXISTS_EXCEPTION("2001", "dersAlreadyExists.text"),
    /**
     * Ders notfound exception kktc meb exception enum.
     */
    DERS_NOTFOUND_EXCEPTION("2002", "dersNotFound.text"),
    /**
     * Alan adi alreadyexists exception kktc meb exception enum.
     */
    ALAN_ADI_ALREADYEXISTS_EXCEPTION("2500", "alanAdiAlreadyExists.text"),
    /**
     * Silme tarihi sonlandi alreadyexists kktc meb exception enum.
     */
    SILME_TARIHI_SONLANDI_ALREADYEXISTS("2501", "silmeTarihiSonlandiExists.text"),
    /**
     * Donem not tip alreadyexists kktc meb exception enum.
     */
    DONEM_NOT_TIP_ALREADYEXISTS("2100", "donemTipAlreadyExists.text"),
    /**
     * Donem kayit bulunamadi kktc meb exception enum.
     */
    DONEM_KAYIT_BULUNAMADI("2101", "donemKayitBulunamadi.text"),
    /**
     * Ders kayit bulunamadi kktc meb exception enum.
     */
    DERS_KAYIT_BULUNAMADI("2003", "dersKayitBulunamadi.text"),
    /**
     * Donem kaydedilemedi exception kktc meb exception enum.
     */
    DONEM_KAYDEDILEMEDI_EXCEPTION("2004", "donemKayitEdilemedi.text"),
    /**
     * Donem already exists kktc meb exception enum.
     */
    DONEM_ALREADY_EXISTS("2005", "donemAlreadyExists.text"),
    /**
     * Donem not found kktc meb exception enum.
     */
    DONEM_NOT_FOUND("2006", "donemNotFound.text"),
    /**
     * Okul kaydedilemedi exception kktc meb exception enum.
     */
    OKUL_KAYDEDILEMEDI_EXCEPTION("2200", "okulKaydedilemedi.text"),
    /**
     * Okul already exists kktc meb exception enum.
     */
    OKUL_ALREADY_EXISTS("2201", "okulAlreadyExists.text"),
    /**
     * Okul not found kktc meb exception enum.
     */
    OKUL_NOT_FOUND("2202", "okulNotFound.text"),
    /**
     * Okul kayit bulunamadi kktc meb exception enum.
     */
    OKUL_KAYIT_BULUNAMADI("2203", "okulKayitBulunamadi.text"),
    /**
     * Okul kapsam bolgesi disi kktc meb exception enum.
     */
    OKUL_KAPSAM_BOLGESI_DISI("2204", "okulKapsamBolgesiDisinda.text"),
    /**
     * Okul tur kaydedilemedi kktc meb exception enum.
     */
    OKUL_TUR_KAYDEDILEMEDI("2300", "okulTurKaydedilemedi.text"),
    /**
     * Okul tur already exists kktc meb exception enum.
     */
    OKUL_TUR_ALREADY_EXISTS("2301", "okulTurAlreadyExists.text"),
    /**
     * Okul tur not found kktc meb exception enum.
     */
    OKUL_TUR_NOT_FOUND("2302", "okulTurNotFound.text"),
    /**
     * Okul tur kayit bulunamadi kktc meb exception enum.
     */
    OKUL_TUR_KAYIT_BULUNAMADI("2303", "okulTurKayitBulunamadi.text"),
    /**
     * Sinifduzey kaydedilemedi kktc meb exception enum.
     */
    SINIFDUZEY_KAYDEDILEMEDI("2400", "sinifDuzeyKaydedilemedi.text"),
    /**
     * Sinifduzey not found kktc meb exception enum.
     */
    SINIFDUZEY_NOT_FOUND("2401", "sinifDuzeyNotFound.text"),
    /**
     * Sinifduzey already exists kktc meb exception enum.
     */
    SINIFDUZEY_ALREADY_EXISTS("2402", "sinifDuzeyAlreadyExists.text"),
    /**
     * Sinifduzey kayit bulunamadi kktc meb exception enum.
     */
    SINIFDUZEY_KAYIT_BULUNAMADI("2403", "sinifDuzeyKayitBulunamadi.text"),
    /**
     * Sinifduzey ayni sinif duzeyi degil exception kktc meb exception enum.
     */
    SINIFDUZEY_AYNI_SINIF_DUZEYI_DEGIL_EXCEPTION("2404", "sinifDuzeyiAyniDegil.text"),
    /**
     * Sinifduzey onceki sinifduzey uyumsuz kktc meb exception enum.
     */
    SINIFDUZEY_ONCEKI_SINIFDUZEY_UYUMSUZ("2405", "sinifDuzeyUyumsuz.text"),
    /**
     * Sinif gecme active exception kktc meb exception enum.
     */
    SINIF_GECME_DURUM_EXCEPTION("2406", "sinifGecmeActiveException.text"),
    /**
     * Cerceveprogram kaydedilemedi kktc meb exception enum.
     */
    CERCEVEPROGRAM_KAYDEDILEMEDI("2500", "cerceveProgramKaydedilemedi.text"),
    /**
     * Cerceveprogram not found kktc meb exception enum.
     */
    CERCEVEPROGRAM_NOT_FOUND("2501", "cerceveProgramNotFound.text"),
    /**
     * Cerceveprogram already exists kktc meb exception enum.
     */
    CERCEVEPROGRAM_ALREADY_EXISTS("2502", "cerceveProgramAlreadyExists.text"),
    /**
     * Cerceveprogram kayit bulunamadi kktc meb exception enum.
     */
    CERCEVEPROGRAM_KAYIT_BULUNAMADI("2503", "cerceveProgramKayitBulunamadi.text"),
    /**
     * Dal bilgi already exists kktc meb exception enum.
     */
    DAL_BILGI_ALREADY_EXISTS("2600", "dalBilgiAlreadyExists.text"),
    /**
     * Dal bilgi kaydedilemedi kktc meb exception enum.
     */
    DAL_BILGI_KAYDEDILEMEDI("2601", "dalBilgiKaydedilemedi.text"),
    /**
     * Dal bilgi notfound kktc meb exception enum.
     */
    DAL_BILGI_NOTFOUND("2602", "dalBilgiNotFound.text"),
    /**
     * Sinif ogretmeni zaten atanmis kktc meb exception enum.
     */
    SINIF_OGRETMENI_ZATEN_ATANMIS("2700", "sinifOgretmeniAtanmis.text"),
    /**
     * Ogrenci notfound kktc meb exception enum.
     */
    OGRENCI_NOTFOUND("3000", "ogrenciNotFound.text"),
    /**
     * Ogrenci okul notfound kktc meb exception enum.
     */
    OGRENCI_OKUL_NOTFOUND("3001", "ogrenciOkulNotFound.text"),
    /**
     * Ogrenci already exists kktc meb exception enum.
     */
    OGRENCI_ALREADY_EXISTS("3002", "ogrenciAlreadyExists.text"),
    /**
     * Ogrenci kayit bilgi kaydedilemedi kktc meb exception enum.
     */
    OGRENCI_KAYIT_BILGI_KAYDEDILEMEDI("3003", "ogrenciKayitBilgiException.text"),
    /**
     * Ogrenci buokulda zatenvar exception kktc meb exception enum.
     */
    OGRENCI_BUOKULDA_ZATENVAR_EXCEPTION("3004", "ogrenciBuOkuldaZatenVar.text"),
    /**
     * Ogrenci stajkurum kayit exception kktc meb exception enum.
     */
    OGRENCI_STAJKURUM_KAYIT_EXCEPTION("3100", "ogrenciKurumaAtanamadi.text"),
    /**
     * Ogrenci stajkurum kontenjan exception kktc meb exception enum.
     */
    OGRENCI_STAJKURUM_KONTENJAN_EXCEPTION("3101", "stajKurumKontenjanDolu.text"),
    /**
     * Ogrenci aynikimliknoile personelmevcut exception kktc meb exception enum.
     */
    OGRENCI_AYNIKIMLIKNOILE_PERSONELMEVCUT_EXCEPTION("3200", "ogrenciPersonelMevcut.text"),
    /**
     * Not harf kaydedilemedi kktc meb exception enum.
     */
    NOT_HARF_KAYDEDILEMEDI("3500", "notharfKaydedilemedi.text"),
    /**
     * Not harf bulunamadi kktc meb exception enum.
     */
    NOT_HARF_BULUNAMADI("3501", "notHarfBulunamadi.text"),
    /**
     * Not harf findbyid exception kktc meb exception enum.
     */
    NOT_HARF_FINDBYID_EXCEPTION("3501", "notHarfBulunamadi.text"),
    /**
     * Ders bilgi karne sirasi exception kktc meb exception enum.
     */
    DERS_BILGI_KARNE_SIRASI_EXCEPTION("4000", "karneSirasiZatenKullanimda.text"),
    /**
     * Sinifsube ogrenci atanmis kktc meb exception enum.
     */
    SINIFSUBE_OGRENCI_ATANMIS("4500", "sinifSubeOgrenciAtanmis.text"),
    /**
     * Find all exception kktc meb exception enum.
     */
    FIND_ALL_EXCEPTION("5000", "findAllException.text"),
    /**
     * Find all byaktif exception kktc meb exception enum.
     */
    FIND_ALL_BYAKTIF_EXCEPTION("5001", "findAllByAktifException.text"),
    /**
     * Delete exception kktc meb exception enum.
     */
    DELETE_EXCEPTION("5002", "deletionException.text"),
    /**
     * Update exception kktc meb exception enum.
     */
    UPDATE_EXCEPTION("5003", "updateException.text"),
    /**
     * Duplicate data exception kktc meb exception enum.
     */
    DUPLICATE_DATA_EXCEPTION("5004", "duplicateDataException.text"),
    /**
     * Has relation exception kktc meb exception enum.
     */
    HAS_RELATION_EXCEPTION("5005", "hasRelationException.text"),
    /**
     * Find all by active exception kktc meb exception enum.
     */
    FIND_ALL_BY_DURUM_EXCEPTION("5006", "findAllByActiveException.text"),
    /**
     * Icerik kayit bulunamadi kktc meb exception enum.
     */
    ICERIK_KAYIT_BULUNAMADI("6005", "icerikKayitBulunamadi.text"),
    /**
     * Icerik not found exception kktc meb exception enum.
     */
    ICERIK_NOT_FOUND_EXCEPTION("6006", "icerikBulunamadi.text"),
    /**
     * Icerik save or update exception kktc meb exception enum.
     */
    ICERIK_SAVE_OR_UPDATE_EXCEPTION("6007", "icerikKayitIslemiGerceklesmedi.text"),
    /**
     * Icerik delete exception kktc meb exception enum.
     */
    ICERIK_DELETE_EXCEPTION("6008", "icerikSilmeIslemiGerceklesmedi.text"),
    /**
     * File kayit bulunamadi exception kktc meb exception enum.
     */
    FILE_KAYIT_BULUNAMADI_EXCEPTION("6009", "fileKayitBulunamadi.text"),
    /**
     * File eksik parametre exception kktc meb exception enum.
     */
    FILE_EKSIK_PARAMETRE_EXCEPTION("6009", "fileEksikParametre.text"),
    /**
     * Derslik kullanimda exception kktc meb exception enum.
     */
    DERSLIK_KULLANIMDA_EXCEPTION("7001", "derslikKullaniliyor.text"),
    /**
     * Derslik kapasite dolu exception kktc meb exception enum.
     */
    DERSLIK_KAPASITE_DOLU_EXCEPTION("7002", "derslikKapasiteDolu.text"),
    /**
     * Gozlem formu kaydedilemedi kktc meb exception enum.
     */
    GOZLEM_FORMU_KAYDEDILEMEDI("0100", "gozlemFormuKaydedilemedi.text"),
    /**
     * Count exception kktc meb exception enum.
     */
    COUNT_EXCEPTION("0101", "countSqlException.text"),
    /**
     * Save exception kktc meb exception enum.
     */
    SAVE_EXCEPTION("0102", "saveException.text"),
    /**
     * Already exists exception kktc meb exception enum.
     */
    ALREADY_EXISTS_EXCEPTION("0103", "alreadyExistsException.error.message"),
    /**
     * Not found exception kktc meb exception enum.
     */
    NOT_FOUND_EXCEPTION("0919", "notFoundException.text"),
    /**
     * User not found kktc meb exception enum.
     */
    USER_NOT_FOUND("0091", "userNotFoundException.text"),
    /**
     * Rol ver exception kktc meb exception enum.
     */
    ROL_VER_EXCEPTION("0092", "rolVerException.text"),
    /**
     * Gozlem formu not found exception kktc meb exception enum.
     */
    GOZLEM_FORMU_NOT_FOUND_EXCEPTION("0092", "gozlemFormuNotFoundException.text"),
    /**
     * Personel calisma gorev already exist exception kktc meb exception enum.
     */
    PERSONEL_CALISMA_GOREV_ALREADY_EXIST_EXCEPTION("9000", "personelGorevCalismaAlreadyExistsException.text"),
    /**
     * Kayit bulunamadi exception kktc meb exception enum.
     */
    KAYIT_BULUNAMADI_EXCEPTION("9101", "kayitBulunamadiException.text"),
    /**
     * Konu unite adi duplicate exception kktc meb exception enum.
     */
    KONU_UNITE_ADI_DUPLICATE_EXCEPTION("9102", "konuUniteAdiDublicateException.text"),
    /**
     * Sinav merkezi save or update exception kktc meb exception enum.
     */
    SINAV_MERKEZI_SAVE_OR_UPDATE_EXCEPTION("9103", "sinavMerkeziKayitGerceklesmedi.text"),
    /**
     * Personel not found kktc meb exception enum.
     */
    PERSONEL_NOT_FOUND("9104", "personelBulunamadi.text"),
    /**
     * Munhal not found kktc meb exception enum.
     */
    MUNHAL_NOT_FOUND("9108", "munhalBulunamadi.text"),
    /**
     * Personel brans duplicate data exception kktc meb exception enum.
     */
    PERSONEL_BRANS_DUPLICATE_DATA_EXCEPTION("9105", "personelBransKaydiMevcut.text"),
    /**
     * Aktif personel gorev mevcut kktc meb exception enum.
     */
    AKTIF_PERSONEL_GOREV_MEVCUT("9106", "aktifPersonelGoreviMevcuttur.text"),
    /**
     * Delete personel gorev personel calisma kaydi mevcut exception kktc meb exception enum.
     */
    DELETE_PERSONEL_GOREV_PERSONEL_CALISMA_KAYDI_MEVCUT_EXCEPTION("9107", "aktifCalismaBilgisiMevcuttur.text"),
    /**
     * Personel kriter puani munhal dublicate exception kktc meb exception enum.
     */
    PERSONEL_KRITER_PUANI_MUNHAL_DUBLICATE_EXCEPTION("9109", "secilenMunhalKaydinaDahaOnceKriterPuaniGirilmistir.text"),
    /**
     * Icra dairesi not found kktc meb exception enum.
     */
    ICRA_DAIRESI_NOT_FOUND("9104", "icraDairesiBulunamadi.text"),
    /**
     * Nakil duyuru not found kktc meb exception enum.
     */
    NAKIL_DUYURU_NOT_FOUND("9110", "nakilDuyurusuBulunamadi.text"),
    /**
     * Okul muduru not found kktc meb exception enum.
     */
    OKUL_MUDURU_NOT_FOUND("2800", "okulMuduruBulunamadi.text"),
    /**
     * Bekleme listesi sonuc kontrol exception kktc meb exception enum.
     */
    BEKLEME_LISTESI_SONUC_KONTROL_EXCEPTION("9111", "beklemeListesiIptalEdilmisVeyaSonuclandirilmisOlabilir.text"),
    /**
     * Yer degistirme tercih not found kktc meb exception enum.
     */
    YER_DEGISTIRME_TERCIH_NOT_FOUND("9112", "yerDegistirmeKaydiIcinTercihBulunmamaktadir.text"),
    /**
     * Tedbir egitsel degerlendirme raporu kullanimda kktc meb exception enum.
     */
    TEDBIR_EGITSEL_DEGERLENDIRME_RAPORU_KULLANIMDA("9113", "tedbirEgitselDegerlendirmeRaporlarindaKullanimdadir.text"),
    /**
     * Sinav merkezi dublicate kktc meb exception enum.
     */
    SINAV_MERKEZI_DUBLICATE("9114", "sinavMerkeziAyniIsimdeKaydiVardir.text"),
    /**
     * Sinav turu dublicate kktc meb exception enum.
     */
    SINAV_TURU_DUBLICATE("9115", "sinavTuruAyniIsimdeKaydiVardir.text"),
    /**
     * Sinav bolum dublicate kktc meb exception enum.
     */
    SINAV_BOLUM_DUBLICATE("9116", "sinavTuruIcinDahaOnceTanimlamaYapilmistir.text"),
    /**
     * Sinav donemi dublicate kktc meb exception enum.
     */
    SINAV_DONEMI_DUBLICATE("9117", "sinavDonemiAdiDahaOnceTanimlanmistir.text"),
    /**
     * Sinav not dublicate kktc meb exception enum.
     */
    SINAV_NOT_DUBLICATE("9118", "sinavTuruIcinDahaOnceTanimlamaYapilmistir.text"),
    /**
     * Sinav komisyon dublicate kktc meb exception enum.
     */
    SINAV_KOMISYON_DUBLICATE("9119", "sinavKomisyonuAyniIsimdeKaydiVardir.text"),
    /**
     * Sinav basvuru merkezi dublicate kktc meb exception enum.
     */
    SINAV_BASVURU_MERKEZI_DUBLICATE("9120", "sinavBasvuruMerkeziAyniIsimdeKaydiVardir.text"),
    /**
     * Sinav komisyon personel dublicate kktc meb exception enum.
     */
    SINAV_KOMISYON_PERSONEL_DUBLICATE("9121", "personelDahaOnceKomisyonaEklenmistir.text"),
    /**
     * Sinav komisyon baskan dublicate kktc meb exception enum.
     */
    SINAV_KOMISYON_BASKAN_DUBLICATE("9122", "komisyonBaskaniSadeceBirPersonelAtanabilir.text"),
    /**
     * Sinav basvuru merkezi personel dublicate kktc meb exception enum.
     */
    SINAV_BASVURU_MERKEZI_PERSONEL_DUBLICATE("9123", "personelDahaOnceBasvuruMerkezineEklenmistir.text"),
    /**
     * Sinav basvuru merkezi baskan dublicate kktc meb exception enum.
     */
    SINAV_BASVURU_MERKEZI_BASKAN_DUBLICATE("9124", "basvuruMerkeziYoneticisiSadeceBirPersonelAtanabilir.text"),
    /**
     * Sinav sinav yeterlilik dublicate kktc meb exception enum.
     */
    SINAV_SINAV_YETERLILIK_DUBLICATE("9125", "sinavYeterlilikKriteriDahaOnceSinavaEklenmistir.text"),
    /**
     * Sinav sinav merkezi dublicate kktc meb exception enum.
     */
    SINAV_SINAV_MERKEZI_DUBLICATE("9126", "sinavMerkeziDahaOnceSinavaTanimlanmistir.text"),
    /**
     * Sinav sinav basvuru merkezi dublicate kktc meb exception enum.
     */
    SINAV_SINAV_BASVURU_MERKEZI_DUBLICATE("9127", "sinavBasvuruMerkeziDahaOnceSinavaTanimlanmistir.text"),
    /**
     * Sinav sinav komisyon dublicate kktc meb exception enum.
     */
    SINAV_SINAV_KOMISYON_DUBLICATE("9128", "sinavKomisyonuDahaOnceSinavaEklenmistir.text"),
    /**
     * Sinav adi dublicate kktc meb exception enum.
     */
    SINAV_ADI_DUBLICATE("9129", "sinavinAyniIsimdeKaydiVardir.text"),
    /**
     * Sinav oturum sinav bolum dublicate kktc meb exception enum.
     */
    SINAV_OTURUM_SINAV_BOLUM_DUBLICATE("9130", "sinavOturumunaDahaOnceSinavBolumuTanimlanmistir.text"),
    /**
     * Sinav merkezi personel dublicate kktc meb exception enum.
     */
    SINAV_MERKEZI_PERSONEL_DUBLICATE("9131", "personelDahaOnceAyniSinavMerkezindeGorevlendirilmistir.text"),
    /**
     * Sinav basvuru formu form adi dublicate kktc meb exception enum.
     */
    SINAV_BASVURU_FORMU_FORM_ADI_DUBLICATE("9133", "sinavBasvuruFormuAdiDahaOnceKayitEdilmistir.text"),
    /**
     * Erisim reddedildi kktc meb exception enum.
     */
    ERISIM_REDDEDILDI("9132", "accessDeniedExceptionMessage.text"),
    /**
     * Sinav merkezi salon personel limit kktc meb exception enum.
     */
    SINAV_MERKEZI_SALON_PERSONEL_LIMIT("9134", "salonPersonelSayisiLimitiDoludur.text"),
    /**
     * Sinav merkezi salon limit kktc meb exception enum.
     */
    SINAV_MERKEZI_SALON_LIMIT("9135", "limitSayisindanFazlaPersonelTanimlidir.text"),
    /**
     * Sinav basvuru formu okul program dublicate kktc meb exception enum.
     */
    SINAV_BASVURU_FORMU_OKUL_PROGRAM_DUBLICATE("9136", "okulTercihiDahaOnceEklenmistir.text"),
    /**
     * Sinav turu has relation kktc meb exception enum.
     */
    SINAV_TURU_HAS_RELATION("9137", "sinavTuruKullanilmaktadir.text"),
    /**
     * Sinav not has relation kktc meb exception enum.
     */
    SINAV_NOT_HAS_RELATION("9138", "sinavNotuKullanilmaktadir.text"),
    /**
     * Sinav donemi has relation kktc meb exception enum.
     */
    SINAV_DONEMI_HAS_RELATION("9139", "sinavDonemiKullanilmaktadir.text"),
    /**
     * Sinav bolum has relation kktc meb exception enum.
     */
    SINAV_BOLUM_HAS_RELATION("9140", "sinavBolumuKullanilmaktadir.text"),
    /**
     * Sinav yeterlilik has relation kktc meb exception enum.
     */
    SINAV_YETERLILIK_HAS_RELATION("9141", "sinavYeterlilikKriteriKullanilmaktadir.text"),
    /**
     * Sinav soru cevap dublicate kktc meb exception enum.
     */
    SINAV_SORU_CEVAP_DUBLICATE("9142", "dogruSadeceBirAdetOlabilir.text"),
    /**
     * Sinav soru bankasi soru dublicate kktc meb exception enum.
     */
    SINAV_SORU_BANKASI_SORU_DUBLICATE("9143", "soruDahaOnceSoruBankasinaEklenmistir.text"),
    /**
     * Sinav soru bankasi soru limit exception kktc meb exception enum.
     */
    SINAV_SORU_BANKASI_SORU_LIMIT_EXCEPTION("9144", "soruBankasinaTanimlananSayiLimitiDoldurulmustur.text"),
    /**
     * Sinav soru bankasi limit kktc meb exception enum.
     */
    SINAV_SORU_BANKASI_LIMIT("9145", "soruBankasinaTanimliSoruSayisiTanimlananLimittenFazladir.text"),
    /**
     * Sinav sinav soru dublicate kktc meb exception enum.
     */
    SINAV_SINAV_SORU_DUBLICATE("9146", "soruDahaOnceSinavaEklenmistir.text"),
    /**
     * Sinav sinav soru bankasi dublicate kktc meb exception enum.
     */
    SINAV_SINAV_SORU_BANKASI_DUBLICATE("9147", "soruBankasiDahaOnceSinavaEklenmistir.text"),
    /**
     * Sinav sinav soru soru bankasi dublicate kktc meb exception enum.
     */
    SINAV_SINAV_SORU_SORU_BANKASI_DUBLICATE("9148", "soruDahaOnceEklenenSoruBankasindaMevcuttur.text"),
    /**
     * Not giris tarihi basladi uyari kktc meb exception enum.
     */
    NOT_GIRIS_TARIHI_BASLADI_UYARI("2550", "notGiristarihiUyari.text"),
    /**
     * Sinav salon baskani dublicate kktc meb exception enum.
     */
    SINAV_SALON_BASKANI_DUBLICATE("9149", "sinavSalonBaskaniDuplicate.text"),
    /**
     * Sinav bankasi sorusu sinav sorusu duplicate kktc meb exception enum.
     */
    SINAV_BANKASI_SORUSU_SINAV_SORUSU_DUPLICATE("9150", "sinavSorusuBankadadaVardir.text"),
    /**
     * Denetmenin doneme denetleme duplicate kktc meb exception enum.
     */
    DENETMENIN_DONEME_DENETLEME_DUPLICATE("4502", "ilgiliDonemeAitPlanVar.validation.message"),
    /**
     * Sinav merkezi sira duplicate kktc meb exception enum.
     */
    SINAV_MERKEZI_SIRA_DUPLICATE("9151", "sinavMerkeziSiraDuplicate.text"),
    /**
     * Sinav merkezi kapasite asma kktc meb exception enum.
     */
    SINAV_MERKEZI_KAPASITE_ASMA("9152", "sinavMerkeziAdaySayisiAsmis.validation.message"),
    /**
     * Sinav salonu kapasite asma kktc meb exception enum.
     */
    SINAV_SALONU_KAPASITE_ASMA("9153", "sinavSalonuAdaySayisiAsmis.validation.message"),
    /**
     * Sonraki donem bulunamadi kktc meb exception enum.
     */
    SONRAKI_DONEM_BULUNAMADI("9154", "sonrakiDonemBulunamadi.message"),
    /**
     * Aktif ogrenci kaydi bulunmaktadir kktc meb exception enum.
     */
    AKTIF_OGRENCI_KAYDI_BULUNMAKTADIR("9155", "aktifOgrenciKaydiBulunmaktadir.message"),
    /**
     * Soru sinavda kullanilmis degistirilemez kktc meb exception enum.
     */
    SORU_SINAVDA_KULLANILMIS_DEGISTIRILEMEZ("9156", "sorusinavdakullanilmisdegistirilemez.message"),
    /**
     * Ogrenci kayit hata orgun egitim disina cikarma cezasini gerektiren davranislar kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_ORGUN_EGITIM_DISINA_CIKARMA_CEZASINI_GEREKTIREN_DAVRANISLAR("9157", "ogrenciKayitHataOrgunEgitimDisinaCikarmaCezasiniGerektirenDavranislar.message"),
    /**
     * Ogrenci kayit hata disiplin sucu nedeni kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_DISIPLIN_SUCU_NEDENI("9158", "ogrenciKayitHataDisiplinSucuNedeni.message"),
    /**
     * Ogrenci kayit hata tasdikname aldigi okula kayit kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_TASDIKNAME_ALDIGI_OKULA_KAYIT("9159", "ogrenciKayitHataAyniDonemIcerisindeTasdiknameAldigiOkulaKayit.message"),
    /**
     * Ogrenci kayit hata ayni donem icerisinde tasdikname aldigi okula kayit kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_AYNI_DONEM_ICERISINDE_TASDIKNAME_ALDIGI_OKULA_KAYIT("9160", "ogrenciKayitHataAyniDonemIcerisindeTasdiknameAldigiOkulaKayit.message"),
    /**
     * Ogrenci kayit hata distan bitirme okullari haricinde okula kayit kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_DISTAN_BITIRME_OKULLARI_HARICINDE_OKULA_KAYIT("9161", "ogrenciKayitHataDistanBitirmeOkullariHaricindeOkulaKayit.message"),
    /**
     * Ogrenci kayit hata nakil olan ogrenci ayni okula kayit kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_NAKIL_OLAN_OGRENCI_AYNI_OKULA_KAYIT("9162", "ogrenciKayitHataNakilOlanOgrenciAyniOkulaKayit.message"),
    /**
     * Ogrenci kayit hata kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA("9163", "ogrenciKayitHata.message"),
    /**
     * Ogrenci kayit hata ayni donem icerisinde farkli bir okuldan tasdikname almistir lutfen baska bir doneme deneyiniz kktc meb exception enum.
     */
    OGRENCI_KAYIT_HATA_AYNI_DONEM_ICERISINDE_FARKLI_BIR_OKULDAN_TASDIKNAME_ALMISTIR_LUTFEN_BASKA_BIR_DONEME_DENEYINIZ("9164", "ogrenciKayitHataAyniDonemIcerisindeFarkliBirOkuldanTasdiknameAlmistirLutfenBaskaBirDonemeDeneyiniz.message"),
    /**
     * Meddyk denetmenin okul eslestirmesi bulunmakta kktc meb exception enum.
     */
    MEDDYK_DENETMENIN_OKUL_ESLESTIRMESI_BULUNMAKTA("9165", "okulEslestirmesiVar.error.message"),
    /**
     * Meddyk denetmenin tamamlanmamis okuldenetimi bulunmakta kktc meb exception enum.
     */
    MEDDYK_DENETMENIN_TAMAMLANMAMIS_OKULDENETIMI_BULUNMAKTA("9166", "tamamlanmamisPersonelDenetimiVar.error.message"),
    /**
     * Meddyk denetmenin tamamlanmamis personeldenetimi bulunmakta kktc meb exception enum.
     */
    MEDDYK_DENETMENIN_TAMAMLANMAMIS_PERSONELDENETIMI_BULUNMAKTA("9167", "tmamlanmamisOkulDenetimiVar.error.message"),

    /**
     * Hatali girilen veri kktc meb exception enum.
     */
    HATALI_GIRILEN_VERI("9168", "girilenVeriHatali.error.message"),

    /**
     * Hata bildirimi kaydedilemedi kktc meb exception enum.
     */
    HATA_BILDIRIMI_KAYDEDILEMEDI("10000", "hataBildirimiKaydedilemedi.error.message"),
    /**
     * Diploma olusturulmamis kktc meb exception enum.
     */
    DIPLOMA_OLUSTURULMAMIS("9168", "diplomaOlusturulmamis.error.message"),
    /**
     * Donem listesi bulunamadi kktc meb exception enum.
     */
    DONEM_LISTESI_BULUNAMADI("20000", "donemListesiBulunamadiInfo.validation.growl.message"),

    /**
     * Ogrenci sinif sube bulunamadi kktc meb exception enum.
     */
    OGRENCI_SINIF_SUBE_BULUNAMADI("9169", "ogrenciSinifSubeBulunamadi.error.message"),
    /**
     * Sinif duzeyi bulunamadi kktc meb exception enum.
     */
    SINIF_DUZEYI_BULUNAMADI("9170", "sinifDuzeyiBulunamadi.error.message"),
    /**
     * Okul adresinde ilce tanimi bulunamadi kktc meb exception enum.
     */
    OKUL_ADRESINDE_ILCE_TANIMI_BULUNAMADI("9170", "okulAdresindeIlceTanimiBulunamadi.error.message"),
    /**
     * Kisi iletisim kaydi yapilamadi kktc meb exception enum.
     */
    KISI_ILETISIM_KAYDI_YAPILAMADI("9171", "kisiIletisimKaydiYapilamadi.error.message"),
    /**
     * Kullanici kaydi yapilamadi kktc meb exception enum.
     */
    KULLANICI_KAYDI_YAPILAMADI("9172", "kullaniciKaydiYapilamadi.validation.message"),
    /**
     * Kisi kaydi yapilamadi kktc meb exception enum.
     */
    KISI_KAYDI_YAPILAMADI("9173", "kisiKaydiYapilamadi.error.message"),
    /**
     * Sadece gorsel icerik turu coklu yuklenebilir kktc meb exception enum.
     */
    SADECE_GORSEL_ICERIK_TURU_COKLU_YUKLENEBILIR("9174", "sadeceGorselIcerikTuruCokluYuklenebilir.validation.message"),
    /**
     * Konu unite seciniz kktc meb exception enum.
     */
    KONU_UNITE_SECINIZ("9175", "konuUniteSeciniz.validation.message"),
    /**
     * Belge yukleyiniz kktc meb exception enum.
     */
    BELGE_YUKLEYINIZ("9176", "belgeYukleyiniz.validation.message"),
    /**
     * Video formati sadece mp 4 olmalidir kktc meb exception enum.
     */
    VIDEO_FORMATI_SADECE_MP4_OLMALIDIR("9177", "videoSadaceMP4Yuklenebilir.validation.message"),
    /**
     * Eicerik sadece pdf word turlerinde olmalidir kktc meb exception enum.
     */
    EICERIK_SADECE_PDF_WORD_TURLERINDE_OLMALIDIR("9178", "eIcerikSadecePDFWordPowerPointYuklenebilir.validation.message"),
    /**
     * Eicerik sadece pdf ppt turunde olmalidir kktc meb exception enum.
     */
    EICERIK_SADECE_PDF_PPT_TURUNDE_OLMALIDIR("9178", "eIcerikSadecePDFPPTYuklenebilir.validation.message"),
    /**
     * Ekitap sadece pdf turunde olmalidir kktc meb exception enum.
     */
    EKITAP_SADECE_PDF_TURUNDE_OLMALIDIR("9179", "eKitapSadecePDFYuklebilir.validation.message"),
    /**
     * Gorsel sadece png jpeg turunde olmalidir kktc meb exception enum.
     */
    GORSEL_SADECE_PNG_JPEG_TURUNDE_OLMALIDIR("9180", "gorselSadecePNGGIFJPE.validation.message"),
    /**
     * Kaydetmek istenilen ogrenci baska bir okulda aktif ogrencidir kktc meb exception enum.
     */
    KAYDETMEK_ISTENILEN_OGRENCI_BASKA_BIR_OKULDA_AKTIF_OGRENCIDIR("9181", "kaydetmekIstenilenOgrenciBaskaBirOkuldaAktifOgrencidir.error.message"),

    /**
     * Gorev yapilan bir okul ve okul muduru gorevi bulunamadi kktc meb exception enum.
     */
    GOREV_YAPILAN_BIR_OKUL_VE_OKUL_MUDURU_GOREVI_BULUNAMADI("9000", "gorevYapilanBirOkulVeOkulMuduruGoreviBulunamadi.error.message"),
    /**
     * Gorev yapilan okul bulunamadi kktc meb exception enum.
     */
    GOREV_YAPILAN_OKUL_BULUNAMADI("9001", "gorevYapilanOkulBulunamadi.error.message"),
    /**
     * Personel bilgisi bulunamadi kktc meb exception enum.
     */
    PERSONEL_BILGISI_BULUNAMADI("9002", "personelGoreviBulunamadı.error.message"),

    /**
     * Cache tumokullar findall exception kktc meb exception enum.
     */
    CACHE_TUMOKULLAR_FINDALL_EXCEPTION("600","okullarRediseCachelenemedi.text"),
    /**
     * Cache tumilceler findall exception kktc meb exception enum.
     */
    CACHE_TUMILCELER_FINDALL_EXCEPTION("6001","ilcelerRediseCachelenemedi.text"),
    /**
     * Cache tumbelediyeler findall exception kktc meb exception enum.
     */
    CACHE_TUMBELEDIYELER_FINDALL_EXCEPTION("6002","belediyelerRediseCachelenemedi.text"),
    /**
     * Cache tummahalleler findall exception kktc meb exception enum.
     */
    CACHE_TUMMAHALLELER_FINDALL_EXCEPTION("6003","mahallelerRediseCachelenemedi.text"),
    /**
     * Cache tumsokaklar findall exception kktc meb exception enum.
     */
    CACHE_TUMSOKAKLAR_FINDALL_EXCEPTION("6004","sokaklarRediseCachelenemedi.text"),
    /**
     * Cache tumdersler findall exception kktc meb exception enum.
     */
    CACHE_TUMDERSLER_FINDALL_EXCEPTION("6005","derslerRediseCachelenemedi.text"),
    /**
     * Cache tumaktifdersler findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFDERSLER_FINDALL_EXCEPTION("6006","aktifDerslerRediseCachelenemedi.text"),
    /**
     * Cache tumalanbilgileri findall exception kktc meb exception enum.
     */
    CACHE_TUMALANBILGILERI_FINDALL_EXCEPTION("6007","alanBilgileriRediseCachelenemedi.text"),
    /**
     * Cache tumaktifalanbilgileri findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFALANBILGILERI_FINDALL_EXCEPTION("6008","aktifAlanBilgileriRediseCachelenemedi.text"),
    /**
     * Cache tumdalbilgileri findall exception kktc meb exception enum.
     */
    CACHE_TUMDALBILGILERI_FINDALL_EXCEPTION("6009","dalBilgileriRediseCachelenemedi.text"),
    /**
     * Cache tumaktifdalbilgileri findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFDALBILGILERI_FINDALL_EXCEPTION("6010","aktifDalBilgileriRediseCachelenemedi.text"),
    /**
     * Cache tumdersturleri findall exception kktc meb exception enum.
     */
    CACHE_TUMDERSTURLERI_FINDALL_EXCEPTION("6011","dersTurleriRediseCachelenemedi.text"),
    /**
     * Cache tumaktifdersturleri findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFDERSTURLERI_FINDALL_EXCEPTION("6012","aktifDersTurleriRediseCachelenemedi.text"),
    /**
     * Cache tumdersbilgileri findall exception kktc meb exception enum.
     */
    CACHE_TUMDERSBILGILERI_FINDALL_EXCEPTION("6013","derslerBilgileriRediseCachelenemedi.text"),
    /**
     * Cache tumaktifdersbilgileri findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFDERSBILGILERI_FINDALL_EXCEPTION("6014","aktifDerslerBilgileriRediseCachelenemedi.text"),
    /**
     * Cache tumsinifduzeyleri findall exception kktc meb exception enum.
     */
    CACHE_TUMSINIFDUZEYLERI_FINDALL_EXCEPTION("6015","sinifDuzeyleriRediseCachelenemedi.text"),
    /**
     * Cache tumaktifsinifduzeyler findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFSINIFDUZEYLER_FINDALL_EXCEPTION("6016","aktifSinifDuzeyleriRediseCachelenemedi.text"),
    /**
     * Cache tumsinifsubeler findall exception kktc meb exception enum.
     */
    CACHE_TUMSINIFSUBELER_FINDALL_EXCEPTION("6017","sinifSubelerRediseCachelenemedi.text"),
    /**
     * Cache tumaktifsinifsubeler findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFSINIFSUBELER_FINDALL_EXCEPTION("6018","aktifSinifSubelerRediseCachelenemedi.text"),
    /**
     * Cache tumdonemler findall exception kktc meb exception enum.
     */
    CACHE_TUMDONEMLER_FINDALL_EXCEPTION("6019","donemlerRediseCachelenemedi.text"),
    /**
     * Cache tumaktifdonemler findall exception kktc meb exception enum.
     */
    CACHE_TUMAKTIFDONEMLER_FINDALL_EXCEPTION("6020","aktifDonemlerRediseCachelenemedi.text"),
    /**
     * Cache simdikivesonrakionemler findall exception kktc meb exception enum.
     */
    CACHE_SIMDIKIVESONRAKIONEMLER_FINDALL_EXCEPTION("6021","simdikiVeSonrakiDonemlerRediseCachelenemedi.text"),
    /**
     * Cache simdikidonem find exception kktc meb exception enum.
     */
    CACHE_SIMDIKIDONEM_FIND_EXCEPTION("6022","simdikiDonemRediseCachelenemedi.text"),

    /**
     * Staj kurum topluatama exception kktc meb exception enum.
     */
    STAJ_KURUM_TOPLUATAMA_EXCEPTION("3102","stajKurumTopluAtamaGerceklestirilemedi.text"),
    /**
     * Eksik bilgiler tespit edildi exception kktc meb exception enum.
     */
    EKSIK_BILGILER_TESPIT_EDILDI_EXCEPTION("3103", "eksikBilgilerTespitEdildi.error.message"),
    /**
     * Onaylanacak basvuru bulunamadi kktc meb exception enum.
     */
    ONAYLANACAK_BASVURU_BULUNAMADI("3104", "onaylanacakBasvuruBulunamadı.error.message"),
    /**
     * Personellere ait ogrenim listesi bulunamadi exception kktc meb exception enum.
     */
    PERSONELLERE_AIT_OGRENIM_LISTESI_BULUNAMADI_EXCEPTION("3105", "personellereAitOgrenimListesiBulunamadi.error.message"),
    /**
     * Personellere ait brans listesi bulunamadi exception kktc meb exception enum.
     */
    PERSONELLERE_AIT_BRANS_LISTESI_BULUNAMADI_EXCEPTION("3106", "personellereAitBransListesiBulunamadi.error.message"),
    /**
     * Personellere ait gorev listesi bulunamadi exception kktc meb exception enum.
     */
    PERSONELLERE_AIT_GOREV_LISTESI_BULUNAMADI_EXCEPTION("3107", "personellereAitGorevListesiBulunamadi.error.message"),
    /**
     * Personellere ait iletisim listesi bulunamadi exception kktc meb exception enum.
     */
    PERSONELLERE_AIT_ILETISIM_LISTESI_BULUNAMADI_EXCEPTION("3108", "personellereAitIletisimListesiBulunamadi.error.message"),
    /**
     * Personele ait tanimli brans bulunamadi exception kktc meb exception enum.
     */
    PERSONELE_AIT_TANIMLI_BRANS_BULUNAMADI_EXCEPTION("3109", "personeleAitTanimliBransBulunamadi.error.message"),
    /**
     * Personel aday yada muvazzaf degil exception kktc meb exception enum.
     */
    PERSONEL_ADAY_YADA_MUVAZZAF_DEGIL_EXCEPTION("3110", "personelAdayYadaMuvazzafDegil.error.message"),
    /**
     * Personele ait calisma bilgisi bulunamadi exception kktc meb exception enum.
     */
    PERSONELE_AIT_CALISMA_BILGISI_BULUNAMADI_EXCEPTION("3111", "personeleAitCalismaBilgisiBulunamadi.error.message"),

    /**
     * Staj kurum toplumatama integeralan exception kktc meb exception enum.
     */
    STAJ_KURUM_TOPLUMATAMA_INTEGERALAN_EXCEPTION("3109","stajKurumTopluAtamaIntegerAlanException.text"),
    /**
     * Kisi iletisim bilgileri bulunamadi exception kktc meb exception enum.
     */
    KISI_ILETISIM_BILGILERI_BULUNAMADI_EXCEPTION("9182", "kisiIletisimBilgileriBulunamadi.error.message"),
    /**
     * Tasdiknamesi bulunmayan ogrenci distan bitirmeye basvuramaz kktc meb exception enum.
     */
    TASDIKNAMESI_BULUNMAYAN_OGRENCI_DISTAN_BITIRMEYE_BASVURAMAZ("9183","tasdiknamesiBulunmayanDistanBitirmeyeBasvuramaz.message"),
    /**
     * Arac daha önce baska güzergaha atanmistir exception kktc meb exception enum.
     */
    ARAC_BASKA_GUZERGAHA_ATANMIS_EXCEPTION("9184","aracBaskaGuzergahaAtanmistir.info.message"),
    /**
     * Okul parametresi ogrenci no sayac degeri bulunamadi kktc meb exception enum.
     */
    OKUL_PARAMETRESI_OGRENCI_NO_SAYAC_BULUNAMADI("9185","okulParametresiOgrenciNoSayacDegeri.error.message"),
    /**
     * Cerceve program ders listesi bulunmadi exception kktc meb exception enum.
     */
    CERCEVE_PROGRAM_DERS_LISTESI_BULUNAMADI_EXCEPTION("9186","dersDetayBilgisiBulunamadiInfo.validation.growl.message"),
    /**
     * Sinav merkezi salon sıra no null exception kktc meb exception enum.
     */
    SINAV_MERKEZI_SALON_SIRA_NO_NULL_EXCEPTION("9187","sinavMerkeziSalonSiraNoVerilmeli.message");


    /**
     * Code.
     */
    private String code;
    /**
     * Value.
     */
    private String value;

    /**
     * Yeni bir Kktc meb exception enum sınıfı örneği oluşturur.
     *
     * @param code  code
     * @param value value
     */
    ExceptionEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    /**
     * code alır.
     *
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * code set eder.
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * value alır.
     *
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * value set eder.
     *
     * @param value value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
