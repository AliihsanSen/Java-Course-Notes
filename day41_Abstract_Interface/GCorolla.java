package day41_Abstract_Interface;

public class GCorolla extends EToyota {
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
    /*
    Corolla class'inin iki tane parent'i var.
    Corolla parent'larin ikisinin de standartlarinia (abstract method) uymak zorundadir.

    concrete bir class parent'i olan tum abstract class'larda abstract olan method'lari
    implement etmek ZORUNDADİR.
    Ancak parent silsilesinde override edilerek concrete yapilan method'lari override
    etmek zorunda DEGİLDİR.
     */
}
