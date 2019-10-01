package car;

public interface Car {
 String getModel();
 int getHorsePower();
 EngineType getEngineType();
 default boolean isBroken(){return false;}
 void startEngine();

}
