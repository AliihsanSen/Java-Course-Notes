package day18_While_doWhileLoop;

public class C03_doWhileLoop {

    public static void main(String[] args) {

        /*
        While loop'ta once kontrol edip sonra islem yaptigımız icin
        islem bittikten sonra loop'un kirilmasi icin bir kez daha basa donmemiz
        gerekiyor. Bu durumda fazladan bir islem yapiliyor.
         */
        int sayi = 7;

        while (sayi < 10) {
            System.out.print(sayi);
            sayi++;
        }

        System.out.println(" ");


        /*
        Do-While loop ile calistigimizda bu dezavantaj ortadan kalkar.
         */

        sayi = 7;

        do {
            System.out.print(sayi);
            sayi++;
        } while (sayi < 10);


    }
}
