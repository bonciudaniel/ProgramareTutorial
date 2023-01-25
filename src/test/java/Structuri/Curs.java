package Structuri;

import org.testng.annotations.Test;

public class Curs {

    //Strcturile in programare sunt de 2 feluri: Alternative si Repetitive
    //Structurile Alternative : se pot realiza folosind : if then else ,switch case
    //Structurile Repetitive : se pot realiza folosind : for , while, do while, for each (Loop)

    @Test
    public void MetodaTest(){
        //VerificareNumar(15);
        //VerificareNumar(3);
        //VerificareNumar(10);
        //VerificareNumar(-2);
        //VerificamNumarParPozitiv(4);
        //VerificamNumarParPozitiv(5);
        //VerificamNumarParPozitiv(-2);
        //VerificamNumarParPozitiv(-3);
        //VerificamNumarParPozitiv(0);
        ZiuaSapatamana(4);
        ZiuaSapatamana( 2);

    }
    //Verificam daca un numar este mai mare decat 10.
    public void VerificareNumar (Integer Numar){
        if (Numar > 10){
            System.out.println("Numarul este mai mare decat 10");
        }
        else {
            System.out.println("Numarul nu este mai mare decat 10");
        }
    }

    //Verificam daca un numar este par si pozitiv


    public void VerificamNumarParPozitiv(Integer Numar) {
        if (Numar > 0) {
            if (Numar % 2 == 0) {
                System.out.println("Numarul este par si pozitiv");

            }
            else {
                System.out.println("Numarul este impar si pozitiv");
            }

        }
        if (Numar<0){

        }
        else { if (Numar % 2 == 0) {
            System.out.println("Numarul  este par si negativ");

        }
        if (Numar ==0)
         {
            System.out.println("Numarul este impar si negativ");
        }

        }
        if (Numar ==0) {
            System.out.println("Numarul este egal cu 0.");

        }
    }

    //Facem o metoda cu switch case
    //Afisam ziua curenta din sapatamana

    public void ZiuaSapatamana(Integer Numar) {
        switch (Numar){
            case 1 :
                System.out.println("Luni");
                break;
            case 2 :
                System.out.println("Marti");
                break;
            case 3 :
                System.out.println("Miercuri");
                break;
            case 4 :
                System.out.println("Joi");
                break;
        }
    }
    //Diferenya principala dintre if si case - case este o metoda mai rapida, deoarece trece la case-ul cerut.

    }
