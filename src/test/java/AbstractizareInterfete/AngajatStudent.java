package AbstractizareInterfete;

public class AngajatStudent extends Persoana implements InterfaceAngajat, InterfaceStudent{
    public AngajatStudent(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }


    @Override
    public void munceste() {
        System.out.println("Angajatul Student munceste");
    }

    @Override
    public void primestesalariu() {
        System.out.println("Angajatul Student primeste bani");

    }

    @Override
    public void mergeacasa() {
        System.out.println("Angajatul Student merge acasa");

    }

    @Override
    public void invata() {
        System.out.println("Angajatul Student invata");

    }

    @Override
    public void doarme() {
        System.out.println("Angajatul Student doarme");

    }

    @Override
    public void primestebursa() {
        System.out.println("Angajatul Student primeste bani");

    }
}
