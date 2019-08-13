package obslugaZamowien;

public class Pozycja {

    private String nazwaTowaru;
    private double iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, double iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public double getIloscSztuk() { return iloscSztuk; }

    public void setIloscSztuk(double iloscSztuk) { this.iloscSztuk = iloscSztuk; }

    public double getCenaSztuki() {return cenaSztuki; }

    public void setCenaSztuki(double cenaSztuki) { this.cenaSztuki = cenaSztuki; }

    public double obliczWarosc(){
        return getIloscSztuk()*getCenaSztuki();
    }

    @Override
    public String toString() {
        return  nazwaTowaru + "\t" + getCenaSztuki() + "\t" + getIloscSztuk() + " szt. \t" + obliczWarosc() + " zł";
    }
}
