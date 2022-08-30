package day35_InheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe (){
        System.out.println("Nuhasebe parametresiz constructor");
    }

    EMuhasebe (String isim){
        System.out.println("Nuhasebe parametreli constructor");
    }
}
