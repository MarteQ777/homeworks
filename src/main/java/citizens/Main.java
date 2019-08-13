package citizens;

public class Main {
    public static void main(String[] args) {


        Peasant peasant1=new Peasant("Vladymir");
        Peasant peasant=new Peasant("Karina");
        Townsman townsman=new Townsman("Harold");
        Townsman townsman1=new Townsman("Brigide");
        King king=new King("King");
        King queen=new King("Queen");
        Soldier soldier=new Soldier("Furious");
        Soldier soldier1=new Soldier("Drago");
        Soldier soldier2 = new Soldier("Krakenhead");

        Citizen[] citizensList = new Citizen[]{peasant, peasant1, townsman, townsman1, king, queen, soldier, soldier1, soldier2};

        Town.howManyCanVote(citizensList);
        Town.whoCanVote(citizensList);
    }
}
