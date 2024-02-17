import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SpaceCraftTest {

    @Test
    public void testInitialPositionAndDirection() {
        SpaceCraft spaceCraft = new SpaceCraft();
        assertArrayEquals(spaceCraft.getPosition(), new int[]{0, 0, 0});
        assertEquals(spaceCraft.getDirection(), 'N');
    }


    // testing moveForward, moveForward
    @Test
    public void testMoveForward() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.moveForward();
        assertArrayEquals(obj.getPosition(), new int[]{0, 1, 0});
    }

    @Test
    public void testMoveBackward() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.moveBackward();
        assertArrayEquals(spaceCraft.getPosition(), new int[]{0, -1, 0});
    }

    // testing turnLeft, turnRight, turnUp, turnDown
    @Test
    public void testTurnLeft() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.turnLeft();
        assertEquals(obj.getDirection(), 'W');
    }

    @Test
    public void testTurnRight() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.turnRight();
        assertEquals(obj.getDirection(), 'E');
    }

    @Test
    public void testTurnUp() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.turnUp();
        assertEquals(spaceCraft.getDirection(), 'U');
    }

    @Test
    public void testTurnDown() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.turnDown();
        assertEquals(spaceCraft.getDirection(), 'D');
    }


    @Test
    public void testTurnLeftFromExtremeDirection() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setDirection('N'); // Facing North
        spaceCraft.turnLeft(); // Try turning left
        // Assert that direction changes to West
        assertEquals(spaceCraft.getDirection(), 'W');
    }

    @Test
    public void testTurnRightFromExtremeDirection() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setDirection('W'); // Facing West
        spaceCraft.turnRight(); // Try turning right
        // Assert that direction changes to North
        assertEquals(spaceCraft.getDirection(), 'N');
    }


    @Test
    public void testInitialDirectionEdgeCase() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setDirection('S');
        assertEquals(obj.getDirection(), 'S');
    }


    @Test
    public void testMoveForwardToMaxX() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setPosition(0, Integer.MAX_VALUE - 1, 0);
        spaceCraft.moveForward();
        // Assert that position remains at the maximum value
        assertArrayEquals(spaceCraft.getPosition(), new int[]{0, Integer.MAX_VALUE, 0});
    }

    @Test
    public void testMoveForwardToMaxY() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setPosition(0, Integer.MAX_VALUE, 0);
        spaceCraft.turnRight();
        spaceCraft.moveForward();
        // Assert that position remains at the maximum value
        assertArrayEquals(spaceCraft.getPosition(), new int[]{1, Integer.MAX_VALUE, 0});
    }

    @Test
    public void testMoveBackwardToMinY() {
        SpaceCraft obj = new SpaceCraft();
        obj.setPosition(0, Integer.MIN_VALUE + 1, 0);
        obj.moveBackward();
        // Assert that position remains at the minimum value
        assertArrayEquals(obj.getPosition(), new int[]{0, Integer.MIN_VALUE, 0});
    }

    @Test
    public void testTurnUpToMaxZ() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setPosition(0, 0, Integer.MAX_VALUE);
        spaceCraft.turnUp();
        // Assert that position remains at the maximum value
        assertArrayEquals(spaceCraft.getPosition(), new int[]{0, 0, Integer.MAX_VALUE});
    }

    @Test
    public void testTurnDownToMinZ() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setPosition(0, 0, Integer.MIN_VALUE );
        spaceCraft.turnDown();
        // Assert that position remains at the minimum value
        assertArrayEquals(spaceCraft.getPosition(), new int[]{0, 0, Integer.MIN_VALUE});
    }

    @Test
    public void testTakeUserInputWithTermination() {
        // Create an instance of Main
        SpaceCraft spaceCraft = new SpaceCraft();

        // Prepare a valid input to terminate the loop
        String terminationInput = "c\n";

        // Concatenate the inputs
        String input = terminationInput;

        // Convert the input to bytes
        InputStream in = new ByteArrayInputStream(input.getBytes());

        // Redirect System.in to the prepared input
        System.setIn(in);

        // Test and verify no exceptions are thrown
        try {
            spaceCraft.takeUserInput();
        } catch (Exception e) {
            fail("No exception should be thrown");
        }

        // Reset System.in to its original value
        System.setIn(System.in);
    }
}
