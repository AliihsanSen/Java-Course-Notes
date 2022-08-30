package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya ekleme veya uptade yapmak
        istiyorsak FileOutputStream Class'indan yardim aliriz.
         */

        FileInputStream fis = new FileInputStream("src/day39_Exceptions/Test.txt");

        /*
        --> Goruldugu gibi compile time'da altini kirmizi cizen her durum
            Compile Time Error degildir.

        -->Java'da bazi exception'lar da Compile Time Exception'dir

        --> Ozellikle dosya okuma ve yazma ile ilgili exception'lar
            Compile Time Exception'dir.

        --> Compile Time Exception olusutugunda java cozum icin 2 ihtimal onerir.
            1- try - catch ile cevrelemek
            2- method signature'ina throws keyword ile beklenen exception turunu yazmak

        --> Throws exception, sadece oalyin farkinda oldugumuzun deklarasyonudur
            exception'in handle edilmesinde hicbir rolu yoktur

        --> yani try - catch ile kontrol altina aldigimiz exception'lar da kod calismaya
            devam ediyordu.

        --> Ancak throws Exception yazdigimiza Java bir exception ile karşilasirsa hicbir
            sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.
         */


    }


}
