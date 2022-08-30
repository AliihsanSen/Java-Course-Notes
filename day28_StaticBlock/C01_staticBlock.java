package day28_StaticBlock;

public class C01_staticBlock {

    static int sayi;

    static {

        /*
        --> Static block class uyelerinin tamamindan once calisir.
        (Main method'dan bile once calisir.)

        --> Static block class olusturuldugunda calisir.
        Genellikle de class'la ilgili on ayarlamalar veya static variable'lara deger atamak
        icin kullanilir.

        --> Static block'larin class icerisinde nerede oldugu onemli değildir.
        once static block'lar calisir.

        --> Birden fazla static block varsa yukarıdan asagi calisir.
         */
        System.out.println("Static block calisti.");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("Main method altindaki static block calisti.");
    }

}
