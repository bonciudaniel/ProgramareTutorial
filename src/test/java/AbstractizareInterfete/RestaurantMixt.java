package AbstractizareInterfete;

public class RestaurantMixt extends Restaurant implements RestaurantCarneInterface,RestaurantVeganInterface{
    public RestaurantMixt(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void cumparamCarne() {
        System.out.println("Cumparam carne pentru retetele mixt");
    }

    @Override
    public void cresteAnimale() {
        System.out.println("Creste Animale pentru retetele mixt");
    }

    @Override
    public void preparaCarne() {
        System.out.println("Prepara carne pentru retetele mixt");
    }

    @Override
    public void cresteLegume() {
        System.out.println("Creste legume pentru  retetele mixt");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat pentru retetele mixt");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara Legume pentru retetele mixt ");
    }
}
