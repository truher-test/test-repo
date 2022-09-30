import static org.junit.Assert.assertEquals;
import org.junit.Test;
import frc.robot.Robot;

public class TestIdentity {
    @Test
    public void testOne() {
        assertEquals("DVS.TPW-1", Robot.identity("DVS.TPW-1"));
        assertEquals("TP-20", Robot.identity("TP-20"));
    }
}
