package day42_AbstractClass_Interfaces;

public class K_ChildClassOfInterfaces implements I02_Interfaces, I03_Interfaces {
    /*
    bir class'i bir ınterface'e child yapmak icin implements keyword kullanilir.
    implements dedikten sonra virgul yazarak istedigimiz kadar ınterface ekleyebiliriz.

    Bir interface bir class'i parent edinemez
     */
    public static void main(String[] args) {

        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // Yıldız Koleji




    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
