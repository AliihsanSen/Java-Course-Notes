package day11_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir String veya char'in
        ilk kullanildigini indedx'i bize dondurur.
         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf('r')); // 7
        System.out.println(str.indexOf('j')); // -1
        System.out.println(str.indexOf("mek")); // 10

        /*
        Eger istedigimiz index'den sonrasını kontrol etmek istersek
        o zaman aynı method'un iki parametreli olarak kullanabiliriz.
         */

        System.out.println(str.indexOf("g", (6 + 1))); // yazilan index'den baslar

        /*
        yukaridaki str'da 2. ve 3. e'nin indexlerini bulun.
        2. ci e'yi bulabilmek iççin 1. e'nin index'ine ihtiyacım var.
         */

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);

        /*
        Eger 2. e varsa 3. e'nin olup olmadıgını ve varsa index numarasını yazdirin.
         */

        if (ikincie == -1) {
            System.out.println("Verilen str'da ikincie yoktur.");
        } else {
            int ücüncüe = str.indexOf("e", ikincie + 1);
            if (ücüncüe == -1) {
                System.out.println("Verilen str'da ücüncüe yoktur.");
            } else {
                System.out.println("Verilen str'da 3.e'nin index'i : " + ücüncüe);
            }
        }


    }
}
