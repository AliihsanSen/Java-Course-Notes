package day25_Constructor;

public class C01 {

    /*
    Java OOP konsept kullandigi icin olusturulan herbir class'in ihtiyac oldugunda
    obje uretebilmesine uygun dizayn etmiştir.
    Ama her class'dan obje uretilmeyebilir.

    bunun icin Java ihtiyac halinde kullanilmasi icin her class'ta default bir
    constructor koymustur.

    bu default constructor;
    class'dan obje olsuturuldugunda otamatik olarak calisir.

    ornegin bu class'ta constructor gorunmemesine ragmen
    C02 class'inde icinde oldugumuz C01 class'indan bir obje uretebildik.

    1- Obje olusturmak icin constructor kullanmak zorundayiz
    2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
    3- Her class'da gormesek bile Java'nin koydugu default constructor vardir
     */

    /*
     obje olusturmak icin construcxtor a ihitiyacımız var
     parametre yazmazsak java spesifik uretir gonderir kafasına gore
     gorunmese bile class da obje olusturuldugunda java yedek constructor  koymustur
     */

    int sayi;

    public void deneme() {
        System.out.println("C01'den deneme methodu calisir.");
    }
}
