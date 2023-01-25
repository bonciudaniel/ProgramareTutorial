package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Craciun {

    @Test

    public void MetodaTest(){
        //MultimeNumeArray();
        //MultimeLista();
        //MultimeValori();
        TariOrase();


    }
     //Array

    public void MultimeNumeArray(){
        String[] NumeCursanti = new String[7];
        NumeCursanti[0] = "Dani" ;
        NumeCursanti[1] = "Alex" ;
        NumeCursanti[2] = "Lili" ;
        NumeCursanti[3] = "Raul" ;
        NumeCursanti[4] = "Cristi" ;
        NumeCursanti[5] = "Florin" ;
        NumeCursanti[6] = "Bianca" ;

        for (Integer index=0 ; index<NumeCursanti.length; index++){

            System.out.println(NumeCursanti[index]);
        }
    }
    //Lista

    public void MultimeLista(){
        List<String> NumeCursanti = new ArrayList<>() ;
        NumeCursanti.add("Dani") ;
        NumeCursanti.add("Alex") ;
        NumeCursanti.add("Lili") ;
        NumeCursanti.add("Raul") ;
        for (Integer index=0; index <NumeCursanti.size(); index++){

            System.out.println(NumeCursanti.get(index));
        }
    }
    //hashamp - Def o lista cu mai multe categorii de itemi . Preferabil se face cu for each.
    //Key=Value


    public void MultimeValori(){

        //Fotbal , Cana, Acadea

        HashMap<String,String> Obiecte = new HashMap<>();
        Obiecte.put("Sport", "Fotbal") ;
        Obiecte.put("Obiect" , "Cana") ;
        Obiecte.put( "Dulciuri" , "Acadea") ;
        for (String Key : Obiecte.keySet()) {
            System.out.println(Key+ " " +Obiecte.get(Key));

        }
    }



    //Tari   Orase

    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Brasov");
        OraseRomania.add("Timisoara");
        OraseRomania.add("Oradea");
        List<String> OraseItalia= new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Venetia");
        List<String> OraseSpania= new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Valencia");
        OraseSpania.add("Madrid");

        HashMap<String,List<String>> Tari = new HashMap<>();

        Tari.put("Romania",OraseRomania);
        Tari.put("Italia" , OraseItalia) ;
        Tari.put("Spania", OraseSpania) ;

        for (String Key : Tari.keySet()) {
            System.out.println(Key+ " " +Tari.get(Key));

        }

    }


}


