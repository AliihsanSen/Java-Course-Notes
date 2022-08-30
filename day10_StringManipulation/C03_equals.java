package day10_StringManipulation;

public class C03_equals {

    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1.equals(str3)); // true

        System.out.println(str1 == str5); // false
        System.out.println(str1.equals(str5)); //true

        /*
        String'lerde ayi String olsa bile (==) her zaman calısmaz.
        emin olmak isterseniz equals() methodunu kullanmalisiniz.

        equals() kullandigimizd dikkat edecegimiz TEK SEY metinlerin
        bire - bir aynni olmasidir.
         */


    }
}
