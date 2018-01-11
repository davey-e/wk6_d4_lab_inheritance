import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Joe Bloggs", "AB1234567C", 50000);
    }

    @Test
    public void hasName(){
        assertEquals("Joe Bloggs", employee.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("AB1234567C", employee.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, employee.getSalary(), 0.01);
    }


}
