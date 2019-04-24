/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.decoratorpattern.decorators;

import main.java.decoratorpattern.Vehicle;
import main.java.decoratorpattern.VehicleDecorator;

public class CheapDecorator extends VehicleDecorator {

    public CheapDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    public String getTraits() {
        return addMoreTraits(super.getTraits());
    }

    private String addMoreTraits(String data) {
        return data  + " Cheap ";
    }

}
