package main.java;

import main.factorymethodpattern.Manufacturer;
import main.factorymethodpattern.ManufacturerFactory;
import main.factorymethodpattern.ManufacturerType;

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
        Manufacturer volkswagonFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        System.out.println("This is the " + volkswagonFactory.getManufacturer() + " factory.");


    }
}
