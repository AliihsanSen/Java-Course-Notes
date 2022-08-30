package day41_Abstract_Interface;

public class C01_Exceptions {

    public static void main(String[] args) {

        try {
            calış();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calış() {

        throw new RuntimeException("Çoook çalış");
        /*
        throw ile kontrollu exception olustururken parametre olarak istedigimiz
        mesajını verebiliriz.
         */
    }

}
