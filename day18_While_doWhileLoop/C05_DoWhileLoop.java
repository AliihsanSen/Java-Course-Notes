package day18_While_doWhileLoop;

public class C05_DoWhileLoop {

    public static void main(String[] args) {

        /*
        Soru 1) 9 'dan 190 'a kadar 7'nin kati olan tam sayilari ekrana yazdirin.
         */

        int bas = 9;
        int bitis = 190;

        int temp = bas;

        // While loop ile yapalim.

        while (temp < bitis) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }

        System.out.println(" ");


        // Do while loop ile yapalim.

        temp = bas;

        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } while (temp < bitis);


    }
}
