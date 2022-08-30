package day43_Interfaces_Iterators;

public class C02_Child implements I01_InterfacesBodyOlanMethod {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent Interface'de abstract olan 3 method'u implement ettigimizde
    Java itirazini durdurur.

    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz method'lari
    implement etmememiz sorun olusturmadi.


    Buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi icindir.

    O zaman nicin 2 keywordd (static ve default) tanimlanmistir?

    Bu iki farkli kelimenin amaci child class'lardan bu method'a nasil erisebilecegini
    belirlemek icindir.
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */

    public static void main(String[] args) {
        I01_InterfacesBodyOlanMethod.direksiyon();

        C02_Child obj = new C02_Child();
        obj.teker();
    }
}
