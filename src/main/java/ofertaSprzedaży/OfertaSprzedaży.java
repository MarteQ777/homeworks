package ofertaSprzedaży;

public class OfertaSprzedaży {

    private String nazwaProduktu;
    private double cena;

    public OfertaSprzedaży(String nazwaProduktu, double cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
    }
    public OfertaSprzedaży(){

    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "OfertaSprzedaży{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                '}';
    }
}
