package citizens;


public class Town {

    public static int howManyCanVote(Citizen[]citizensList){
        int howMany = 0;

        for (int i=0; i <citizensList.length ; i++) {
            if (citizensList[i].canVote()==true){
                howMany = howMany + 1;
            }

        }
        System.out.println("In our Town there are " + howMany + " citizens registered to vote");
        return howMany;

    }
    public static void whoCanVote(Citizen[]citizensList){
        for (int i=0; i < citizensList.length ; i++) {
            if (citizensList[i].canVote()==true){
                System.out.println(citizensList[i].toString());
            }

        }
    }
}

