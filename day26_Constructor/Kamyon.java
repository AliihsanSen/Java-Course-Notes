package day26_Constructor;

public class Kamyon {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {

        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        /*
        Bizim temel amacimiz KamyonRunner'da argüment olarak
        girilen degerin Kamyon class'inda instance variable'a atanmasi
        ancak scope konusunda ogrendiğimiz gibi Kamyon constructor
        scope'unda marka oldugu icin instance marka'ya gitmiyor.

        Bu karısıklıgı gidermek icin instance variable'lari belirli
        hale getirmemiz lazim.
        Java bunun icin this keyword'u olusturmustur.

        Genel kullanim acisindan this keyword'u kodu herkesin anlamasini
        kolaylastirdigi icin tercih edilir.
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon() {

    }

    @Override
    public String toString() {
        return
                "\nmarka = " + marka +
                        "\nmodel = " + model +
                        "\nyil = " + yil +
                        "\nfiyat = " + fiyat;
    }
}
