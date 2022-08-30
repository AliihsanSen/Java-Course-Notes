package day30_İmmutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_period {

    public static void main(String[] args) {

        /*
        İki tarih arasındaki sureyi bulma
         */

        LocalDate tarih1 = LocalDate.of(1997, 6, 5);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(bugun, tarih1);

        System.out.println(period);
    }
}
