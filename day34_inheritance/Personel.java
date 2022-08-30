package day34_inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladiginiz bir class varsa veya ilerde
    bu class'i parent yapmak isteyenler olabilir diyorsaniz o zaman
    variable ve method'larin access modifier'ini protected
     */

    protected int persNo;
    protected String isim = "İsim belirtilmedi";
    protected String departman = "Departman belirtilmedi";

    public void maas() {
        System.out.println("Tum personelin maasi vardir");
    }

    public void mesai() {
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    public void fazlaMesaiUcreti() {
        System.out.println("Personel fazla mesai ucreti statusune gore alir");
    }


}
