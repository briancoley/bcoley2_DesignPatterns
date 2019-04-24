/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.templatemethod;

public class HybridVehicle extends VehicleTemplate {

    public String getTraits() {
        return addMoreTraits(super.getTraits());
    }

    private String addMoreTraits(String data) {
        return data  + " Hybrid: ";
    }

    @Override
    public void placeAirFreshener() {
        System.out.println("Placing environmentally safe air Freshener");
    }
    
    @Override
    public void paintFrame() {
        System.out.println("Painting Frame with Non-Toxic Paint");
    }
    
    @Override
    public void installDoors() {
        System.out.println("Installing Free-Range Doors");
    }
    
    @Override
    public void installSeats() {
        System.out.println("Installing Hemp Fiber Seats");
    }
    
    @Override
    public void attachTires() {
        System.out.println("Attaching Recycled Rubber Tires");
    }
}