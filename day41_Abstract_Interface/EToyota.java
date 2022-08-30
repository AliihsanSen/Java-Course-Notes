package day41_Abstract_Interface;

public abstract class EToyota extends DAraba {

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir.");
    }
    /*
    Parent class'daki standar belirleyici method'lar (abstract method)'larin tamami
    child class tarafindan override edilmelidir.

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz.

    Aslinda toyota class'i da obje uretecegimiz bir class degil bu durumda eger proje
    tasarimi yapiyorsaniz Toyota class'ini da abstract yapmamiz guzel olur.
     */
}
