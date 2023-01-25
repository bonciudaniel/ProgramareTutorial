package AbstractizareInterfete;

public class Restaurant {

    private String denumire;
    private String FelPrincipal;
    private Integer numarStele;

    public Restaurant(String denumire, String felPrincipal, Integer numarStele) {
        this.denumire = denumire;
        FelPrincipal = felPrincipal;
        this.numarStele = numarStele;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getFelPrincipal() {
        return FelPrincipal;
    }

    public void setFelPrincipal(String felPrincipal) {
        FelPrincipal = felPrincipal;
    }

    public Integer getNumarStele() {
        return numarStele;
    }

    public void setNumarStele(Integer numarStele) {
        this.numarStele = numarStele;
    }
}
