package day05_matematikselİşlemler;

public class C01_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi1 = 10;

        int sayi2 = sayi1 + 1; // sayi2--> 11

        sayi2 += 5; // sayi-->16

        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi için geçerlidir.
        bu iki işlem için sayidan sonra veya  önce yazılmasına göre farkli isleyiş olur.

         */

        int sayi3 = sayi2++;    // 1- sayi2 degeri, sayi3'e atanacak
                                // 2- sayi2 bir artirilacak

       /*
       eger ++ veya -- veriable'dan sonra olursa buna past.
       bu durumda o satirda yapilan iki işlemden
       artirma veya azaltma işlemi sonucudur.
        */

        System.out.println("sayi3 = " + sayi3); // 16
        System.out.println("sayi2 = " + sayi2); // 17

        int sayi4=++sayi1;      // 1- sayi1 bir artirilacak
                               // 2- sayi1 degeri, sayi4'e atanacak


         /*
        eger ++ veya -- veriable'dan önce ise Pre ..... denir
        bu durumda o satırda yapilan iki işlemden öncelikli olan
        artırma veya azaltmadır.
         */



    }
}
