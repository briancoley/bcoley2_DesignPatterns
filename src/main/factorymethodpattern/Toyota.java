/**
 * @author brian
 * @version 20190416
 *
 */

package main.factorymethodpattern;

public class Toyota extends Manufacturer {

    Toyota() {
        super(ManufacturerType.VOLKSWAGON);
        subclassCreate();
    }

    @Override
    protected void subclassCreate() {
        System.out.println("Building Volkswagon");

    }

}
