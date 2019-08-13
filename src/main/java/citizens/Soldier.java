package citizens;

public class Soldier extends Citizen {

    public Soldier(String name) {
        super(name);
    }

    @Override
    public boolean canVote(){
        boolean canVote = true;
        return canVote;
    }

    @Override
    public String toString() {
        return "Soldier named " +
                name + ".";
    }
}

