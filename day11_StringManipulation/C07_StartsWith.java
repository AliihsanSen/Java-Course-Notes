package day11_StringManipulation;

public class C07_StartsWith {

    public static void main(String[] args) {

        String input = "Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); // true
        System.out.println(input.startsWith("")); // true
        System.out.println(input.startsWith("gun", 5)); // true

        /*
        System.out.println(input.startsWith("gun", 5))
        5. index ve sonrası gun ile mi basliyor
         */

    }
}
