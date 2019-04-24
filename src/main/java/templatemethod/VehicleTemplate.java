/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.templatemethod;

import main.java.decoratorpattern.Vehicle;
import main.java.decoratorpattern.VehicleConcrete;

public abstract class VehicleTemplate extends VehicleConcrete implements Vehicle {

    @Override
    public String getTraits() {
        return "Traits: ";
    }

    /** Template for building a generic vehicle.
     */
    public final void buildVehicle() {
        createFrame();
        insertEngine();
        attachTires();
        installSeats();
        installDoors();
        paintFrame();
        placeAirFreshener();
    }

    public abstract void placeAirFreshener();

    public abstract void paintFrame();

    public abstract void installDoors();

    public abstract void installSeats();

    public abstract void attachTires();

    /**
     * All vehicles will have an engine inserted.
     */
    private final void insertEngine() {
        System.out.println("Engine inserted.");
    }

    /**
     * All vehicles will have a frame to attach to.
     */
    private final void createFrame() {
        System.out.println("Frame has been constructed.");
    }
}
