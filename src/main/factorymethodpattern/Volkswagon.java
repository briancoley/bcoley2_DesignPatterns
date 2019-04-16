/**
 * @author brian
 * @version 20190416
 *
 */

package main.factorymethodpattern;

public class Volkswagon extends Manufacturer {

    Volkswagon() {
        super(ManufacturerType.TOYOTA);
        subclassCreate();
    }

    @Override
    protected void subclassCreate() {
        System.out.println("Building Toyota");

    }

}
