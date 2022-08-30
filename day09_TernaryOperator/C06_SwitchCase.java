package day09_TernaryOperator;


public class C06_SwitchCase {

    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin.
         */

        String input = "cumartesi";
        input = input.toLowerCase();

        switch (input) {

            case "pazartesi":
            case "sali":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir dun giriniz");


        }

        /*
                switch (input) {
                case "pazartesi" :
                System.out.println("Hafta ici");
                break;
            case "sali" :
                System.out.println("Hafta ici");
                break;
            case "çarşamba" :
                System.out.println("Hafta ici");
                break;
            case "perşembe" :
                System.out.println("Hafta ici");
                break;
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
                System.out.println("Hafta sonu");
                break;
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir dun giriniz");
                }
 */




    }
}

