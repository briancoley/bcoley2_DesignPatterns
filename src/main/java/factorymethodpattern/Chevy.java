/**
 * @author bcoley2
 * @version 20190423
 *
 */

package main.java.factorymethodpattern;

public class Chevy extends Manufacturer {

    Chevy() {
        super(ManufacturerType.CHEVY);
        subclassCreate();
    }

    @Override
    protected void subclassCreate() {
        System.out.println("Building Chevy");

    }

}
