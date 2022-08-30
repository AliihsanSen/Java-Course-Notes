package day42_AbstractClass_Interfaces;

public interface I03_Interfaces {

    int SAYI = 20;
    String ISIM = "Yıldız Koleji";
    /*
     int sayi; --> Interface'lerde tum variable'lar public, static ve final'dir
     dolayisiyla sonradan deger atama sansimiz yoktur.
     bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz.
     */

    void yakit();
    /*
    Interface icerisindeki her method public abstract ozelliklerine sahiptir.

    abstract bir method'un body'si olmasi mumkun degildir.
    Java sonradan devoloper'larin istegi uzerine kısmi bir uptade yapmistir.
    Bir ınterface'e sonradan bir abstract method eklerseniz o ınterface'i daha once
    implement etmis tum class'lara gidip hepsinde yeni eklenen method'u override
    etmeniz gerekir.

    Bu da buyuk ve eskiden gelen projeler icin zor bir islemdir.

    Bunun icin Java8'den itibaren ınterface'lere sonradan body'si olan method
    eklenmesine izin vermistir.

     */

    public void motor();
    public abstract void teker();



}
