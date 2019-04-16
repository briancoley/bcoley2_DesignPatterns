/**
 * @author brian
 * @version 20190416
 *
 */

package main.factorymethodpattern;

public abstract class Manufacturer {

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

}
