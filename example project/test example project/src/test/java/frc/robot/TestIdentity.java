import static org.junit.Assert.assertEquals;
import org.junit.Test;
import frc.robot.Robot;

public class TestIdentity {
    @Test
    public void testOne() {
        assertEquals("DVS.TPW-1", Robot.identity("DVS.TPW-1"));
        assertEquals("TP-20", Robot.identity("TP-20"));
        assertEquals("PGM.TPT-1", Robot.identity("PGM.TPT-1"));
        assertEquals("PGM.DLP-3", Robot.identity("PGM.DLP-3"));
        assertEquals("PGM.TPT-4", Robot.identity("PGM.TPT-4"));
        assertEquals("PGM.TPW-3", Robot.identity("PGM.TPW-3"));
        assertEquals("PGM.DLP-2", Robot.identity("PGM.DLP-2"));
        assertEquals("pit display", Robot.identity("pit display"));
    }
}