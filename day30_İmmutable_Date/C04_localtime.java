package day30_İmmutable_Date;

import java.time.LocalTime;

public class C04_localtime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();

        System.out.println(time1); // 19:13:17.862762700
        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip
        bizim variable'imizza store eder.
        time1 variable'inin degeri SABİTTİR.
         */


        Thread.sleep(3000); // 3 sn bekler sonra alt satira geçer

        time1=LocalTime.now();
        System.out.println(time1); // 19:13:17.862762700

        System.out.println("time1.getSecond() = " + time1.getSecond());

        System.out.println("time1.plusSeconds(10000) = " + time1.plusSeconds(10000));


    }
}
