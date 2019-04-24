/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.decoratorpattern;

/**
 * Class creates VehicleDecorator for decorating Vehicle objects.
 */
public class VehicleDecorator implements Vehicle {

    private Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.decoratedVehicle = vehicle;
    }

    public String getTraits() {
        return decoratedVehicle.getTraits();
    }

}
