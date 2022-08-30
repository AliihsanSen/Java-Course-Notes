package day07_ifStatements;

public class C03_basitİfStatements {

    public static void main(String[] args) {

        /*
        Bir if statements'da {}' kullanilmazsa
        java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur.

        Eger birden fazla satir ayni if sartina baglanmıs ise mutlaka {} kullanmaliyiz.
         */

        int sayi = -23;

        if (sayi > 0)
            System.out.println("Sayi pozitif");
            System.out.println("pozitif kalacaktir"); // {}' kullanilmazsa sart saglansa bile calisir saglanmazsa da calisir.


        if (sayi % 2 == 0)
            System.out.println("sayi cift");
            System.out.println("cift kalacaktir"); // {}' kullanilmazsa sart saglansa bile calisir saglanmazsa da calisir.


        if (sayi % 5 == 0)

            System.out.println("Sayi 5'in tam kati");


    }


}
