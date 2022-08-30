package day32_StringBuilder;

public class C02_Append {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha ne yapsin");

        sb1.append("?");
        System.out.println("sb1 = " + sb1);

        /*
        Append istedigimiz String'i en sona ekler
         */

        sb1.append("Java",2,4); // Java daha ne yapsin?va


        sb1.insert(4," her seyi düsünmüs,");
        System.out.println("sb1 = " + sb1); // sb1 = Java her seyi düsünmüs, daha ne yapsin?


        /*
        Araya ekleme yapmak istedimizde append degil insert kullanmaliyiz.
         */

        sb1.insert(22,"valla valla",5,11 );
        System.out.println("sb1 = " + sb1); // sb1 = Java her seyi düsünmüs valla, daha ne yapsin?


    }
}
