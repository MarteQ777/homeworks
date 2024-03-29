package olimpicData;

import lombok.Builder;

import java.util.List;

@Builder
public class OlimpicsData {

private String countryShortName;
private int goldMedals;
private int silverMedals;
private int bronzeMedals;
private int fourthPlace;

    public OlimpicsData(String countryShortName, int goldMedals, int silverMedals, int bronzeMedals, int fourthPlace) {
        this.countryShortName = countryShortName;
        this.goldMedals = goldMedals;
        this.silverMedals = silverMedals;
        this.bronzeMedals = bronzeMedals;
        this.fourthPlace = fourthPlace;
    }
    public OlimpicsData(){}

    public String getCountryShortName() {
        return countryShortName;
    }

    public int getGoldMedals() {
        return goldMedals;
    }

    public int getSilverMedals() {
        return silverMedals;
    }

    public int getBronzeMedals() {
        return bronzeMedals;
    }

    public int getFourthPlace() {
        return fourthPlace;
    }

  //  public int getTotalAmountOfMedals(){
  //      return getGoldMedals()+getSilverMedals()+getBronzeMedals();
  //  }
    public int getPointsFromMedals(){
        return getGoldMedals()*3 + getSilverMedals()*2 + getBronzeMedals();

    }

}

