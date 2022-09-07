import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "PA019278D", 35000.00, "Accountancy");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(37000.00, manager.getSalary(),0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, manager.bonus(),0.00);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Accountancy", manager.getDeptName());
    }
}
