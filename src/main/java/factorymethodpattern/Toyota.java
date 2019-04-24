/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.factorymethodpattern;

import main.java.decoratorpattern.VehicleConcrete;
import main.java.decoratorpattern.decorators.CheapDecorator;
import main.java.decoratorpattern.decorators.EfficientDecorator;

public class Toyota extends Manufacturer {

    Toyota() {
        super(ManufacturerType.TOYOTA);
        subclassCreate();
    }

    @Override
    protected void subclassCreate() {
        System.out.println("Building Toyota");

    }

}
