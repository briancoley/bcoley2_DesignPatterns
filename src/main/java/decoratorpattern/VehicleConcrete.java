/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.decoratorpattern;

/**
 * Class creates Vehicle Concrete Objects.
 */
public class VehicleConcrete implements Vehicle {

    @Override
    public String getTraits() {
        return "Traits: ";
    }

}
