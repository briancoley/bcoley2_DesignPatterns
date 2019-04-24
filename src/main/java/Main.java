/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java;

import java.util.Iterator;

import main.java.decoratorpattern.Vehicle;
import main.java.decoratorpattern.VehicleConcrete;
import main.java.decoratorpattern.VehicleDecorator;
import main.java.decoratorpattern.decorators.CheapDecorator;
import main.java.decoratorpattern.decorators.EfficientDecorator;
import main.java.decoratorpattern.decorators.SuperChargedDecorator;
import main.java.factorymethodpattern.Manufacturer;
import main.java.factorymethodpattern.ManufacturerFactory;
import main.java.factorymethodpattern.ManufacturerType;
import main.java.templatemethod.HybridVehicle;
import main.java.templatemethod.SportVehicle;
import main.java.templatemethod.TruckVehicle;
import main.java.templatemethod.VehicleTemplate;

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

        /*
         * The following Factory Method is called twice, but each time 
         * the type of factory to create is passed as an argument.
         */
        System.out.println("The following Factory Method is called, but each time" 
                + " the type of factory to create is passed as an argument.");
        Manufacturer chevyFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.CHEVY);
        System.out.println("This is the " + chevyFactory.getManufacturer() + " factory.");
        System.out.println();
        Manufacturer toyotaFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.TOYOTA);
        System.out.println("This is the " + toyotaFactory.getManufacturer() + " factory.");
        System.out.println();
        Manufacturer volkswagonFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        System.out.println("This is the " + volkswagonFactory.getManufacturer() + " factory.");
        System.out.println();

        /*
         * The following Decorator Methods are called in a few different 
         * orders, resulting in different vehicle decoration combinations.
         */
        System.out.println("Now we will create generic cars, but each time the car will "
                + "be decorated differently. The result should be vehicles with "
                + "different characteristics than the default class provides.");
        VehicleConcrete plainVehicle = new VehicleConcrete();
        System.out.println("Here is a default vehicle output - " + plainVehicle.getTraits());
        System.out.println("Notice it's traits are empty.");
        System.out.println("Vehicle 1: ");
        VehicleDecorator decoratedVehicle = 
                new EfficientDecorator(new CheapDecorator(new VehicleConcrete()));
        System.out.println(decoratedVehicle.getTraits());

        System.out.println("Vehicle 2: ");
        VehicleDecorator decoratedVehicle2 = 
                new CheapDecorator(new EfficientDecorator(new VehicleConcrete()));
        System.out.println(decoratedVehicle2.getTraits());

        System.out.println("Vehicle 3: ");
        VehicleDecorator decoratedVehicle3 = 
                new EfficientDecorator(new CheapDecorator(new SuperChargedDecorator(
                        new EfficientDecorator(new VehicleConcrete()))));
        System.out.println(decoratedVehicle3.getTraits());
        System.out.println();


        System.out.println("Now we will test our factory method. "
                + "We will build several cars and each will be built in "
                + "the same pattern (frame, then engine, then tires, etc.).");
        //Create truck and decorate it
        System.out.println();
        System.out.println("First we will create our Truck");
        VehicleTemplate truckVehicle = new TruckVehicle();
        truckVehicle.buildVehicle();
        System.out.println(truckVehicle.getTraits());
        System.out.println();

        //Create Sport and decorate it
        System.out.println();
        System.out.println("First we will create our Sport");
        VehicleTemplate sportVehicle = new SportVehicle();
        sportVehicle.buildVehicle();
        System.out.println(sportVehicle.getTraits());
        System.out.println();

        //Create Hybrid and decorate it
        System.out.println();
        System.out.println("First we will create our Sport");
        VehicleTemplate hybridVehicle = new HybridVehicle();
        hybridVehicle.buildVehicle();
        System.out.println(hybridVehicle.getTraits());
        System.out.println();

        System.out.println("Now we will mix our factory and decorator "
                + "by pumping the already created vehicle and decorating "
                + "it with new traits.");
        System.out.println("Current traits - " + truckVehicle.getTraits());
        System.out.println("Now we will decorate our Truck");
        VehicleDecorator decoratedTruck = 
                new SuperChargedDecorator(new EfficientDecorator(
                        new CheapDecorator(truckVehicle)));
        System.out.println(decoratedTruck.getTraits());
        System.out.println();

        System.out.println("Current traits - " + sportVehicle.getTraits());
        System.out.println("Now we will decorate our Sport");
        VehicleDecorator decoratedSport = 
                new SuperChargedDecorator(new SuperChargedDecorator(
                        new SuperChargedDecorator(sportVehicle)));
        System.out.println(decoratedSport.getTraits());
        System.out.println();

        System.out.println("Current traits - " + hybridVehicle.getTraits());
        System.out.println("Now we will decorate our Sport");
        VehicleDecorator decoratedHybrid = 
                new EfficientDecorator(new EfficientDecorator(
                        new EfficientDecorator(hybridVehicle)));
        System.out.println(decoratedHybrid.getTraits());
        System.out.println();


        System.out.println("Now we will add all the vehicles to the toyotaFactory "
                + "created above and list each vehicle with their traits.");
        toyotaFactory.getCarList().add(decoratedVehicle);
        toyotaFactory.getCarList().add(decoratedVehicle2);
        toyotaFactory.getCarList().add(decoratedVehicle3);
        toyotaFactory.getCarList().add(decoratedTruck);
        toyotaFactory.getCarList().add(decoratedSport);
        toyotaFactory.getCarList().add(decoratedHybrid);

        Iterator<Vehicle> carList = toyotaFactory.getCarList().iterator();

        while (carList.hasNext()) {
            System.out.println(toyotaFactory.getManufacturer() + " " + carList.next().getTraits());
        }

    }
}
