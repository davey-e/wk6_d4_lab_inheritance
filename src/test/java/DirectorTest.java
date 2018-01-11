import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Joe Bloggs", "AB1234567C", 50000.00, "Finance", 100_000.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(100_000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, director.payBonus(), 0.01);
    }

}
