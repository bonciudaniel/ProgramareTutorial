package MostenireOOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireTest {

    @Test
    public void MetodaTest(){
        //Facem un obiect Dacia
        System.out.println("==obiecteDacia==");
        List<String> DotariExterioareLogan = Arrays.asList("Geamuri electrice","aer conditionat");
        Dacia Logan = new Dacia("Dacia","Logan","Manuala",1000, "negru metalizat",DotariExterioareLogan);
        Logan.InfoDacia();
        Logan.CalculPretFinal();
        Logan.ConducMasina();

        List<String> DotariExterioareSandero= Arrays.asList("Geamuri electrice","aer conditionat");
        Dacia Sandero = new Dacia("Dacia","Sandero","Manuala",20000, "negru",DotariExterioareSandero);
        Sandero.InfoDacia();

        List<String> DotariExterioareDokker= Arrays.asList("Geamuri electrice","aer conditionat");
        Dacia Dokker = new Dacia("Dacia","Dokker","Manuala",25000, "negru",DotariExterioareDokker);
        Sandero.InfoDacia();


        System.out.println("==obiecteAudi==");
        List<String> DotariExterioareA3 = Arrays.asList("Geamuri electrice","aer conditionat");
        List<String> DotariInterioareA3 = Arrays.asList("Geamuri electrice","aer conditionat");
        Audi A3 = new Audi("Audi", "A3","manuala",14000,  DotariExterioareA3, DotariInterioareA3);
        A3.InfoAudi();


        List<String> DotariExterioareQ7 = Arrays.asList("Geamuri electrice","aer conditionat");
        List<String> DotariInterioareQ7 = Arrays.asList("Geamuri electrice","aer conditionat");
        Audi Q7= new Audi("Audi", "Q7","manuala",14000,  DotariExterioareQ7, DotariInterioareQ7);
        Q7.InfoAudi();


        System.out.println("==obiecteBMW==");


        BMW Seria3 = new BMW("BMW", "Seria3","manuala",34000, true);
        Seria3.InfoBMW();
        Seria3.ConducMasina();
        Seria3.AfisareMasini("masina");
        Seria3.AfisareMasini(123);


    }
}

