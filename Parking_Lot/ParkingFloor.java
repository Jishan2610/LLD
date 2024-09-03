import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
abstract class InnerParkingFloor {

    
}
public class ParkingFloor {
    private int floorNumber;
    private int capacity;
    Map<ParkingSpotType,List<ParkingSpot>> parkingSpots;

    ParkingFloor(int floorNumber, int capacity) {
        this.floorNumber = floorNumber;
        this.capacity = capacity;
        this.parkingSpots = new HashMap<>();
       

    }

    public int getFloorNumber() {
        return this.floorNumber;
    }
    
    public void addSpot(ParkingSpotType type,int capacity){

        List<ParkingSpot> spots = this.parkingSpots.getOrDefault(type, new ArrayList<ParkingSpot>());
         for(int i = 0; i < capacity; i++){
            spots.add(ParkingSpotFactory.getParkingSpot(type, this.floorNumber));
         } 
        parkingSpots.put(type, spots);
    }
    public List<ParkingSpot> getAvailableParkingSpots(ParkingSpotType type) {
        List<ParkingSpot> availableSpots = new ArrayList<>();

        for (ParkingSpot parkingSpot : this.parkingSpots.get(type)) {
            if (parkingSpot.isAvailable()) {
                availableSpots.add(parkingSpot);
            }
        }
        
        return availableSpots;
    }
    
    public List<ParkingSpot> getUnavailableParkingSpots(ParkingSpotType type) {
        List<ParkingSpot> unavailableSpots = new ArrayList<>();

        for (ParkingSpot parkingSpot : this.parkingSpots.get(type)) {
            if (!parkingSpot.isAvailable()) {
                unavailableSpots.add(parkingSpot);
            }
        }
        
        return unavailableSpots;
    }

    
}
