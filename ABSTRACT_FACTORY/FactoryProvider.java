package ABSTRACT_FACTORY;

public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){   
        if(factoryType.equalsIgnoreCase("Car")) {
            return new CarFactory();         
        }
        else if(factoryType.equalsIgnoreCase("Bike")) {
            return new BikeFactory();
        } else {
            return new CarFactory();
        }
    }
}

