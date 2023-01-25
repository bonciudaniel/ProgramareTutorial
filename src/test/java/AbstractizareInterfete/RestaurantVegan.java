package AbstractizareInterfete;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface{
    public RestaurantVegan(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }


    @Override
    public void cresteLegume() {
        System.out.println("Acest restaurant cultiva legume");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Acest restaurant cumpara zarzavat pentru uz intern");

    }

    @Override
    public void preparaLegume() {
        System.out.println("Acest restaurant prepara legume pentru retete");
    }
}
