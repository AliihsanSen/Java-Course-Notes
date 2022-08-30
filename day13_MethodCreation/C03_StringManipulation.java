package day13_MethodCreation;

public class C03_StringManipulation {

    public static void main(String[] args) {

        /*
         Soru 1) String methodlarini kullanarak
        “ Java ogrenmek123 Cok guzel@  ”  String’ini
        “Java ogrenmek cok guzel.” sekline getirin.
         */

        String str = "Java ogrenmek123 Cok guzel@ ";

        str = str.trim();
        str = str.replaceAll("\\d", "");
        str = str.replace("@", "");
        str = str.replace("C", "c");
        str = str + ".";

        System.out.println("str = " + str);

    }
}
