import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "PA019278D", 75000.00, "Big Cheese", 10000000.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(12000.00);
        assertEquals(87000.00, director.getSalary(),0.00);
    }

    @Test
    public void canPayDirectorBonus(){
        assertEquals(1500, director.bonus(),0.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000000, director.getBudget(), 0.00);
    }

    @Test
    public void cantUseNegativeInRaise(){
        assertEquals("Sorry, no bueno! Must raise salary not decrease.", director.raiseSalary(-0.50));
    }

    @Test
    public void canChangeName(){
        director.setName("Jonathon");
        assertEquals("Jonathon", director.getName());
    }
}
