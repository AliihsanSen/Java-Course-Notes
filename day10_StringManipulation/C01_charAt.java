package day10_StringManipulation;

public class C01_charAt {

    public static void main(String[] args) {

        String str = "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdiri

        System.out.println(str.toUpperCase().charAt(7)); // R yazdirir

        System.out.println(str.charAt(21)); // l yazdirir

        /*
        System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException

        Son harfi bulmak icin str'in uzunlugunun 1 eksigini idex olarak gireriz.
        eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir
         */

        /*
        charAt() kullandigimmizda sonuc char olacagi icin artik manipulation yapmayiz
        Stirng method'larindan kullanmamiz gereken bir method varsa charAt () önce kullanmaliyiz.
         */


    }


}
