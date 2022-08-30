package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {
        int not = 60;
        // data turu, variable ismi, assignment sign, variable değeri, işlem bitti işareti
        int not2 = 70;

        // variable, değer
        // java önce değeri hesaplar sonra assign işlemini yapar

        not2 = 90;

        // yeni bir int variable oluşturalım ilk iki variable'in ortalaması olsun

        int ort = (not + not2) / 2;

        System.out.println(ort);
        // "" içinde azılan her şey metindir, Java "" içinde ne görürse o şekilde yazdırır.
        // eğer bir  variable'in değerini yazdırmak istiyorsanız.
        // "" olmadan variable ismini yazmalısınız.

    }


}
