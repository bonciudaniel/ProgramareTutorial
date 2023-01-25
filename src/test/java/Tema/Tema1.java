package Tema;

import org.testng.annotations.Test;

public class Tema1 {

    //Definesca cateva atribute pentru calculator
    public String Brand;

    public Double Inaltime;
    public Float Greutate;
    public Integer Pret;

@Test
    public void  Prezentare_Calculator () {

        Brand = "ASUS X515" ;
        Inaltime = 1.4 ;
        Greutate = 1.8f ;
        Pret = 250;

        System.out.println("Brandul calculatorului este :" +Brand);
        System.out.println("Inaltimea calculatorului este:" +Inaltime);
        System.out.println("Greutatea calculatorului este: " +Greutate);
        System.out.println("Pretul calculatorului este :" +Pret);

    }
    @Test
     public void  Intel_Graphics()
    {
    String Prenume2 = "Intel UHD Graphics" ;
    Brand= "Intel UHD Graphics" ;
    Pret = 250 ;
    System.out.println("Brandul calculatorului este :" +Brand+" " + Prenume2 + " " + Pret);
    }





}