public class Motorbike implements Vehicle{
    private String registrationNumber;
    private VehicleType type;
    Motorbike(String registrationNumber,VehicleType type){
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
