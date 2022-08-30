package day36_İnheritqnceDataTypeKullanimi;

public class CMemur extends BMuhasebe {
    protected int saatucreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatucreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();

        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatucreti); // 12
        mmr1.maas(); // Memurlar : 3240 maas alir
        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir.
        mmr1.sigorta(); // Personel
        System.out.println(mmr1.isim); // Personel
        System.out.println(mmr1.soyisim); // Personel
        System.out.println(mmr1.departman); // Personel

        BMuhasebe mhsb1 = new BMuhasebe();
        /*
        Her ne kadar memur class'in icinde olsam da olusturdugum obje Muhasebe class'indan
        Cunku data turu ve constructor BMuhasebe.

        String str = "Murat";
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer sayi = 20;
        BMuhasebe class'i da obje olusturabilen bir class'dır yani data turudur.
         */

        System.out.println(mhsb1.gunlukMesai); // 8 --> Muhasebe class
        System.out.println(mhsb1.saatucreti); // 10 --> Muhasebe class
        mhsb1.maas(); // Personel minumum : 2400 maas alir --> Muhasebe class
        mhsb1.ozelSigorta(); // Isteyen calisanlara %50 indirimli ozel sigorta yapilir. --> Muhasebe class
        mhsb1.sigorta(); // Personel
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departman); // Personel



    }

}
