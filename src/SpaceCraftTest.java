import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceCraftTest {

    // testing initialized variables (constructors)
    @Test
    public void testInitialPositionAndDirection() {
        SpaceCraft obj = new SpaceCraft();
        assertArrayEquals(obj.getPosition(), new int[]{0, 0, 0});
        assertEquals(obj.getDirection(), 'N');
    }

    // testing moveForward, moveForward
    @Test
    public void testMoveForward() {
        SpaceCraft obj = new SpaceCraft();
        obj.moveForward();
        assertArrayEquals(obj.getPosition(), new int[]{0, 1, 0});
    }

    @Test
    public void testMoveBackward() {
        SpaceCraft obj = new SpaceCraft();
        obj.moveBackward();
        assertArrayEquals(obj.getPosition(), new int[]{0, -1, 0});
    }

    // testing turnLeft, turnRight, turnUp, turnDown
    @Test
    public void testTurnLeft() {
        SpaceCraft obj = new SpaceCraft();
        obj.turnLeft();
        assertEquals(obj.getDirection(), 'W');
    }

    @Test
    public void testTurnRight() {
        SpaceCraft obj = new SpaceCraft();
        obj.turnRight();
        assertEquals(obj.getDirection(), 'E');
    }

    @Test
    public void testTurnUp() {
        SpaceCraft obj = new SpaceCraft();
        obj.turnUp();
        assertEquals(obj.getDirection(), 'U');
    }

    @Test
    public void testTurnDown() {
        SpaceCraft obj = new SpaceCraft();
        obj.turnDown();
        assertEquals(obj.getDirection(), 'D');
    }
}
