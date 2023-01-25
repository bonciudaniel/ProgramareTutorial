package AbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceTest {

    @Test
     public void metodaTest(){

        Angajat Angajat1 = new Angajat("Ionut", "Brasov",28);
        Angajat1.munceste();

        Student student1 = new Student("Dani","Brasov",25);
        student1.invata();

        AngajatStudent angajatStudent = new AngajatStudent("Maria","Brasov",28);
       angajatStudent.munceste();
       angajatStudent.invata();



    }
}
