package day17_NestedForLoop;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        /*
        Verilen sayiya göre carpim tablosu olusturn.

        input : 3
        1 2 3
        2 4 6
        3 6 9
        */

        int input = 8;


        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(" ");

        }

    }
}
