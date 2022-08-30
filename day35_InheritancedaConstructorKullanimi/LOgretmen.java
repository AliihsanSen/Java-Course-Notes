package day35_InheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen (){
        System.out.println("LOgretmen parametresiz constructor");
    }

    LOgretmen (String isim){
        this();
        System.out.println("LOgretmen parametreli constructor");
    }
}
