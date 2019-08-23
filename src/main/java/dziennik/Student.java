package dziennik;

import java.util.LinkedList;
import java.util.List;

public class Student {

    private List <Double> listaOcen;
    private String nrIndexu;
    private String imie;
    private String nazwisko;

    public Student(List listaOcen, String nrIndexu, String imie, String nazwisko) {
        this.listaOcen = listaOcen;
        this.nrIndexu = nrIndexu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public List<Double> getListaOcen() { return listaOcen; }
    public String getNrIndexu() { return nrIndexu; }
    public String getImie() { return imie;}
    public String getNazwisko(){return nazwisko;}

    @Override
    public String toString() {
        return "Student{" +
                "nrIndexu='" + nrIndexu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}


