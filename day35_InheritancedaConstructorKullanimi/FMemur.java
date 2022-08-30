package day35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {

    /*
    Extends keyword kullanilan class'larda ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim
    Java constructor'in ilk satirina
    super(); constructor call yazar.

    super(); constructor call default constructor'a benzer
    gorunmese de orada vardir ve calisir ancak biz ilk satira farkli bir constructor
    call yazarsak Java super(); constructor'i siler.

    Eger biz mudahele edip kendi constructor call'umuzu ulusturmazsak java'nın
    default olarak olusturdugu constructor call her zaman parametresizdir.
    super();


     */

    FMemur() {
        System.out.println("Memur parametresiz constructor");
    }

    FMemur(String isim) {
        System.out.println("Memmur parametreli constructor");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("ali");


    }


}
