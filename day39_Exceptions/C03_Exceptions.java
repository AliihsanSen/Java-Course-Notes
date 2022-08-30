package day39_Exceptions;

public class C03_Exceptions {

    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir.");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");
        }

        System.out.println("Sayinin karesi : " + (sayi * sayi));

        /*
        Kullanici String olarak bir deger aliyor ve bunu Integer'a ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongoruruz.
        NumberFormatException aldgimizda kodun durmamasini istiyorsak try - catch
        ile cevreleyebiliriz.

        Eger bilmedigim bir exception daha olusursa kodum durmasın istiyorsak
        bir kere daha catch cumlesi ekleyip ona en genis exception'i yazabiliriz.

         */
    }

}
