package day30_İmmutable_Date;

public class C02_stringHavuzu {

    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);


        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // false

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2 == str4); // false

        System.out.println(str1.equals(str4)); // true
        System.out.println(str1 == str4); // true

        /*
        1- Yeni bir String olustururken esitligin saginda new keyword'u olursa
            java direk yeni bir obje ve referans olusturur.

        2- Eger esitligin sagina bir method calisiyor veya + islemi yapiliyorsa
           String immutable oldugundan degisikligi kaydetmek uzere hemen bir kopya
           String ve referans olusturur, sonra degeri hesaplayip bu yeni kopya
           icine koyar
         */

        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str5 == str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1 == str6); // true

        System.out.println(str5.equals(str6)); // true
        System.out.println(str5 == str6); // true


        /*
        1- Eger yeni string objesi olusturulurken new kelimesi kullanilmaz veya
           esitligin saginda bir (+) islemi olmazsa Java bakar

        1- Eger daha once olusturulan String objelerden (String Havuzu)
           bire bir ayni String varsa o objeyi ve referansini kullanir.
           Birebir aynisi yoksa yeni bir obje olusturur.
         */


    }
}
