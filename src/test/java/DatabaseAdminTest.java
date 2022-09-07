import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John", "PA019278D", 35000.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(37000.00, databaseAdmin.getSalary(),0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, databaseAdmin.bonus(),0.00);
    }

}
