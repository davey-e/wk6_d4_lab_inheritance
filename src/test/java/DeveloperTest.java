import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void before(){
        dev = new Developer("Joe Bloggs", "AB1234567C", 50000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Joe Bloggs", dev.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("AB1234567C", dev.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, dev.getSalary(), 0.01);
    }
}
