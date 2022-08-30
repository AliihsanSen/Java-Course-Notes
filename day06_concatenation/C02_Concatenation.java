package day06_concatenation;

public class C02_Concatenation {

    public static void main(String[] args) {

        String stri = "Java";
        String str2 = "Guzeldir";
        int sayi1 = 5;
        int sayi2 = 4;

        /*
        Yukarıdaki variabler'i kullanarak istenen metinleri yazdıralım
         */
        System.out.println(stri + " " + str2 + " " + 54); // Java Guzeldir .
        System.out.println(stri + " " + str2 + " " + (sayi1 + sayi2)); // Java Guzeldır 9
        System.out.println(sayi1 + sayi2 + " " + stri); //9 Java
        System.out.println("" + sayi1 + sayi2 + " " + str2); // 54 Guzeldir

        System.out.println(stri.concat(str2)); //JavaGuzeldir
        System.out.println(stri.concat(" ").concat(str2)); // Java Guzeldir

        System.out.println(5 * 2 != 15); // eşit değildir demi, eşit değil çıkarsa true cevabını verir.
        System.out.println(5 + 2 != 7); // Eşit değildir demi, eşit çıkarsa false cevabını verir

        System.out.println(!(3 * 5 > 7)); // Ünlem işareti işlemin tersini almaya yarar,




    }
}
