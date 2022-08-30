package day35_InheritancedaConstructorKullanimi;

public class Child extends BParents {

    String isim = "Child isim belirtilmedi.";
    protected String childKlupAdi = "Child Klubu";

    Child() {
        System.out.println("Child constructor calisti.");
    }

    public static void main(String[] args) {

        AGrandParents gp1 = new AGrandParents();
        /*
        bu objeyi olusturmak icin Granpa Constructor calisir.
        Parent veya child constructor calismaz
         */

        Child child1 = new Child();
        child1.granpaKlupAdi = "Child1";
        child1.parentKlupAdi = "Child2";


        /* child1 objesi icin Child constructor calisir.

            --> Java'da bir class'i kullanabilmek icin o clas'dan obje olusturur,
            doalyisiyla o class'in constructor'ini kullanirdik.

            --> Java inheritance'da parent class'lardaki ozellikleri kullanabilmek
            icin o class'larin constructor'larini otomatik calistiran bir yapi kurmuştur.

            --> Ornegin biz child class'indan bşr obje olusturmak istedigimizde child
            constructor'ini kullaniriz.

            --> Java child(){} gordugunde once parent'in constructor'ini calistirmam
            lazım der. buradan Parent constructor'a gider.

            --> Parent class'inda Parent () {} gorunce once bunun parent'inin yani
            GrandParent constructor calismasi gerekir der.

            --> Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak
            tum constructorlari asagi dogru calistirir.

         */

    }
}
