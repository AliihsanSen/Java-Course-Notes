package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        Elimizinde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip eski urunu, varolan eski urunler
        listesine ekleyelim
        */

        List<String> urunler = new ArrayList<String>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        List<String> eskiUrunler = new ArrayList<String>();

             /*
           listediki ikram'in yerine biskrem koyalım,
           İkram'ı da eski urunler listesine koyalım
            */

        String yeniUrunler = "Biskrem";
        String silinecekUrun = "Ikram";

        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp, yeniUrunler);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi : " + urunler);
        System.out.println("Eski urunler Listesi : " + eskiUrunler);


         yeniUrunler = "Kahve";
         silinecekUrun = "Cay";

         temp = urunler.indexOf(silinecekUrun);
         silinenUrun = urunler.set(temp, yeniUrunler);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi : " + urunler);
        System.out.println("Eski urunler Listesi : " + eskiUrunler);


        yeniUrunler = "Fındık";
        silinecekUrun = "Cekirdek";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrunler);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi : " + urunler);
        System.out.println("Eski urunler Listesi : " + eskiUrunler);

    }
}
