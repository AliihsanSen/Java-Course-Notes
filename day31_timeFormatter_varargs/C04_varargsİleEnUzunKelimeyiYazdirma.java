package day31_timeFormatter_varargs;

public class C04_varargsİleEnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet");

    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

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
