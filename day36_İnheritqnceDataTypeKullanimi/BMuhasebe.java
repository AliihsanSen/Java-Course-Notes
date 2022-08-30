package day36_İnheritqnceDataTypeKullanimi;

public class BMuhasebe extends APersonel {

    protected int saatucreti = 10;
    protected int gunlukMesai = 8;


    protected void maas() {

        System.out.println("Personel minumum : " + (30 * gunlukMesai * saatucreti) + " maas alir");
    }

    protected void ozelSigorta() {

        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir.");
    }

}
