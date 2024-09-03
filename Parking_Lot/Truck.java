public class Truck implements Vehicle{
    private String registrationNumber;
    private VehicleType type;
    Truck(String registrationNumber,VehicleType type){
        this.registrationNumber=registrationNumber;
        this.type=type;
    }
    @Override
    public VehicleType getVehicleType(){
        return type;
    }
    public String getVehicleRegistrationNumber(){
        return registrationNumber;
    }
}
