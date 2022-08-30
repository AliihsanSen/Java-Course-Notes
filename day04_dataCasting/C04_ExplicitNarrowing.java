package day04_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 50;
        byte sayi2 = (byte) sayi1;

        System.out.println("sayi2 = " + sayi2); // 50

        /*
        Geniş data türündeki degeri, dar data türündeki variable'a atamak isterseniz
        Java sizi geniş data türündeki degerin, dar data türünün sinirlarina
        uyup uymayacagını çalıştırana kadar bilemez.
        Ana Java risk almaz.
        Riski sifira indirmek için burada bir sorun olursa
        sorumlulugu kanul etmemizi bekler.
        bunun için degerin önüne parantez içerisinde istedigimiz
        data türünü yazmamız yeterlidir.

        Bu riski üstlendiğimizde, 3 durum oluşabilir;
        1- Bizim değerimiz, dar kalıp değerlerine uygun olursa hiçbir kayıp olmadan
        cast olur.
        2- double bir sayıyı int'a cast etmek gibi durumlarda data kaybi yaşabilirsiniz.
        3- geniş kaliptan degeri dar kaliba koydugunuzda, sinirlari aşan durumlarda
        veri başkalaşabilir.
         */

    }
}
