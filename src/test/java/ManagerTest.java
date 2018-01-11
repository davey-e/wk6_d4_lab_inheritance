import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Joe", "AAA", 1000.00, "Finance");
    }

    @Test
    public void getDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }


}
