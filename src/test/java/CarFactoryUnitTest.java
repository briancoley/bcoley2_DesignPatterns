/**
 * @author bcoley2
 * @version 20190423
 *
 */

package test.java;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import main.java.Main;
import main.java.decoratorpattern.Vehicle;
import main.java.decoratorpattern.VehicleConcrete;
import main.java.decoratorpattern.VehicleDecorator;
import main.java.decoratorpattern.decorators.CheapDecorator;
import main.java.decoratorpattern.decorators.EfficientDecorator;
import main.java.decoratorpattern.decorators.SuperChargedDecorator;
import main.java.factorymethodpattern.Manufacturer;
import main.java.factorymethodpattern.ManufacturerFactory;
import main.java.factorymethodpattern.ManufacturerType;
import main.java.templatemethod.HybridVehicle;
import main.java.templatemethod.SportVehicle;
import main.java.templatemethod.TruckVehicle;
import main.java.templatemethod.VehicleTemplate;

import org.junit.Before;
import org.junit.Test;

public class CarFactoryUnitTest {

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
    @Test
    public void buildToyotaManufacturer() {
        Manufacturer testFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.TOYOTA);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.TOYOTA);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.TOYOTA));
    }

    // Test Volkswagon Manufacturer
    @Test
    public void buildVolkswagonManufacturer() {
        Manufacturer testFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.VOLKSWAGON);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.VOLKSWAGON));
    }

    // Test Chevy Manufacturer
    @Test
    public void buildChevyManufacturer() {
        Manufacturer testFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.CHEVY);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.CHEVY);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.CHEVY));
    }

    // Test Set Manufacturer
    @Test
    public void setManufacturer() {
        Manufacturer testFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.VOLKSWAGON));
        testFactory.setManufacturer(ManufacturerType.TOYOTA);
        System.out.println(testFactory.getManufacturer());
        System.out.println(ManufacturerType.TOYOTA);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.TOYOTA));
    }

    // Test Manufacturer Carlist
    @Test
    public void checkCarList() {
        Manufacturer testFactory = 
                ManufacturerFactory.buildManufacturer(ManufacturerType.VOLKSWAGON);
        assertTrue(testFactory.getManufacturer().equals(ManufacturerType.VOLKSWAGON));
        int carListSize = testFactory.getCarList().size();
        testFactory.getCarList().add(new VehicleConcrete());
        assertTrue(testFactory.getCarList().size() == carListSize + 1);
        assertTrue(testFactory.getCarList().get(0).getTraits().equalsIgnoreCase("Traits: "));
    }

    // Test Default Manufacturer
    @Test
    public void nonExistantManufacturer() {
        Manufacturer testFactory = ManufacturerFactory.buildManufacturer(ManufacturerType.DEFAULT);
        assertNull(testFactory);
    }

    // Test default traits
    @Test public void defaultConcreteTraits() {
        VehicleConcrete vehicleConcrete = new VehicleConcrete();
        assertTrue(vehicleConcrete.getTraits().equalsIgnoreCase("Traits: "));
    }

    // Test default traits
    @Test
    public void testDecoratedTraits() {
        VehicleDecorator vehicleDecorator = new SuperChargedDecorator(new CheapDecorator(
                new EfficientDecorator(new VehicleConcrete())));
        System.out.println(vehicleDecorator.getTraits());
        assertTrue(vehicleDecorator.getTraits().equalsIgnoreCase("Traits:  Efficient  Cheap  SuperCharged "));
    }

    // Test Hybrid Vehicle
    @Test
    public void testHybrid() {
        HybridVehicle hybridVehicle = new HybridVehicle();
        assertTrue(hybridVehicle.getTraits().equalsIgnoreCase("Traits:  Hybrid: "));
    }

    // Test Sport Vehicle
    @Test
    public void testSport() {
        SportVehicle sportVehicle = new SportVehicle();
        assertTrue(sportVehicle.getTraits().equalsIgnoreCase("Traits:  Sport: "));
    }

    // Test Truck Vehicle
    @Test
    public void testTruck() {
        TruckVehicle truckVehicle = new TruckVehicle();
        assertTrue(truckVehicle.getTraits().equalsIgnoreCase("Traits:  Truck: "));
    }

    // Test VehicleTemplate Vehicle
    @Test
    public void testVehicleTemplate() {
        VehicleTemplate vehicleTemplate = new SportVehicle();
        assertTrue(vehicleTemplate.getTraits().equalsIgnoreCase("Traits:  Sport: "));
        vehicleTemplate.buildVehicle();
    }
}
