package day30_İmmutable_Date;

import java.time.LocalDate;
import java.time.Month;

public class C03_localdate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2022-07-23

        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear()); // 204
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); // SATURDAY
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue()); // 7
        System.out.println("tarih.isLeapYear() = " + tarih.isLeapYear()); // false

        LocalDate tarih2 = LocalDate.of(2001, 5, 15);
        System.out.println(tarih2); // 2001-05-15

        LocalDate tarih3 = LocalDate.of(1990, Month.JUNE, 5);
        System.out.println(tarih3); // 1990-06-05

        System.out.println(tarih.plusDays(100)); // 2022-10-31, 100 gün sonra

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 2027-11-04

        System.out.println(tarih.minusWeeks(20)); // 2022-03-05

        System.out.println(tarih.isAfter(tarih2)); // true

        /*
        İki farkli dogum gunu girilidiginde hangisinde doganın daha buyuk oldugunu bulunuz.
         tarih2 ve tarih3 icin yapalim
         */

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihinde dogan daha buyuktur.");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuktur.");
        } else {
            System.out.println("İki tarih birbiri ile ayni.");
        }
    }
}
