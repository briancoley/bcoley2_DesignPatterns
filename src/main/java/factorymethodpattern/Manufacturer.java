/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.factorymethodpattern;

import java.util.ArrayList;

import main.java.decoratorpattern.Vehicle;

public abstract class Manufacturer {

    protected ArrayList<Vehicle> carList = new ArrayList<Vehicle>();

    /** Sets initial manufacturer type and then creates company object.
     * @param manufacturer Manufacturer Name
     */
    public Manufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
        createCompany();
    }

    private void createCompany() {
        // Need to add any overall company attributes
    }

    // Do subclass level processing in this method
    protected abstract void subclassCreate();

    private ManufacturerType manufacturer = null;

    /** Gets manufacturer for this manufacturer.
     * @return ManufacturerType
     */
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** Sets manufacturer for this manufacturer.
     * @param manufacturer Manufacturer Name
     */
    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<Vehicle> getCarList() {
        return carList;
    }

    public void buildCar(Vehicle vehicle) {

    }

}
