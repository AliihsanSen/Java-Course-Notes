package day35_InheritancedaConstructorKullanimi;

public class AGrandParents {

    protected String isim = "Grandpa ismi belirtilmedi";

    /*
    Her class'ta gorunmesede bir constructor vardir.
    Bu class'dan obje olusturmak istedigimizde default constructor devreye girecektir.

    Default constructor'i gozlemleyemeyecegimiz icin onun yerin kullanılabilicek
    parametresiz constructor olusturalim.
    */
    protected String granpaKlupAdi = "Grandpa Klubu";

    AGrandParents() {
        System.out.println("Grandpa constructor calisti.");
    }


}
