package citizens;

public abstract class Citizen {

    protected String name;

    protected Citizen(){

    }

    public Citizen(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote();

}
