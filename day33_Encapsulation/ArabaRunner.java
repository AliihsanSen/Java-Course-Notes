package day33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();
        /*
        arb1 objesi uzerinden marka variable'ina ulasabildim,
        degistirebildi (set) ve yazdirabildim(get)
         */
        arb1.marka="Toyota";
        System.out.println("arb1.marka = " + arb1.marka); // arb1.marka = Toyota

        /*
        Access modifier kullanarak marka variable'ina ulasimi
        tamamen serbest yapabilirim yada engelleyebilirim
        private yaptigimiz model'e ise hic ulasamayiz.
        yani access modifier ya hep ya hic diyor
        */

        /*
        marka'yi degistirelim ama goremeyelim,
        yakiti'da gorelim ama degistiremeyelim
         */

         /*
         set ve get yetkilerini ozel olarak tanimlamak isterseniz
            1. adim : ozel yetki tanimlayacaginiz variable'lari private yapin.
                      private bir dataya baska class'lardan ulasmak mumkun olmadigindan
            2. adim : set yetkisi icin setter, get yetkisi icin getter method'lari olusturalim
          */

        arb1.setModel("Coralla"); // model olarak supra'yi atadik
        // Modeli yazdirma imkanimiz yok. Cunku getter method'u yok.

        System.out.println("arb1.getYakit() = " + arb1.getYakit()); // arb1.getYakit() = Elektrikli
        // yakiti degistiremeyiz cunku setter method'u yok.



    }
}
