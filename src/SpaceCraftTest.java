import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SpaceCraftTest {

    @Test
    public void testStartPositionAndDirection() {
        Map<String, Integer> initialPosition = new HashMap<>();
        initialPosition.put("x", 0);
        initialPosition.put("y", 0);
        initialPosition.put("z", 0);
        char initialDirection = 'N';
        char[] commands = {}; // No commands

        Map<String, Integer> result = Main.controlSpacecraft(initialPosition, initialDirection, commands);

        assertEquals(0, (int) result.get("x"));
        assertEquals(0, (int) result.get("y"));
        assertEquals(0, (int) result.get("z"));
        assertEquals(78, (int) result.get("direction")); // 'N' in ASCII
    }

    @Test
    public void testMoveForward() {
        Map<String, Integer> initialPosition = new HashMap<>();
        initialPosition.put("x", 0);
        initialPosition.put("y", 0);
        initialPosition.put("z", 0);
        char initialDirection = 'N';
        char[] commands = {'f'}; // Move forward command
        Map<String, Integer> expectedPosition = new HashMap<>(initialPosition);
        expectedPosition.put("z", initialPosition.get("z") + (initialDirection == 'U' ? 1 : initialDirection == 'D' ? -1 : 0)); // Expected z-coordinate after moving forward
        Map<String, Integer> result = Main.controlSpacecraft(initialPosition, initialDirection, commands);
        assertEquals(expectedPosition.get("x"), result.get("x"));
        assertEquals(expectedPosition.get("y"), result.get("y"));
        assertEquals(expectedPosition.get("z"), result.get("z"));
    }


    @Test
    public void testTurnLeft() {
        Map<String, Integer> initialPosition = new HashMap<>();
        initialPosition.put("x", 0);
        initialPosition.put("y", 0);
        initialPosition.put("z", 0);
        char initialDirection = 'N';
        char[] commands = {'l'}; // Turn left command
        Map<String, Integer> expectedPosition = new HashMap<>(initialPosition);
        expectedPosition.put("z", initialPosition.get("z"));
        Map<String, Integer> result = Main.controlSpacecraft(initialPosition, initialDirection, commands);
        assertEquals(expectedPosition.get("x"), result.get("x"));
        assertEquals(expectedPosition.get("y"), result.get("y"));
        assertEquals(expectedPosition.get("z"), result.get("z"));
    }

    @Test
    public void testMoveBackward() {
        Map<String, Integer> initialPosition = new HashMap<>();
        initialPosition.put("x", 0);
        initialPosition.put("y", 0);
        initialPosition.put("z", 0);
        char initialDirection = 'N';
        char[] commands = {'b'}; // Move backward command
        Map<String, Integer> expectedPosition = new HashMap<>(initialPosition);
        expectedPosition.put("z", initialPosition.get("z") - (initialDirection == 'U' ? -1 : initialDirection == 'D' ? 1 : 0)); // Expected z-coordinate after moving backward
        Map<String, Integer> result = Main.controlSpacecraft(initialPosition, initialDirection, commands);
        assertEquals(expectedPosition.get("x"), result.get("x"));
        assertEquals(expectedPosition.get("y"), result.get("y"));
        assertEquals(expectedPosition.get("z"), result.get("z"));
    }

    @Test
    public void testTurnUp() {
        Map<String, Integer> initialPosition = new HashMap<>();
        initialPosition.put("x", 0);
        initialPosition.put("y", 0);
        initialPosition.put("z", 0);
        char initialDirection = 'N';
        char[] commands = {'u'}; // Turn up command
        Map<String, Integer> expectedPosition = new HashMap<>(initialPosition);
        expectedPosition.put("y", initialPosition.get("y") + 1); // Expected y-coordinate after turning up
        Map<String, Integer> result = Main.controlSpacecraft(initialPosition, initialDirection, commands);
        assertEquals(expectedPosition.get("x"), result.get("x"));
        assertEquals(expectedPosition.get("y"), result.get("y"));
        assertEquals(expectedPosition.get("z"), result.get("z"));
    }

    @Test
    public void testTurnDown() {
        Map<String, Integer> initialPosition = new HashMap<>();
        initialPosition.put("x", 0);
        initialPosition.put("y", 0);
        initialPosition.put("z", 0);
        char initialDirection = 'N';
        char[] commands = {'d'}; // Turn down command
        Map<String, Integer> expectedPosition = new HashMap<>(initialPosition);
        expectedPosition.put("y", initialPosition.get("y") - 1); // Expected y-coordinate after turning down
        Map<String, Integer> result = Main.controlSpacecraft(initialPosition, initialDirection, commands);
        assertEquals(expectedPosition.get("x"), result.get("x"));
        assertEquals(expectedPosition.get("y"), result.get("y"));
        assertEquals(expectedPosition.get("z"), result.get("z"));
    }


}
