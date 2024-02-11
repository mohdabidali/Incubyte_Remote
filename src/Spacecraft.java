import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Character, Integer> DIRECTIONS_MAP = new HashMap<>(); // Mapping of direction characters to indices

    static {
        DIRECTIONS_MAP.put('N', 0);
        DIRECTIONS_MAP.put('E', 1);
        DIRECTIONS_MAP.put('S', 2);
        DIRECTIONS_MAP.put('W', 3);
        DIRECTIONS_MAP.put('U', 4);
        DIRECTIONS_MAP.put('D', 5);
    }

    public static Map<String, Integer> controlSpacecraft(Map<String, Integer> initialPosition, char initialDirection, char[] commands) {
        Map<String, Integer> position = new HashMap<>(initialPosition);
        int directionIndex = DIRECTIONS_MAP.get(initialDirection);

        for (char command : commands) {
            try {
                switch (command) {
                    case 'f':
                        position.put("z", position.get("z") + (directionIndex == 4 ? -1 : directionIndex == 5 ? 1 : 0));
                        break;
                    case 'b':
                        position.put("z", position.get("z") - (directionIndex == 4 ? -1 : directionIndex == 5 ? 1 : 0));
                        break;
                    case 'l':
                        directionIndex = (directionIndex + 1) % DIRECTIONS_MAP.size();
                        break;
                    case 'r':
                        directionIndex = (directionIndex - 1 + DIRECTIONS_MAP.size()) % DIRECTIONS_MAP.size();
                        break;
                    case 'u':
                        if (DIRECTIONS_MAP.get(initialDirection) != 'D') {
                            position.put("y", position.get("y") + 1);
                        }
                        break;
                    case 'd':
                        if (DIRECTIONS_MAP.get(initialDirection) != 'U') {
                            position.put("y", position.get("y") - 1);
                        }
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Map<String, Integer> result = new HashMap<>(position);
        result.put("direction", (int) initialDirection); // Store initial direction character

        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> startPosition = new HashMap<>();
        startPosition.put("x", 0);
        startPosition.put("y", 0);
        startPosition.put("z", 0);
        char startDirection = 'N';
        char[] commandList = {'f', 'r', 'u', 'b', 'l'};

        try {
            Map<String, Integer> result = controlSpacecraft(startPosition, startDirection, commandList);
            System.out.println("Final Position: (" + result.get("x") + ", " + result.get("y") + ", " + result.get("z") + ")");
            System.out.println("Final Direction: " + (char) result.get("direction").intValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
