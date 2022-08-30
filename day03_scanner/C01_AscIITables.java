package day03_scanner;

public class C01_AscIITables {

    public static void main(String[] args) {

        //  Bir tamsayı, bir de char değişken oluşturun ve bunların toplamını yazın

        int sayi = 10;
        char harf = 'a';
        String str = "banan";

        System.out.println(sayi + harf); //107
        System.out.println(str + harf); //banana
        System.out.println(harf - sayi); //87
        System.out.println(harf + 2); //99
        System.out.println(str + sayi + harf); //banan10a
        System.out.println("" + sayi + harf); // 10a

        /*
        1- char data türü işleme girdiği değişkenin türüne göre farklı tanımlanabilir.
        eğer matematiksel variable sayısal bir değerse sayı gibi davranır.
        sayi + harf sayi variable'i int olduğundan harf variable'i ascII tablosundan 97 değerini kullanır.

        2-  char yeniHarf = harf + 2; java önce sağdaki işlemi yapar, sağda int + char görünce acII değerini alır.
                                       sonra atama işlemi yapmaya çalışır.
                                       char yeniHarf = 99;
                                       bu atama java açısından kabul edilebilir değildir.

        3- str + harf; // banana String variabke çok güçlüdür, hangi data turu ile işleme girerse girsin
                                 diğer data türünü kendine benzetir.

        4- Konsolda verilen Variable'ları kullanarak 10 görmek istersek nasıl yazılmalıdır.
                    System.out.println(""+sayi+harf); // 10a
                    Başına "" tırknak koyarak bu işlemi sonsuzluğa götürürüz. Yani String yaparız.

         */


    }
}
