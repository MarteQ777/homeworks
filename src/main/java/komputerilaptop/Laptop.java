package komputerilaptop;

public class Laptop extends Komputer{
    protected Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;


    }

    double wielkoscMatrycy;
    boolean czyPosiadaRetine;

    public void setWielkoscMatrycy(double wielkoscMatrycy){
        this.wielkoscMatrycy = wielkoscMatrycy;

    }
    public void setCzyPosiadaRetine(boolean czyPosiadaRetine){
        this.czyPosiadaRetine = czyPosiadaRetine;

    }

    @Override
    public String toString() {
        return "Rodzaj sprzętu: Laptop, producent: " + getProducent() +
                ", typ procesora" + getTypProcesora() + " zapotrzebowanie na moc: " + getPotrzebnaMoc() + " wielkość matrycy " + wielkoscMatrycy;
    }
}
