package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //Asta e un comentariu
    //Clasa = un sablon care contine variabile si metode
    //Intr-un fisier java putem aveam mai multe clase diferentiate prin numele lor (nu este un lucru bun sa ai mai multe clase in fisier
    //O clasa trebuie sa aiba un nume
    //O clasa se recunoaste dupa cuvantul clss
    // Tot timplu o clasa trebuie sa fie publica
    //Variabila = atributul unei clase
    //Variabilele sunt de doua feluri : globala si locala
    //Variabile globala = este vizibla peste tot in program
    //Variabila locala = este vizibila doar in locul unde o declari


    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta ;
    public Double Inaltime;
    public Float Greutate;
    public  Character Sex;
    public Boolean Este_angajat ;

    //Metoda = actiune la nivel de clasa
    //Metodele sunt de 2 feluri : void si return


    @Test
    public void  Prezentare_student()
    {
        Nume = "Dani" ;
        Prenume = "Bonciu" ;
        Adresa = "Brasov Bloc 4 Apartament 5" ;
        Varsta = 25 ;
        Inaltime = 1.80;
        Greutate = 65.5f;
        Sex = 'M' ;
        Este_angajat = true ;

        //Print afiseaza pe tastatura si ramane pe acelasi rand
        //Println afiseaza si sare la randul urmator
        //Daca vrem sa legam doua siruri de caractere folosim conceptul de concatenare (+)

        System.out.println( "Numele Studentului este: " + Nume);
        System.out.println("Preunumele studentului este: " +Prenume);
        System.out.println("Adresa Studentului este:"  +Adresa);
        System.out.println("Varsta Studentului este:" +Varsta);
        System.out.println("Inaltimea Studentului este:" +Inaltime);
        System.out.println("Greutatea Studentului este:"+Greutate);
        System.out.println("Sexul Studentului este:"+Sex);
        System.out.println("Studentul este angajat?" +Este_angajat);



    }

        @Test
    public void Adaugare_Nume()
    {
        //Declaram o variabila locala
        String Prenume2 = "Alex";
        Nume= "Dani" ;
        Prenume= "Carpus" ;
        System.out.println("Numele complet este: " +Nume+" "+ Prenume +" " + Prenume2);
        System.out.println("Bonusul de craciune este:" +String.format("%.3f",get_bonus()));
    }

    //Facem o metoda cu return


    public Double get_bonus() {
        Double Bonus = 1.000;
        return Bonus ;


    }
}
