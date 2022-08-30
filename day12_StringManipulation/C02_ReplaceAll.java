package day12_StringManipulation;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str = "1Bu2gu3n Java- cok g3uz/el";

        /*
        str'i Bugun Java cok guzel haline getirin.
         */

        /*
        replaceAll()'deki all'un amaci ayni ozelliktei tum karakterleri
        kapsamasidir.
        butu sayilari sil
        butun ozel karakterleri sil
         */
        /*
        Tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        space'leri korumak icin en basta onların yerine cumlede bulunmayacak
        bir string koyalım
        "qazwsx"
         */

        str = str.replace(" ", "qazwsx");
        System.out.println(str); // 1Bu2gu3nqazwsxJava-qazwsxcokqazwsxg3uz/el


        str = str.replaceAll("\\W","");
        System.out.println(str); //

        str = str.replaceAll("\\d", "");

        /*
        istenmeyen ozel karakter ve sayilardan kurtulduk
        simdi spaceleri geri getirelim
         */

        str = str.replace("qazwsx", " ");
        System.out.println(str); // Bugun Java cok guzel



    }

}
