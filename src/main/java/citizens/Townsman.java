package citizens;

public class Townsman extends Citizen{

    public Townsman(String name) {
        super(name);
    }

    public boolean canvote() {
        return false;
    }
    @Override
    public boolean canVote(){
        boolean canVote = true;
        return canVote;
    }

    @Override
    public String toString() {
        return "Townsman named " +
                name + ".";
    }
}