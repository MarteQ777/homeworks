package druzynaPilkarska;

import java.util.Comparator;

public class DruzynaPilkarska {

    private String nazwa;
    private int liczbaPunktow;
    private int wygrane;
    private int zremisowane;
    private int przegrane;
    private int strzelone;
    private int stracone;

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczbaPunktow() {
        return liczbaPunktow;
    }

    public int getWygrane() {
        return wygrane;
    }

    public int getZremisowane() {
        return zremisowane;
    }

    public int getPrzegrane() {
        return przegrane;
    }

    public int getStrzelone() {
        return strzelone;
    }

    public int getStracone() {
        return stracone;
    }

    public DruzynaPilkarska(String nazwa, int liczbaPunktow, int wygrane, int zremisowane, int przegrane, int strzelone, int stracone) {
        this.nazwa = nazwa;
        this.liczbaPunktow = liczbaPunktow;
        this.wygrane = wygrane;
        this.zremisowane = zremisowane;
        this.przegrane = przegrane;
        this.strzelone = strzelone;
        this.stracone = stracone;
    }

    @Override
    public String toString() {
        return "DruzynaPilkarska{" +
                "nazwa='" + nazwa + '\'' +
                ", liczbaPunktow=" + liczbaPunktow +
                ", wygrane=" + wygrane +
                ", zremisowane=" + zremisowane +
                ", przegrane=" + przegrane +
                ", strzelone=" + strzelone +
                ", stracone=" + stracone +
                '}';
    }
}
