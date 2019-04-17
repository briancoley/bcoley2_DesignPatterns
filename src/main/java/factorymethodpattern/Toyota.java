/**
 * @author brian
 * @version 20190416
 *
 */

package main.java.factorymethodpattern;

public class Toyota extends Manufacturer {

    Toyota() {
        super(ManufacturerType.TOYOTA);
        subclassCreate();
    }

    @Override
    protected void subclassCreate() {
        System.out.println("Building Toyota");

    }

}
