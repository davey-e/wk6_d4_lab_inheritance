import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dba;

    @Before
    public void before(){
        dba = new DatabaseAdmin("Joe Bloggs", "AB1234567C", 50000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Joe Bloggs", dba.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("AB1234567C", dba.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, dba.getSalary(), 0.01);
    }
}
