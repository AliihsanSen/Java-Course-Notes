package day42_AbstractClass_Interfaces;

public interface I02_Interfaces {

    int SAYI = 30;
    /*

    Interface bir class degildir.

    Abstract Class'lar java'da abstraction (Soyutlaştırma / Kural koyma)
    isleviini yapiyordu.
    Ancak abstract bir class'da absttract olmayan method'lar da olabilir. bu da full
    absttraction yapmaya izin vermez.

    Eger javai2da icinde bir concrete method olmasin dedigimiz bir class olusturmak
    istiyorsaniz bunu class degiil Interface yapmalisiniz.

        1- INTERFACE'LERDE CONCRETE METHOD OLMAZ.

        2- Interface'lar full abstraction yaptigindan Interface'lerden obje olusturulamaz.

        3- Hatırladıgınız gibi Interface olan list'den obje olusturamıyorduk
            List<String> liste = new List<String>(); --> calismaz

            Bunun yerine constructor'i list'in child'i olan ArrayList'den seceriz.
            List<String> liste = new ArrayList<String>(); --> calisir.

        4- Class'larda bir child birden fazla parent edilemez.
            ancak Interface'lerde concrete method olmadigindan biz her methodu child
            class'da override etmek zorundayiz
            Override ederken kimin soyledigini override ettigimizin onemi yok.

        5- Interface'lar neyin yapilmasini gerektigini soyler ama nasil
            yapilacagina karismaz.

     */


}
