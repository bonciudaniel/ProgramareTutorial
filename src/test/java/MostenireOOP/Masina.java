package MostenireOOP;

public class Masina {

    //OOP = OBJECT ORIENTED PROGRAMMING
    // 4 Concepte = Mostenire , Abstractizare, Incapsulare , Polimorfism
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa( Bunici<= Nepoti)
    //Clasa care mosteneste (nepotii) se numeste clasa copii
    //Clasa care este mostenita (bunicii) se numeste clasa parinte
    //Mostenirea se face cu cuvantul extends
    // In Java o clasa poate sa mosteneasca o singura clasa
    // In momentul in care o clasa mosteneste o alta clasa => trebuie sa apelam prima data la Constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa => putem accesa orive variabila/metoda din clasa Parinte

    //Aplicam conceptul de Incapsularea Datelor
    //Incapsularea Datelor = conceptul prin care tinem departe  de exterior valorile variabilelor pe care nu vrem sa le modificam
    // Private = acces control care restrictioneaza vizibilitatea variabilei la nivel de clasa unde este declarata
    //Pentru a accesa/modifica valorile unor variabile private ne folosim de conceptul get si set


    //Polimorfism = conceptul prin care o metoda poate avea mai multe forme
    //Polimorfismul este de 2 feluri : Dinamic (Ovveride) si Static (Overload)
    //Polimorfism Dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea mai multe implementari
    //Polimorfismul dinamic se aplica mereu cu mostenirea
    //Polimorfism static = o metoda se poate diferentia prin  numarul sau tipul parametrilor




    private String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;


    public Masina(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;

    }

    //Get si Set


    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void  InfoMasina(){
        System.out.println("Brandul este" +Brand);
        System.out.println("Modelul este" +Model);
        System.out.println("Transmisia este" +Transmisie);
        System.out.println("Pretul este" +Pret);
    }


    //Polimorfism dinamic

    public void ConducMasina(){
        System.out.println("Masina se poate conduce");

    }
}
