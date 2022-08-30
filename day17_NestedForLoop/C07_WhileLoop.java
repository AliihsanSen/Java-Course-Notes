package day17_NestedForLoop;

public class C07_WhileLoop {

    public static void main(String[] args) {

        /*
        20'den 50'ye kadar cift sayilari yazdiralim. (Sınırlar dahil)
         */

        int bas = 20;
        int bitis = 50;


        /*
        For loop ile yapılısi
         */
        for (int i = 20; i <= bitis; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        /*
        While loop ile yapılısi
         */
        System.out.println(" ");


        int temp = bas;
        while (temp<=bitis) {
            if (temp % 2 == 0) {
                System.out.print(temp + " ");
            }

        }

    }
}
