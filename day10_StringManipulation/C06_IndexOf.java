package day10_StringManipulation;

public class C06_IndexOf {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // bana integer donduruyor
        // int'de yok diye bir deger bulunmuyor
        // 0 dersek J'nin index'idi.
        // (-) bir deger donenrse biz aranan string str'da olmadıgını anlariz.
        // Java -1 dondurmeyi tercih etmiştir.

        String str5 = "asdfghjklömnbvfdfgtyhujkılşçömnbvcdrftgyhjkömbvcdfgh";

        // str5'te P harfi var midir?

        if (str5.indexOf("0") ==-1){
            System.out.println("Str5 de istenen karakter kullanilmamiş.");
        }else {
            System.out.println("Str5 de istenen karakter kullanilmiş.");
        }


    }
}
