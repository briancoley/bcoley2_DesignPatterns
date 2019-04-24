/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.templatemethod;

public class TruckVehicle extends VehicleTemplate {

    public String getTraits() {
        return addMoreTraits(super.getTraits());
    }

    private String addMoreTraits(String data) {
        return data  + " Truck: ";
    }

    @Override
    public void placeAirFreshener() {
        System.out.println("Placing Evergreen air Freshener");
    }
    
    @Override
    public void paintFrame() {
        System.out.println("Painting Frame with Camouflage Paint");
    }
    
    @Override
    public void installDoors() {
        System.out.println("Installing Doors");
    }
    
    @Override
    public void installSeats() {
        System.out.println("Installing Plush Seats");
    }
    
    @Override
    public void attachTires() {
        System.out.println("Attaching Monster Truck Tires");
    }
}