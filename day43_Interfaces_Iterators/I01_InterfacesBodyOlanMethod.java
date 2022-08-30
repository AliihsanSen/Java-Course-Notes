package day43_Interfaces_Iterators;

public interface I01_InterfacesBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    Normal bir class'da oldugumuzu dusunsek iki tane
    access modifier kullanma ihtimali OLAMAZ

    asagidaki method'da goreceginiz gibi interface'de istisnai olarak body'si olan
    method'lar olusturulabilir.

    Bu ozellik java8'den sonra kullanilmaya baslamistir.
    bu ozellikten once, bir ınterface'e yyeni bir method eklemememiz gerektiginde eskiden beri bu ınterface'i
    implement eden tum class'lara gidip yeni eklenen method'u override etmemiz gerekirdi.

    bu ozellik sayesinde basina default veya static keyboard ekleyerek interface'de
    yeni ve body'si olann bir method olusturursak bu method'un child class'lar
    tarafindan override edilme MECBURİYETİ OLMAZ.
    ve eskiden implement etmis class'lari degistirmemiz gerekmez.

    Bu istisnai bir durumdur ve ınterface icin olusturulan genel kurallari bozmaz.

    Bu method'larin body'si olsa da bunlara concrete method denemez ama override
    edilme mecburiyetleri yoktur.

    Buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi icindir.

    O zaman nicin 2 keywordd (static ve default) tanimlanmistir?

    Bu iki farkli kelimenin amaci child class'lardan bu method'a nasil erisebilecegini
    belirlemek icindir.
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */

    public default void teker (){
        System.out.println("default.......Tum arabalarin tekeri vardir.");

    }

    public static void direksiyon(){
        System.out.println("static.......Tum arabalarin direksiyonu vardir.");
    }
}
