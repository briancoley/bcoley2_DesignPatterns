package test.java;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import main.java.decoratorpattern.Vehicle;
import main.java.decoratorpattern.VehicleConcrete;
import main.java.decoratorpattern.VehicleDecorator;
import main.java.decoratorpattern.decorators.CheapDecorator;
import main.java.decoratorpattern.decorators.EfficientDecorator;
import main.java.factorymethodpattern.Manufacturer;
import main.java.factorymethodpattern.ManufacturerFactory;
import main.java.factorymethodpattern.ManufacturerType;

import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryUnitTest {
    
    enum TestEnum { DRAGON }
    
    @Before
    public void setUp() throws Exception {
    }

    // Test case to test set_points changes vs addStudent
    @Test
    public void assertTest() {
        System.out.println("Testing");
        assertTrue(true);
    }
    
    // Test Toyota Manufacturer
    @Test public void buildToyotaManufacturer() {
        Manufacturer testFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.TOYOTA);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.TOYOTA);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.TOYOTA));
    }
    
    // Test Volkswagon Manufacturer
    @Test public void buildVolkswagonManufacturer() {
        Manufacturer testFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.VOLKSWAGON);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.VOLKSWAGON));
    }
    
    // Test Set Manufacturer
    @Test public void setManufacturer() {
        Manufacturer testFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.VOLKSWAGON));
        testFactory.setManufacturer(ManufacturerType.TOYOTA);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.TOYOTA);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.TOYOTA));
    }
    
    // Test Default Manufacturer
    @Test public void nonExistantManufacturer() {
        Manufacturer testFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.DEFAULT);
        assertNull(testFactory);
    }
    
    // Test default traits
    @Test public void defaultConcreteTraits() {
        VehicleConcrete vehicleConcrete = new VehicleConcrete();
        assertTrue(vehicleConcrete.getTraits().equalsIgnoreCase("Traits: "));
    }
    
 // Test default traits
    @Test public void testDecoratedTraits() {
        VehicleDecorator vehicleDecorator = new CheapDecorator(new EfficientDecorator(new VehicleConcrete()));
        System.out.println(vehicleDecorator.getTraits());
        assertTrue(vehicleDecorator.getTraits().equalsIgnoreCase("Traits:  Efficient  Cheap "));
    }
}
