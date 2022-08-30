package day15_overloading_forloop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        Javada olsuturdugumuz methodlarin isminin yaptigi isler ile
        uyumlu olmasini isteriz.
        mesela bir String'in bir bolumununu almak icin
        2 adet Java substring() method'u veya
        Verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var.

        Java ayni isimde birden fazla method varsa
        hangisinin kullanilacagına parametre sayisi ve parametrelerin data turune göre
        karar verir.
         */

        String str = "Bu java ogrenilecek, baska yolu yok";

        str.substring(2);
        str.substring(2, 4);


        str.replace('c', 'v');
        str.replace("J", "h");

        /*
        Ayni isimde ama farkli method'lari olusturmak icin
        degistirebilcegimiz seyler
            1- parametre sayisi
            2- ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
            3- ayni sayida ve ayni data turunde parametreleri olan methodlarda
               parametrelerin siralanisi
         */


    }

}
