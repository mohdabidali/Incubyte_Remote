public class Main {
    private int x;
    private int y;
    private int z;
    private String direction;

    public Main(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
            case "Up":
                z++;
                break;
            case "Down":
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "E":
                x--;
                break;
            case "W":
                x++;
                break;
            case "Up":
                z--;
                break;
            case "Down":
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void turnUp() {
        switch (direction) {
            case "N":
            case "E":
                direction = "Up";
                break;
            case "S":
            case "W":
                direction = "Down";
                break;
        }
    }

    public void turnDown() {
        switch (direction) {
            case "N":
            case "E":
                direction = "Down";
                break;
            case "S":
            case "W":
                direction = "Up";
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getDirection() {
        return direction;
    }

    public static void executeCommands(Main spacecraft, char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    spacecraft.moveForward();
                    break;
                case 'b':
                    spacecraft.moveBackward();
                    break;
                case 'l':
                    spacecraft.turnLeft();
                    break;
                case 'r':
                    spacecraft.turnRight();
                    break;
                case 'u':
                    spacecraft.turnUp();
                    break;
                case 'd':
                    spacecraft.turnDown();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int startX = 0;
        int startY = 0;
        int startZ = 0;
        String startDirection = "N";
        char[] commands = {'f', 'r', 'u', 'b', 'l'};

        Main chandrayaan3 = new Main(startX, startY, startZ, startDirection);
        executeCommands(chandrayaan3, commands);

        System.out.println("Final Position: (" + chandrayaan3.getX() + ", " + chandrayaan3.getY() + ", " + chandrayaan3.getZ() + ")");
        System.out.println("Final Direction: " + chandrayaan3.getDirection());
    }
}

