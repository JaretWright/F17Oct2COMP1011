
package f17oct2comp1011;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class HourlyEmployeeTest {
    private HourlyEmployee validEmp;
    
    public HourlyEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validEmp = new HourlyEmployee(30.00, "Wes", "BossMan", "999 123 456",
                                 "Strategic Toilet Scrubber", 
                                 LocalDate.of(1997, 02, 03));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHourlyRate method, of class HourlyEmployee.
     */
    @Test
    public void testGetHourlyRate() {
        double expResult = 30.0;
        double result = validEmp.getHourlyRate();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHourlyRate method, of class HourlyEmployee.
     */
    @Test
    public void testSetHourlyRate() {
        System.out.println("setHourlyRate");
        double hourlyRate = 0.0;
        HourlyEmployee instance = null;
        instance.setHourlyRate(hourlyRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getHoursWorked();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testSetHoursWorked() {
        System.out.println("setHoursWorked");
        double hoursWorked = 0.0;
        HourlyEmployee instance = null;
        instance.setHoursWorked(hoursWorked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePay method, of class HourlyEmployee.
     */
    @Test
    public void testCalculatePay() {
        System.out.println("calculatePay");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.calculatePay();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
