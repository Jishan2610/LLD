public class ParkingSpotFactory {
    public static ParkingSpot getParkingSpot(ParkingSpotType type, int floor) {
        if (type == ParkingSpotType.BIKE)
            return new BikeParkingSpot(null, floor);
        else if (type == ParkingSpotType.TRUCK)
            return new TruckSpot(null, floor);
        else if (type == ParkingSpotType.CAR)
            return new CarSpot(null, floor);

        return null;
    }
}
