package day12_StringManipulation;

public class C01_Replace {

    public static void main(String[] args) {

        String str = "Bu gun ha va cok guz el";

        System.out.println(str.replace(" ", "")); // Bugunhavacokguzel

        System.out.println(str.replace("ha va", "java")); // Bu gun java cok guz el

        System.out.println(str.replace("ha va", "java").replace(" ", "")); // Bugunhavacokguzel


        // Cumleyi replace kullanarak Bugun Java cok guzel yapalim

        str = str.replace("Bu gun", "bugun")
                .replace("ha va", "java")
                .replace("gu zel", "guzel");

        System.out.println(str);

    }
}
