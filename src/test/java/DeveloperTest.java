import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", "PA019278D", 35000.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(37000.00, developer.getSalary(),0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, developer.bonus(),0.00);
    }
}
