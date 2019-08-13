package citizens;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    public boolean canvote() {
        return false;
    }

    @Override
    public boolean canVote() {
        boolean canVote = false;
        return canVote;
    }

    @Override
    public String toString() {
        return "Peasant{" +
                "name='" + name + '\'' +
                '}';
    }
}

