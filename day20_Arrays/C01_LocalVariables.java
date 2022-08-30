package day20_Arrays;

public class C01_LocalVariables {

    public static void main(String[] args) {

        int sayi = 10;

        /*
        System.out.println(sayiMethod); SayiMethod sayiMethod method1'de olusturulmus
        local variable'dir.
         */
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
        /*
        System.out.println(i); i loop'da olusturulmus local variable'dir.
        sadece loop icerisinde kullanilmalidir.
         */

        /*
        static int sayiStatic = 20; Static keyword sadece class level'da kullanilmalidir.
        method'larin icerisinde static variable TANIMLANAMAZ.
         */

    }

    public static void method1() {

    /*
     System.out.println(sayi); sayi main method'da olusturulmus local bir
     variable'dir ve sadece main method'da gecerlidir.
     */

        int sayiMethod = 20;

    }
}
