public class ElectricCar implements Vehicle{
    private String registrationNumber;
    private VehicleType type;
    ElectricCar(String registrationNumber,VehicleType type){
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
