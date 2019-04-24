/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.templatemethod;

public class SportVehicle extends VehicleTemplate {

    public String getTraits() {
        return addMoreTraits(super.getTraits());
    }

    private String addMoreTraits(String data) {
        return data  + " Sport: ";
    }

    @Override
    public void placeAirFreshener() {
        System.out.println("Placing WinterMint air Freshener");
    }
    
    @Override
    public void paintFrame() {
        System.out.println("Painting Frame with Speed Stripe");
    }
    
    @Override
    public void installDoors() {
        System.out.println("Installing Carbon-Fiber Doors");
    }
    
    @Override
    public void installSeats() {
        System.out.println("Installing Bucket Seats");
    }
    
    @Override
    public void attachTires() {
        System.out.println("Attaching Wide Tires");
    }
}