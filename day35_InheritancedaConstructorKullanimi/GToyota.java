package day35_InheritancedaConstructorKullanimi;

public class GToyota {

    GToyota() {
        System.out.println("GToyota parametresiz constructor");
    }

    GToyota(String isim) {

        //super(isim); extends olmadigi icin super constructor call^'a java kabul etmez.
        System.out.println("GToyota parametreli constructor");
    }


}
