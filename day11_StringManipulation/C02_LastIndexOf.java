package day11_StringManipulation;

public class C02_LastIndexOf {

    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";

        String kelime = "cok";

        /*
        Verilen kelime icin asagıdaki sartlardan uygun olanı yazan bir programi
        yazin.
        -verilen kelime cumleden kullanilmamiş
        -verilen kelime cumlede sadece 1 kere kullanilmiş
        -verilen kelime cumlede birden fazla kullanilmiş
         */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.indexOf(kelime);

        if (kelimeIlkIndex == -1) {
            System.out.println("verilen kelime cumleden kullanilmamiş");
        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmiş");
        } else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmiş");
        }

    }
}
