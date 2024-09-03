public class EntryGate implements Gate {
    private String id;
    

    EntryGate(){
        this.id = String.valueOf(Math.random());
       
    }

    @Override
    public String getId(){
        return id;
    }

   

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot ps){
        return new Ticket(vehicle, ps);
    }
}
