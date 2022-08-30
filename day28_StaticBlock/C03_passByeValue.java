package day28_StaticBlock;

public class C03_passByeValue {

    public static void main(String[] args) {

        /*
            %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati = 100;

        double indirimliFiyat = indirimliFiyatHesapla(satisFiyati);
        System.out.println("indirimli Fiyati : "+indirimliFiyat);


    }

    public static double indirimliFiyatHesapla(double satisFiyati) {

        double indirimliFiyat = satisFiyati * 0.75;

        return indirimliFiyat;

    }
}
