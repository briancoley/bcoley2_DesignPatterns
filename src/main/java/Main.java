package main.java;

import main.java.decoratorpattern.VehicleConcrete;
import main.java.decoratorpattern.VehicleDecorator;
import main.java.decoratorpattern.decorators.CheapDecorator;
import main.java.decoratorpattern.decorators.EfficientDecorator;
import main.java.factorymethodpattern.Manufacturer;
import main.java.factorymethodpattern.ManufacturerFactory;
import main.java.factorymethodpattern.ManufacturerType;

/**
 * Class: Main.
 * @author bcoley2
 * @version 20190415
 */
public class Main {

    /**
     * Method: Main This is the main method.
     * @param args Standard Arguments for a main class
     * @throws Exception Throws Exception
     */
    public static void main(String[] args)throws Exception {

        /**
         * The following Factory Method is called twice, but each time 
         * the type of factory to create is passed as an argument.
         */
        System.out.println("The following Factory Method is called, but each time" 
            + " the type of factory to create is passed as an argument.");
        Manufacturer toyotaFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.TOYOTA);
        System.out.println("This is the " + toyotaFactory.getManufacturer() + " factory.");
        Manufacturer volkswagonFactory;
        volkswagonFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        System.out.println("This is the " + volkswagonFactory.getManufacturer() + " factory.");
        
        System.out.println("Now we will create cars, but each time the car will "
                + "be decorated differently. The result should be vehicles with "
                + "different characteristics than the default class provides.");
        VehicleDecorator decoratedVehicle = new EfficientDecorator(new CheapDecorator(new VehicleConcrete()));
        System.out.println(decoratedVehicle.getTraits());
        VehicleDecorator decoratedVehicle2 = new CheapDecorator(new EfficientDecorator(new VehicleConcrete()));
        System.out.println(decoratedVehicle2.getTraits());
        VehicleDecorator decoratedVehicle3 = new EfficientDecorator( new CheapDecorator(new CheapDecorator( new EfficientDecorator(new VehicleConcrete()))));
        System.out.println(decoratedVehicle3.getTraits());

    }
}
