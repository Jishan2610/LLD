public abstract class ParkingSpot {
    private String spotId;
    private Boolean isEmpty;
    private String vehicleRegistrationNumber="";
    private int floorNumber;
    ParkingSpot(String spotId,int floorNumber){
        this.spotId=spotId;
        this.floorNumber=floorNumber;
    }
    public String getSpotId(){
        return spotId;
    }
    public int getFloorNumber(){
        return floorNumber;
    }
    public boolean isAvailable(){
        return isEmpty;
    }
    public void assignVehicle(String vehicleRegistrationNumber){
        isEmpty=false;
        this.vehicleRegistrationNumber=vehicleRegistrationNumber;
        
    }
    public void removeVehicle(){
        isEmpty=true;
        vehicleRegistrationNumber="";
    }

}
