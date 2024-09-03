import java.util.List;

public class ParkingLot {
   private List<ParkingFloor> parkingFloors;
   private List<Gate> entryGates;
   private List<Gate> exitGates;
   private int floors;
   private int gates = 4; 
   
   
   
   ParkingLot(int floors){
     this.floors = floors;
     for(int i = 0; i < floors; i++){
        parkingFloors.add(new ParkingFloor(i, 50));
     }
     for(int i = 0;i < this.gates; i++){
         entryGates.add(new EntryGate());
         exitGates.add(new ExitGate());

      }  
   }
   
   public Ticket vehicleEntry(int gateNumber,Vehicle vehicle){
     ParkingSpot ps = null;
      return ((EntryGate)entryGates.get(gateNumber)).generateTicket(vehicle,ps);
   }
   



   
}