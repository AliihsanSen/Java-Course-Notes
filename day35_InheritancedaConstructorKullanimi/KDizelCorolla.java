package day35_InheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {

    KDizelCorolla() {
        System.out.println(" KDizelCorolla parametresiz constructor");
    }

    KDizelCorolla(String isim) {

        super(isim);
        System.out.println(" KDizelCorolla parametreli constructor");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1 = new KDizelCorolla("hasan");
    }

}
