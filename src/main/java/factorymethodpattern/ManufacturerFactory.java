/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.factorymethodpattern;

public class ManufacturerFactory {
    /** Method to create a particular manufacturer based on manufacturer name.
     * @param manufacturerType Manufacturer Name
     * @return
     */
    public static Manufacturer buildManufacturer(ManufacturerType manufacturerType) {
        Manufacturer manufacturer = null;
        switch (manufacturerType) {
            case VOLKSWAGON:
                manufacturer = new Volkswagon();
                break;
            case TOYOTA:
                manufacturer = new Toyota();
                break;
            case CHEVY:
                manufacturer = new Chevy();
                break;
            default:
                System.out.println("Manufacturer Doesn't Exist!!!");
                break;
        }
        return manufacturer;
    }
}
