package main.java;

import main.factorymethodpattern.*;

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

        
        System.out.println("Hello Assignment");
        System.out.println(ManufacturerFactory.buildManufacturer(ManufacturerType.TOYOTA));
        System.out.println(ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON));



    }
}
