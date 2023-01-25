package AbsatractizareClasaAbstracta;

public abstract class Persoana {


    //O clasa abstracta poate sau nu sa contina metode abstracte
    //Clasa care mosteneste clasa absatracta => implementeaza toate metodele abstracte
    // Putem mosteni o singura clasa abstracta\
    //O clasa abstracta poate implementa o interfata
    //Intr-o clasa abstracta poti avea un contructor => nu putem facem un obiect
    //Intr-0 clasa abstracta putem avea metode private, publice, protected
    //Metodele abstracte trebuie sa contina cuvantul abstract


    //Definim metode simple

    public abstract void munceste();
    public abstract void primestesalariu();
    public abstract void mergelacurs();
    public abstract void primestebursa();

    //Definim metode simple
    public void curs(){
        System.out.println("metoda simpla");
    }

}
