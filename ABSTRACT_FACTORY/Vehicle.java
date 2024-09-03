package ABSTRACT_FACTORY;
public interface Vehicle {
    void book(int distance);
    void setVehicleType();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);
}
