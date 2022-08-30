package day31_timeFormatter_varargs;

public class C05_varargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali","Ayse","Ismail","Ahmet","Babayigit","Akin");

        /*
        Varargs teorik olarak sonsuz sayida element alabilir.
        Bir method'da parametre olarak varargs varsa varargs'in sinirlarini
        bilebilmesi icin parametrelerin sonuncusu olmalidir.
        Oncesinde farkli parametreler olabilir ama varargs'dan sonra parametre OLAMAZ.

        Bu kuraldan sonra bir method'da iki tane varargs OLMAZ.
         */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];

        for (String each:kelime
        ) {
            if (each.length()> enUzunKelime.length()){
                enUzunKelime = each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

    }
}
