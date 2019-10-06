package car;

public interface Car {

 String getModel();
 int getHorsePower();
 EngineType getEngineType();
 default boolean isBroken(){return false;}
 boolean getBroken();
 void setBroken(boolean broken);
 void startEngine();
 void fixCar();


}
