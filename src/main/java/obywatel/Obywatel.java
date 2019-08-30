package obywatel;

public class Obywatel {

    private String pesel;
    private String imie;
    private String nazwisko;

    public Obywatel(String pesel,  String imie, String nazwisko) {
        this.pesel = pesel;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }
    public Obywatel(){

    }

    public String getPesel() { return pesel; }
    public String getNazwisko() { return nazwisko;}
    public String getImie() { return imie; }

    @Override
    public String toString() {
        return "Obywatel{" +
                "pesel='" + pesel + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}
