package day41_Abstract_Interface;

public class FMercedes extends DAraba {

    @Override
    protected void yakit() {

        /*
        abstract bir parent'in concrete child class inherit ederse parent abstract
        class'daki tum abstract method'lari override etmek zorundadir.

        abstract bir class, abstract baska bir class'i parent edinirse,
        parent class'daki tum abstract method'lari override etmek ZORUNDA DEGİLDİR.
         */

    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
