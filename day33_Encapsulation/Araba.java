package day33_Encapsulation;

public class Araba {

    String marka = "Marka Belirtilmedi";
    // marka'nin access modifier'i default access modifier package icerisinde kullanilabilir.
    private String model = "Model Belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    // bunun

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
