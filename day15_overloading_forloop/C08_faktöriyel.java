package day15_overloading_forloop;

public class C08_faktöriyel {

    public static void main(String[] args) {

        /*
        input olarak verilen bir tam sayi icin faktöriyel hesaplayip yazdiran
        bir method olusturun.

        verilen sayi negatif veya 20 den buyuk olursa
        "girilen sayinin faktöriyeli hesaplanamaz" uyarisi yazdirin
         */

        int input = 7;

        faktöriyelHesapla(input);

    }

    public static void faktöriyelHesapla(int input) {

        int faktöriyel = 1;

        if (input < 0 || input > 20) {
            System.out.println("Girilen sayinin faktöriyeli hesaplanamaz. ");
        } else if (input == 0) {
            System.out.println("0! = 1'dir");
        } else {
            for (int i = 1; i <= input; i++) {
                faktöriyel *= i;
            }
            System.out.println("faktöriyel degeri :" + faktöriyel);
        }

    }
}
