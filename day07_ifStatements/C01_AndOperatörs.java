package day07_ifStatements;

public class C01_AndOperatörs {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a > 0 && b < 20 && c >= b); // true


        System.out.println(a < 0 && b < 20 && c >= b); // false


        System.out.println(a < 0 & b < 20 & c >= b); // false

        /*
        Java and operatoru konusunda bize iki senecenek sunar.

        && kullanirsak, ilk false buldugunda artik sonucunun false olacagini bilir ve geriye
        kalan sartlari incelemez.

        & kullanirsak, tüm sartlari kontrol eder sonra sonucu belirler.

        bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir.
         */






    }

}
