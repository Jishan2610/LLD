public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private String entryTime;

    Ticket(Vehicle vehicle, ParkingSpot parkingSpot){
        this.ticketId = String.valueOf(Math.random());
        this.vehicle=vehicle;
        this.parkingSpot=parkingSpot;
        this.entryTime = "current_time" + Math.random();
    }

    public String getEntryTime() {
        return this.entryTime;
    }
}
