package day30_İmmutable_Date;

import java.time.LocalDateTime;

public class C06_localDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat =LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-07-23T19:40:18.961690100

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));
        System.out.println(tarihSaat.minusDays(100).minusMinutes(100));


        System.out.println(tarihSaat.toLocalDate()); // 2022-07-23

    }
}
