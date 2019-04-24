/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.factorymethodpattern;

public class Volkswagon extends Manufacturer {

    Volkswagon() {
        super(ManufacturerType.VOLKSWAGON);
        subclassCreate();
    }

    @Override
    protected void subclassCreate() {
        System.out.println("Building Volkswagon");

    }

}
