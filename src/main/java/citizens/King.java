package citizens;

public class King extends Citizen {

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote(){
        boolean canVote = false;
        return canVote;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}

