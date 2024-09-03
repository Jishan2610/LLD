package ABSTRACT_FACTORY;

public class Main {
    public static void main(String[] args) {
        int distance = 10;

        /*
        * Book a Mini Car for a distance of 10 kms
        */
        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
        Vehicle miniCar = carFactory.getVehicle("Mini");
        miniCar.book(distance);



        /*
        * Book a Sports Bike for a distance of 10 km
        //GIT
        */
        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");
        Vehicle sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);

    }
}

