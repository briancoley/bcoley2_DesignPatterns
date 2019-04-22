package main.java.decoratorpattern.decorators;

import main.java.decoratorpattern.Vehicle;
import main.java.decoratorpattern.VehicleDecorator;

public class EfficientDecorator extends VehicleDecorator {

	public EfficientDecorator (Vehicle vehicle) {
        super(vehicle);
    }
 
    public String getTraits() {
        return addMoreTraits (super.getTraits()) ;
    }
     
    private String addMoreTraits(String data){
        return data  + " Efficient ";
    }
    
}
