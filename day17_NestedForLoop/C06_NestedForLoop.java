package day17_NestedForLoop;

public class C06_NestedForLoop {

    public static void main(String[] args) {
        /*
        Verilen string'i asagıdaki gibi yazdiran bir program yazdirin.

        input = Deniz
        D
        De
        Den
        Deni
        Deniz

         */

        String input = "Ankara";

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));

            }
            System.out.println(" ");
        }


    }
}
