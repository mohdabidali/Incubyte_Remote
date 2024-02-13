import java.util.ArrayList;
import java.util.Scanner;

public class SpaceCraft {
    private int[] position = new int[]{0, 0, 0};
    private char direction = 'N';

    // Implementing getters & setters
    public int[] getPosition() {
        return position;
    }

    public char getDirection() {
        return direction;
    }

    public void setPosition(int x, int y, int z) {
        position[0] = x;
        position[1] = y;
        position[2] = z;
    }

    public void setDirection(char dir) {
        direction = dir;
    }
    // getters and setters completed

    public void moveForward() {
        // Implement forward movement
        int x = position[0], y = position[1], z = position[2];
        switch (direction) {
            case 'N':
                position[1]++;
                break;
            case 'S':
                position[1]--;
                break;
            case 'E':
                position[0]++;
                break;
            case 'W':
                position[0]--;
                break;
            case 'U':
                position[2]++;
                break;
            case 'D':
                position[2]--;
                break;
        }
    }

    public void moveBackward() {
        // Implement backward movement
        int x = position[0], y = position[1], z = position[2];
        switch (direction) {
            case 'N':
                position[1]--;
                break;
            case 'S':
                position[1]++;
                break;
            case 'E':
                position[0]--;
                break;
            case 'W':
                position[0]++;
                break;
            case 'U':
                position[2]--;
                break;
            case 'D':
                position[2]++;
                break;
        }
    }

    public void turnLeft() {
        // Implement left turn
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'U':
                direction = 'N';
                break;
            case 'D':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        // Implement right turn
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'U':
                direction = 'S';
                break;
            case 'D':
                direction = 'N';
                break;
        }
    }

    public void turnUp() {
        // Implement up turn
        direction = 'U';
    }

    public void turnDown() {
        // Implement down turn
        direction = 'D';
    }

    public void takeUserInput() {
        // initializing variables
        String ch;
        ArrayList<String> inputList = new ArrayList<>();

        // while user-input is not 'cc or 'C', take user input
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter input (f, b, l, r, u, d) or end input (c/C): ");
                ch = scanner.nextLine();

                // checking if user input is valid or not
                // if invalid, then we do not append it to the inputList
                // if input is 'c' or 'C', then we do not append it to the inputList
                if ("fbldruc".contains(ch.toLowerCase())) {
                    inputList.add(ch);
                }
                if (ch.equalsIgnoreCase("c")) {
                    break;
                }
            }
        }

        // iterating inputList elements via element variable, one by one
        for (String element : inputList) {
            switch (element) {
                case "f":
                    moveForward();
                    break;
                case "b":
                    moveBackward();
                    break;
                case "l":
                    turnLeft();
                    break;
                case "r":
                    turnRight();
                    break;
                case "u":
                    turnUp();
                    break;
                case "d":
                    turnDown();
                    break;
                default:
                    System.out.println("Unknown element in inputList: " + element);
            }
        }

        // printing final output
        System.out.println("Final Position: " + position[0] + ", " + position[1] + ", " + position[2]);
        System.out.println("Final Direction: " + direction);
    }

    public static void main(String[] args) {
        SpaceCraft  spaceCraft = new SpaceCraft();
        spaceCraft.takeUserInput();
    }
}
