package main.java.decoratorpattern;

public class VehicleDecorator implements Vehicle {

	private Vehicle decoratedVehicle;
    
    public VehicleDecorator(Vehicle vehicle){
        this.decoratedVehicle = vehicle;
    }
     
    public String getTraits() {
        return decoratedVehicle.getTraits();
    }
    
}
