package day14_MethodCration;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        /*
        Verilen isim ve soyismin ilk harfi buyuk geriye kalanlari * olacak sekilde
        degistirip bize bu halini donduren bir method olusturun .
        Not : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak
        istiyoruz.
         */

        String isim = "Enes";
        String soyİsim = "Bozkurt";

        String gizliİsim = isimGizle(isim, soyİsim);
        System.out.println(isim + " " + soyİsim); // lazim olursa kullanabilirim.
        System.out.println(gizliİsim); // E*** B******


    }

    private static String isimGizle(String isim, String soyİsim) {

        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");

        soyİsim = soyİsim.substring(0, 1).toUpperCase()
                + soyİsim.substring(1).replaceAll("\\w", "*");

        return isim + " " + soyİsim;
    }

}
