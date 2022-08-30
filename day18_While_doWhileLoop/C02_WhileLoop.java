package day18_While_doWhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {
        /*
       Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */

        int input = 5432;

        int rakamlarToplamı = 0;
        int birlerBasamagı = 0;
        int temp = input;


        while (temp > 0) {
            birlerBasamagı = temp % 10;
            rakamlarToplamı += birlerBasamagı;
            temp /= 10;
        }
        System.out.print(input + " sayisinin rakamlar toplami : " + rakamlarToplamı);


    }
}
