import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SpaceCraft {
    public static Map<String, Integer> controlSpacecraft(Map<String, Integer> initialPosition, String initialDirection, String[] commands) {
        String[] directions = {"N", "E", "S", "W", "Up", "Down"};
        Map<String, Integer> position = new HashMap<>(initialPosition);
        int directionIndex = Arrays.asList(directions).indexOf(initialDirection);

        for (String command : commands) {
            switch (command) {
                case "f":
                    position.put("z", position.get("z") + (directionIndex == 4 ? -1 : directionIndex == 5 ? 1 : 0));
                    break;
                case "b":
                    position.put("z", position.get("z") - (directionIndex == 4 ? -1 : directionIndex == 5 ? 1 : 0));
                    break;
                case "l":
                    directionIndex = (directionIndex + 1) % directions.length;
                    break;
                case "r":
                    directionIndex = (directionIndex - 1 + directions.length) % directions.length;
                    break;
                case "u":
                    if (!directions[directionIndex].equals("Up")) {
                        position.put("y", position.get("y") + 1);
                    }
                    break;
                case "d":
                    if (!directions[directionIndex].equals("Down")) {
                        position.put("y", position.get("y") - 1);
                    }
                    break;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.putAll(position);
        result.put("direction", directionIndex); // Store direction index

        return result;
    }

    public static void main(String[] args) {
        String[] directions = {"N", "E", "S", "W", "Up", "Down"}; // Declare directions array
        Map<String, Integer> startPosition = new HashMap<>();
        startPosition.put("x", 0);
        startPosition.put("y", 0);
        startPosition.put("z", 0);
        String startDirection = "N";
        String[] commandList = {"f", "r", "u", "b", "l"};

        Map<String, Integer> result = controlSpacecraft(startPosition, startDirection, commandList);
        System.out.println("Final Position: (" + result.get("x") + ", " + result.get("y") + ", " + result.get("z") + ")");
        System.out.println("Final Direction: " + directions[result.get("direction")]);
    }
}
