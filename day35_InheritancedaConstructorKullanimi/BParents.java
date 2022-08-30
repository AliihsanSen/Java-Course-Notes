package day35_InheritancedaConstructorKullanimi;

public class BParents extends AGrandParents {

    protected String isim = "Parent isim belirtilmedi";
    protected String parentKlupAdi = "Parent Klubu";

    BParents() {
        System.out.println("Parent constructor calisti.");
    }
}
